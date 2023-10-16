package com.hooperdevelopment.crudDos.product;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {
        return List.of(
                new Product(
                        2341L,
                        "Laptop V32 MAC",
                        600,
                        LocalDate.of(2010, 6, 21),
                        2
                ));
    }
}
