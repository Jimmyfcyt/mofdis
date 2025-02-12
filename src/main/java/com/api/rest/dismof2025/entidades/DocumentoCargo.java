package com.api.rest.dismof2025.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "documento_cargo")
public class DocumentoCargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDocumentoCargo;

    @Lob
    @Column(name = "documento", columnDefinition = "LONGTEXT")
    private String documento;

    //@ManyToOne
    @JoinColumn(name = "id_cargo")
    private Long id_cargo;



    // Getters and setters
}

