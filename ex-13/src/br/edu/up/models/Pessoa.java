package br.edu.up.models;

public class Pessoa {
  private String nome;
  private int idade;
  private String genero;
  private boolean saude;

  public Pessoa() {}

  public Pessoa(String nome, String genero, int idade, boolean saude) {
    this.nome = nome;
    this.genero = genero;
    this.idade = idade;
    this.saude = saude;
  }

  public String getNome() {
    return nome;
  }

  public String getGenero() {
    return genero;
  }

  public int getIdade() {
    return idade;
  }

  public boolean getSaude() {
    return saude;
  }
}
