package com.example.sistemaElectoralFinal.repository;

import com.example.sistemaElectoralFinal.models.RegionesComunas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionesComunasRepository extends JpaRepository<RegionesComunas, Long> {
}
