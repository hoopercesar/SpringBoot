package com.example.sistemaElectoralFinal.services;

import com.example.sistemaElectoralFinal.models.RegionesComunas;
import com.example.sistemaElectoralFinal.repository.RegionesComunasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionesComunasServices {

    @Autowired
    RegionesComunasRepository regionesComunasRepository;

    public List<RegionesComunas> getRegionesComunas() {
        return regionesComunasRepository.findAll();
    }
}
