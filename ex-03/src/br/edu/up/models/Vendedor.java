package br.edu.up.models;

public class Vendedor {
	private String nome;
	private double salarioFixo;
	private double vendas;

	public Vendedor() {
	};

	public Vendedor(String nome, double salarioFixo, double vendas) {
		this.nome = nome;
		this.salarioFixo = salarioFixo;
		this.vendas = vendas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double calcularSalarioFinal() {
		return salarioFixo + (vendas * 0.15);
	}
}
