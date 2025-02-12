package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "objetivo_unidad")
public class ObjetivoUnidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObjetivoUnidad;

    @Lob
    @Column(name = "objetivo_unidad", columnDefinition = "LONGTEXT")
    private String objetivo_unidad;

    //@ManyToOne
    @JoinColumn(name = "id_unidad")
    private Long id_unidad;



    // Getters and setters
}

