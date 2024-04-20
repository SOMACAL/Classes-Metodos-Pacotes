package br.edu.up.models;
public class CustoCarro {
    private double custoFabrica;

    public CustoCarro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularImpostos() {
        return custoFabrica * 0.45;
    }

    public double calcularCustoDistribuidor() {
        return (custoFabrica + calcularImpostos()) * 0.28;
    }

    public double calcularCustoConsumidor() {
        return custoFabrica + calcularImpostos() + calcularCustoDistribuidor();
    }

    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }
}
