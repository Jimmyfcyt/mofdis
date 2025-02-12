package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCargo;

    @Column(name = "Nombre")
    //@Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre solo puede contener letras.")
    private String nombre;

    //@ManyToOne
    @JoinColumn(name = "id_area")
    private Long id_area;



    // Getters and setters
}