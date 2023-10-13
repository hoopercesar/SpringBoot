package com.hooperdevelopments.crud.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/products")
public class ProductController {

    @GetMapping
    public List<Product> getProducts() {
        return List.of(
                new Product(
                        2541L,
                        "Laptop V32",
                        500,
                        LocalDate.of(2010, 6, 21),
                        2
                ));
    }
}
