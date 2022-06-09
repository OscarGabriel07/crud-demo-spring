package com.crud.democrud.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rol")
public class RolUsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rol_usuario_id", nullable = false)
    @JsonBackReference
    private UsuarioModel usuarioModel;

    @Column(length = 40, nullable = false)
    private String rol;

    public RolUsuarioModel(){

    }

    public RolUsuarioModel(UsuarioModel usuarioModel, String rol) {
        this.usuarioModel = usuarioModel;
        this.rol = rol;
    }
}
