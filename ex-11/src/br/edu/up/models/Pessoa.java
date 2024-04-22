package br.edu.up.models;

public class Pessoa {
	private String nome;
	private String genero;

	public Pessoa(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Boolean verificaGenero(char genero) {
		return genero == 'M';
	}
}
