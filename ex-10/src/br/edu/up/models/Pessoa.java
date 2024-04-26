package br.edu.up.models;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public String getStatusIdade() {
        if (idade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}
