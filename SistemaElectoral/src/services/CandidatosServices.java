package com.example.sistemaElectoralFinal.services;

import com.example.sistemaElectoralFinal.models.Candidatos;
import com.example.sistemaElectoralFinal.repository.CandidatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatosServices {

    @Autowired
    CandidatosRepository candidatosRepository;

    public List<Candidatos> getCandidatos() {
        return candidatosRepository.findAll();
    }
}
