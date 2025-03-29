package com.example.demo.Models;

public class Aluno extends Usuarios {

    // Construtor
    public Aluno() {
        super();  // Chama o construtor da classe pai (Usuarios)
    }

    public Aluno(String nome, String cpf) {
        super(nome, cpf); // Chama o construtor da classe pai (Usuarios)
    }
}
