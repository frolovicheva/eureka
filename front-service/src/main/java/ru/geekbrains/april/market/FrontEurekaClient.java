package ru.geekbrains.april.market;

import com.flamexander.cloud.common.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient("products-client")
public interface FrontEurekaClient {
    @GetMapping("/find_all_products")
    public List<ProductDTO> getAllProducts();


}
