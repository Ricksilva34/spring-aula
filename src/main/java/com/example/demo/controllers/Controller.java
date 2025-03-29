package com.example.demo.controllers;

import com.example.demo.Models.Aluno;
import com.example.demo.Models.Professor;
import com.example.demo.Models.Usuarios;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class Controller {
    private final List<Usuarios> usuarios = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Usuarios>> listarUsuarios() {
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/alunos")
    public ResponseEntity<List<Aluno>> listarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        for (Usuarios usuario : usuarios) {
            if (usuario instanceof Aluno) {
                alunos.add((Aluno) usuario);
            }
        }
        return ResponseEntity.ok(alunos);
    }

    @GetMapping("/professores")
    public ResponseEntity<List<Professor>> listarProfessores() {
        List<Professor> professores = new ArrayList<>();
        for (Usuarios usuario : usuarios) {
            if (usuario instanceof Professor) {
                professores.add((Professor) usuario);
            }
        }
        return ResponseEntity.ok(professores);
    }

    @PostMapping
    public ResponseEntity<Usuarios> adicionarUsuario(@Valid @RequestBody Usuarios usuario) {
        usuarios.add(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/aluno")
    public ResponseEntity<Aluno> adicionarAluno(@Valid @RequestBody Aluno aluno) {
        usuarios.add(aluno);
        return ResponseEntity.ok(aluno);
    }

    @PostMapping("/professor")
    public ResponseEntity<Professor> adicionarProfessor(@Valid @RequestBody Professor professor) {
        usuarios.add(professor);
        return ResponseEntity.ok(professor);
    }
}
