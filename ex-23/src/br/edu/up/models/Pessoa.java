package br.edu.up.models;

public class Pessoa {
	private String nome;
	private String genero;
	private double altura;
	private int idade;

	public Pessoa(String nome, String genero, double altura, int idade) {
		this.nome = nome;
		this.genero = genero;
		this.altura = altura;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public double getAltura() {
		return altura;
	}

	public int getIdade() {
		return idade;
	}

	public double calcularPesoIdeal() {
		double pesoIdeal;
		if (genero.equals("H")) {
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
		} else {
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
