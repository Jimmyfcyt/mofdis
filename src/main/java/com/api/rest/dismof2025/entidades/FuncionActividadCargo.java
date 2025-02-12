package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;
import org.hibernate.mapping.Set;

@Entity
@Table(name = "funcion_actividad_cargo")
public class FuncionActividadCargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfuncionActividadCargo;

    @Lob
    @Column(name = "funcion_actividad_cargo", columnDefinition = "LONGTEXT")
    private String funcion_actividad_cargo;

    //@ManyToOne
    @JoinColumn(name = "id_cargo")
    private Long id_cargo;



    // Getters and setters
}

