package com.hooperdevelopments.curso.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String apellido;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String telefono;
    @Getter @Setter
    private String password;


}
