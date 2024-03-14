package com.example.sistemaElectoralFinal.repository;

import com.example.sistemaElectoralFinal.models.Candidatos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatosRepository extends JpaRepository<Candidatos, Long>{
}
