package ru.geekbrains.april.market.controllers;


import com.flamexander.cloud.common.ProductDTO;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.april.market.ProductsEurekaClient;
import ru.geekbrains.april.market.models.Product;
import ru.geekbrains.april.market.services.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductsController implements ProductsEurekaClient {
    private final ProductService productService;
    private final EurekaClient eurekaClient;

    @Override
    @GetMapping("/find_all_products")
    public List<ProductDTO> getAllProducts() {
        List<Product> dbProducts = productService.findAll();
        List <ProductDTO> dtoProducts = new ArrayList<> ();
        for (Product p:dbProducts) {
            ProductDTO dto = new ProductDTO ();
            dto.setId (p.getId ());
            dto.setTitle (p.getTitle ());
            dto.setPrice (p.getPrice ());
            dtoProducts.add (dto);
        }
        return dtoProducts;
    }
}


