package com.example.sistemaElectoralFinal.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="candidatos")
public class Candidatos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long id;

    public String region;

    public String candidato;
}
