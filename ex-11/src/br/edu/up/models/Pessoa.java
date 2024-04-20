package br.edu.up.models;

public class Pessoa {
    private String nome;
    private char sexo; // 'M' para masculino, 'F' para feminino

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getSexoString() {
        return (sexo == 'M') ? "Homem" : "Mulher";
    }
}
