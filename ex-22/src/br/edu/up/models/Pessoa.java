package br.edu.up.models;

public class Pessoa {
  private String nome;
  private Residencia residencia;

  public Pessoa(String nome, Residencia residencia) {
      this.nome = nome;
      this.residencia = residencia;
  }

  public String getNome() {
      return nome;
  }

  public Residencia getResidencia() {
      return residencia;
  }
}
