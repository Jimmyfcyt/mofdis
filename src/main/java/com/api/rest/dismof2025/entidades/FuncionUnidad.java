package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "funcion_unidad")
public class FuncionUnidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFuncionUnidad;

    @Lob
    @Column(name = "funcion_unidad", columnDefinition = "LONGTEXT")
    private String funcion_unidad;

    //@ManyToOne
    @JoinColumn(name = "id_unidad")
    private Long id_unidad;



    // Getters and setters
}

