package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
    @Table(name = "unidad")
    public class Unidad {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idUnidad;

        @Column(name = "Nombre")
        //@Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre solo puede contener letras.")
        private String nombre;

        @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
        @JoinTable(name = "unidad_funcion",
                joinColumns = @JoinColumn(name = "id_cargo_id"),
                inverseJoinColumns = @JoinColumn(name = "id_funcion"))
        private Set<FuncionUnidad> funcionesunidades = new HashSet<>();

}
