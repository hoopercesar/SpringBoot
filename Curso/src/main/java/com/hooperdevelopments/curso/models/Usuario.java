package com.hooperdevelopments.curso.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="usuarios")
@ToString @EqualsAndHashCode
public class Usuario {
    @Column(name="nombre")
    private String nombre;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="apellido")
    private String apellido;
    @Column(name="email")
    private String email;
    @Column(name="telefono")
    private String telefono;
    @Column(name="password")
    private String password;


}
