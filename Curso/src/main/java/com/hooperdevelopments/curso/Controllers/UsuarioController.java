package com.hooperdevelopments.curso.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
public class UsuarioController {

    @RequestMapping(value = "prueba")
    public List<String> prueba(){
        return List.of(
                "mame",
                "oggy",
                "magfre"
        );
    }
}
