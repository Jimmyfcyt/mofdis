package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArea;

    @Column(name = "Nombre")
    //@Pattern(regexp = "^[a-zA-Z]+$", message = "El nombre solo puede contener letras.")
    private String nombre;

    //@ManyToOne
    @JoinColumn(name = "id_superior")
    private Long id_superior;

    //@ManyToOne
    @JoinColumn(name = "id_unidad")
    private Long id_unidad;

    @Lob
    @Column(name = "Comentario", columnDefinition = "LONGTEXT")
    private String comentario;

    @Column(name = "Funcional_Staff")
    private String funcionalStaff;

    // Getters and setters
}