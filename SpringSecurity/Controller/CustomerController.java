package com.example.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(path="v1")
@RestController
public class CustomerController {
    @GetMapping(path="/index")
    public String index() {
        return "Hola, mundo";
    }
    @GetMapping(path="/index2")
    public String index2() {
        return "Non Secure Hola Mundo";
    }
}
