package com.example.sistemaElectoralFinal.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="regionescomunas")
public class RegionesComunas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;

    private String region;

    private String comuna;

}
