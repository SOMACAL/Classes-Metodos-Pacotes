package br.edu.up.models;

public class Vendedor {
    private String nome;
    private double salarioFixo;
    private double vendas;

    public Vendedor(String nome, double salarioFixo, double vendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalarioFinal() {
        double comissao = vendas * 0.15;
        return salarioFixo + comissao;
    }
}
