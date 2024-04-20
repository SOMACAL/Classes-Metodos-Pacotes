package br.edu.up.models;

public class LojaMcA {

    private double valorCompra;

    public LojaMcA(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double calcularValorPrestacao() {
        return valorCompra / 5;
    }
}
