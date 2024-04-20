package br.edu.up.models;

public class Funcionario {
    private String nome;
    private double salario;
    private double salarioMinimo;

    public Funcionario(String nome, double salario, double salarioMinimo) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public double calcularReajuste() {
        double novoSalario = salario + (salario * 0.1); // Aumento de 10%
        return novoSalario;
    }

    public double calcularAumentoFolha() {
        double aumento = calcularReajuste() - salario;
        return aumento;
    }
}
