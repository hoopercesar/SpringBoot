package com.example.sistemaElectoralFinal.services;

import com.example.sistemaElectoralFinal.models.Electores;
import com.example.sistemaElectoralFinal.repository.ElectoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectoresServices {

    @Autowired
    ElectoresRepository electoresRepository;

    public void saveElector(Electores elector) {
        electoresRepository.save(elector);
    }

    public List<Electores> getElectores() {
        return electoresRepository.findAll();
    }





}
