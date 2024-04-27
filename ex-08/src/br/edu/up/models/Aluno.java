package br.edu.up.models;

public class Aluno {
    private String nome;
    private double[] notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new double[3];
    }

    public void adicionarNota(double nota, int indice) {
        this.notas[indice] = nota;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String obterMencao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else if (media <= 5) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }

    public String getNome() {
        return nome;
    }
}
