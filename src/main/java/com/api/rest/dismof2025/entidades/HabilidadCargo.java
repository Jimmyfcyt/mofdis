package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "habilidad_cargo")
public class HabilidadCargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHabilidadCargo;

    @Lob
    @Column(name = "habilidad", columnDefinition = "LONGTEXT")
    private String habilidad;

    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;



    // Getters and setters
}

