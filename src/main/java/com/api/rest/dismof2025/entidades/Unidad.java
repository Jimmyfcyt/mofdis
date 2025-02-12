package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;
    @Entity
    @Table(name = "unidad")
    public class Unidad {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idUnidad;

        @Column(name = "Nombre")
        //@Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre solo puede contener letras.")
        private String nombre;

}
