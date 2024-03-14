package com.example.sistemaElectoralFinal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="datos_votaciones")
public class VotoEmitido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Long id;

    public String nombre;

    public String region;

    public String comuna;

    public String rut;


}
