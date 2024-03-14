package com.example.sistemaElectoralFinal.controllers;

import com.example.sistemaElectoralFinal.models.Electores;
import com.example.sistemaElectoralFinal.services.ElectoresServices;
import com.example.sistemaElectoralFinal.services.VotoEmitidoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/electores")
@CrossOrigin(origins="http://localhost:5173")
public class ElectoresController {

    @Autowired
    private ElectoresServices electoresServices;

    @Autowired
    private VotoEmitidoServices votoEmitidoServices;


    @PostMapping
    @Transactional
    public Object saveElectores(@RequestBody Electores elector) {
        try {
            electoresServices.saveElector(elector);
            return ResponseEntity.ok(votoEmitidoServices.getRutElector(elector));
        } catch (DataIntegrityViolationException e ){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("El rut del elector ya existe en la base de datos");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar la solicitud");
        }

    }

}
