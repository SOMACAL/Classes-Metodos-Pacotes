package br.edu.up.models;

public class Cliente {
    private String nome;
    private int idade;
    private String grupoRisco;

    public Cliente(String nome, int idade, String grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String obterCategoria() {
        if (idade >= 17 && idade <= 20) {
            return grupoRisco.equals("Baixo") ? "1" : grupoRisco.equals("Médio") ? "2" : "3";
        } else if (idade >= 21 && idade <= 24) {
            return grupoRisco.equals("Baixo") ? "2" : grupoRisco.equals("Médio") ? "3" : "4";
        } else if (idade >= 25 && idade <= 34) {
            return grupoRisco.equals("Baixo") ? "3" : grupoRisco.equals("Médio") ? "4" : "5";
        } else if (idade >= 35 && idade <= 64) {
            return grupoRisco.equals("Baixo") ? "4" : grupoRisco.equals("Médio") ? "5" : "6";
        } else if (idade >= 65 && idade <= 70) {
            return grupoRisco.equals("Baixo") ? "7" : grupoRisco.equals("Médio") ? "8" : "9";
        } else {
            return "Não se enquadra em nenhuma categoria";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getGrupoRisco() {
        return grupoRisco;
    }
}