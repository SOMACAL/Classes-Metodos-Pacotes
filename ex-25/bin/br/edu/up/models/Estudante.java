package br.edu.up.models;

public class Estudante {
    private String nome;
    private int numeroMatricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudante(String nome, int numeroMatricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double calcularNotaFinal() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public String classificarEstudante() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8) {
            return "A";
        } else if (notaFinal >= 7) {
            return "B";
        } else if (notaFinal >= 6) {
            return "C";
        } else if (notaFinal >= 5) {
            return "D";
        } else {
            return "R";
        }
    }
}
