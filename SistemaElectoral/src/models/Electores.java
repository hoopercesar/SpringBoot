package com.example.sistemaElectoralFinal.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="datos_votaciones")
public class Electores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    private String correo;

    //@Column(name="rut", unique = true, nullable = false)
    private String rut;

    private String region;

    private String comuna;

    private String candidato;

    private String informacion;
}
