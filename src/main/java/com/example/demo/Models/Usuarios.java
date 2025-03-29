package com.example.demo.Models;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public class Usuarios {

    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;

    @CPF(message = "CPF inválido")
    private String cpf;

    public Usuarios() {}

    public Usuarios(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
