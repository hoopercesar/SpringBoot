package com.example.sistemaElectoralFinal.controllers;

import com.example.sistemaElectoralFinal.models.RegionesComunas;
import com.example.sistemaElectoralFinal.services.RegionesComunasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/regiones")
@CrossOrigin(origins="http://localhost:5173")
public class RegionesComunasController {

    @Autowired
    RegionesComunasServices regionesComunasServices;

    @GetMapping
    public List<RegionesComunas> getAll() {
        return regionesComunasServices.getRegionesComunas();
    }
}
