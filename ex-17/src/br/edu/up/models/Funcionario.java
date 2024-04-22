package br.edu.up.models;

public class Funcionario {
	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public double calcularReajuste() {
		double novoSalario = salario + (salario * 0.1);
		return novoSalario;
	}

	public double calcularAumentoFolha() {
		double aumento = calcularReajuste() - salario;
		return aumento;
	}
}
