package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "otro_conocimiento_cargo")
public class OtroConocimientoCargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOtroConocimientoCargo;

    @Lob
    @Column(name = "otro_conocimiento", columnDefinition = "LONGTEXT")
    private String otro_conocimiento_cargo;

    //@ManyToOne
    @JoinColumn(name = "id_unidad")
    private Long id_unidad;



    // Getters and setters
}

