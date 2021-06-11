package ru.geekbrains.april.market;

import com.flamexander.cloud.common.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProductsEurekaClient {
    @GetMapping("/find_all_products")
    public List<ProductDTO> getAllProducts();
}
