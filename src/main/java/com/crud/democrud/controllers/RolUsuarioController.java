package com.crud.democrud.controllers;

import com.crud.democrud.models.RolUsuarioModel;
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.services.RolUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/rol")
public class RolUsuarioController {
    @Autowired
    RolUsuarioService rolUsuarioService;

    @GetMapping()
    public ArrayList<RolUsuarioModel> obtenerRoles(){
        return rolUsuarioService.obtenerRoles();
    }

    @PostMapping(path = "/{id}")
    public RolUsuarioModel guardarRoles(@RequestBody RolUsuarioModel rolUsuarioModel, UsuarioModel usuarioModel){
        rolUsuarioModel.setUsuarioModel(usuarioModel);
        return this.rolUsuarioService.guardarRol(rolUsuarioModel, usuarioModel);
    }
}
