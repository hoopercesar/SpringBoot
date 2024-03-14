package com.example.sistemaElectoralFinal.services;

import com.example.sistemaElectoralFinal.models.Electores;
import com.example.sistemaElectoralFinal.models.VotoEmitido;
import com.example.sistemaElectoralFinal.repository.ElectoresRepository;
import com.example.sistemaElectoralFinal.repository.VotoEmitidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class VotoEmitidoServices {

    @Autowired
    VotoEmitidoRepository votoEmitidoRepository;

    @Autowired
    private ElectoresRepository electoresRepository;

    public List<VotoEmitido> getVotoEmitido() {
        return votoEmitidoRepository.findAll();
    }

    @GetMapping("/confirma")
    public Object getRutElector(Electores elector) {
        System.out.println(elector.getRut());
        return votoEmitidoRepository.findByRut(elector.getRut());
    }
}
