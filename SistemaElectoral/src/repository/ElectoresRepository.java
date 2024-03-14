package com.example.sistemaElectoralFinal.repository;

import com.example.sistemaElectoralFinal.models.Electores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectoresRepository extends JpaRepository<Electores, Long>{
}
