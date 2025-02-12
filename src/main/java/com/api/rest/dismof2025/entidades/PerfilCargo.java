package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "perfil_cargo")
public class PerfilCargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerfilCargo;

    @Lob
    @Column(name = "perfil_cargo", columnDefinition = "LONGTEXT")
    private String perfil_cargo;

    //@ManyToOne
    @JoinColumn(name = "id_cargo")
    private Long id_cargo;



    // Getters and setters
}

