package com.ariel.appweb;

import jakarta.persistence.*;

@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private boolean completado;

    public Long getId() { return id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public boolean isCompletado() { return completado; }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}