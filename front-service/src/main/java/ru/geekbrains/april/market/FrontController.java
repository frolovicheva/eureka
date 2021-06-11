package ru.geekbrains.april.market;


import com.flamexander.cloud.common.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;



@RestController
@RequiredArgsConstructor

public class FrontController {
    private final FrontEurekaClient frontEurekaClient;

    /*
    * По моей логике:
    * - модуль Products отвечает за взаимодействие с БД,
    * - модуль Front через Эврику получает лист ДТОпродуктов от Products.

    * * Эту часть надо довести до ума..*/
    @RequestMapping("/api/v1/products") // TODO: 11.06.2021
    public Page<ProductDTO> getAllProducts(@RequestParam(name = "p", defaultValue = "1") int page) {
        Page<ProductDTO> dtoPage = (Page<ProductDTO>) frontEurekaClient.getAllProducts ();
        return dtoPage;
    }
}
