package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "responsabilidad_cargo")
public class ResponsabilidadCargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResponsabilidadCargo;

    @Lob
    @Column(name = "responsabilidad", columnDefinition = "LONGTEXT")
    private String responsabilidad;

    //@ManyToOne
    @JoinColumn(name = "id_cargo")
    private Long id_cargo;



    // Getters and setters
}

