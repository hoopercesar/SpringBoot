package com.hooperdevelopment.crudDos.product;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;
    private int price;
    private LocalDate fecha;
    @Transient
    private int antiguedad;

    public Product() {
    }

    public Product(Long id, String name, int price, LocalDate fecha)  {
        this.id = id;
        this.name = name;
        this.price = price;
        this.fecha = fecha;

    }

    public Product(String name, int price, LocalDate fecha) {
        this.name = name;
        this.price = price;
        this.fecha = fecha;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getAntiguedad() {

        return Period.between(this.fecha, LocalDate.now()).getYears();
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

}
