package com.crud.democrud.services;

import com.crud.democrud.models.RolUsuarioModel;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.repositories.RolUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RolUsuarioService {
    @Autowired
    RolUsuarioRepository rolUsuarioRepository;

    public ArrayList<RolUsuarioModel> obtenerRoles(){
        return (ArrayList<RolUsuarioModel>) rolUsuarioRepository.findAll();
    }

    public RolUsuarioModel guardarRol(RolUsuarioModel rolUsuarioModel, UsuarioModel usuarioModel){
            return rolUsuarioRepository.save(rolUsuarioModel);
    }
}
