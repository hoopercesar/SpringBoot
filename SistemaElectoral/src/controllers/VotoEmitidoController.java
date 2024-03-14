package com.example.sistemaElectoralFinal.controllers;

import com.example.sistemaElectoralFinal.models.Electores;
import com.example.sistemaElectoralFinal.models.VotoEmitido;
import com.example.sistemaElectoralFinal.services.ElectoresServices;
import com.example.sistemaElectoralFinal.services.VotoEmitidoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/votoemitido")
@CrossOrigin("http://localhost:5173")
public class VotoEmitidoController {
    @Autowired
    private VotoEmitidoServices votoEmitidoServices;

    @GetMapping
    public Object getVotoEmitidoByRut() {

        return votoEmitidoServices.getVotoEmitido();
    }

}
