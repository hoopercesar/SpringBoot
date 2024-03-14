package com.example.sistemaElectoralFinal.controllers;

import com.example.sistemaElectoralFinal.models.Candidatos;
import com.example.sistemaElectoralFinal.services.CandidatosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/candidatos")
@CrossOrigin(origins="http://localhost:5173")
public class CandidatosController {

    @Autowired
    CandidatosServices candidatosServices;

    @GetMapping
    public List<Candidatos> getAll() {
        return candidatosServices.getCandidatos();
    }
}
