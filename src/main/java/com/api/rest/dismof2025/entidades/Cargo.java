package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cargo")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCargo;

    @Column(name = "Nombre")
    //@Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre solo puede contener letras.")
    private String nombre;

    @OneToMany(mappedBy = "cargo")
    private List<HabilidadCargo> habilidadCargos;
//    @ManyToOne


    @JoinColumn(name = "id_area")
    private Long id_area;



    // Getters and setters
}