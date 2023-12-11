package com.hooperdevelopment.electoralSytem.controllers;

import com.hooperdevelopment.electoralSytem.models.Elector;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectorController {

    @RequestMapping(value = "prueba")
    public Elector elector() {
        Elector elector = new Elector();
        elector.setNombre("moncho");
        elector.setCorreo("moncho@correo.com");
        elector.setRut("47855748-5");
        elector.setRegion("bio bio");
        elector.setComuna("concepción");
        elector.setCandidato("candidato 0");
        elector.setInformacion("ABCD");

        return elector;
    }
}
