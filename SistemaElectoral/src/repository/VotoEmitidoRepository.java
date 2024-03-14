package com.example.sistemaElectoralFinal.repository;

import com.example.sistemaElectoralFinal.models.Electores;
import com.example.sistemaElectoralFinal.models.VotoEmitido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VotoEmitidoRepository extends JpaRepository<VotoEmitido, Long> {

    List<VotoEmitido> findByRut(String rut);

}
