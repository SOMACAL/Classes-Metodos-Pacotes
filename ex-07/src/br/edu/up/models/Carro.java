package br.edu.up.models;

public class Carro {
	private double custoFabrica;

	public Carro() {
	}

	public Carro(double custoFabrica) {
		this.custoFabrica = custoFabrica;
	}

	public double calcularImpostos() {
		return custoFabrica * 0.45;
	}

	public double percentagemDistribuidor(double valorComImposto) {
		return valorComImposto * 0.28;
	}

	public double getCustoFabrica() {
		return custoFabrica;
	}

	public void setCustoFabrica(double custoFabrica) {
		this.custoFabrica = custoFabrica;
	}
}