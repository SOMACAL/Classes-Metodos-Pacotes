package br.edu.up.models;

public class Pessoa {
    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public Pessoa(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public double calcularPesoIdeal() {
        double pesoIdeal;
        if (sexo == 'M') {
            if (altura <= 1.70) {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade >= 21 && idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.7 * altura) - 58;
                }
            }
        } else { // Sexo feminino
            if (altura <= 1.50) {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 44.7;
                }
            } else {
                pesoIdeal = (62.1 * altura) - 45;
            }
        }
        return pesoIdeal;
    }
}
