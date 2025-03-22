package com.example.demo.controllers;

import com.example.demo.Models.Usuarios;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/podepa")
public class controller {


    private List<Usuarios> usuarios = new ArrayList<>();

    // Endpoint para listar usuários
    @GetMapping
    public List<Usuarios> listarUsuarios() {
        return usuarios;
    }

    // Endpoint para adicionar um novo usuário
    @PostMapping
        public Usuarios adicionarUsuario(@RequestBody Usuarios usuario) {
        usuarios.add(usuario);
        return usuario;
    }

}