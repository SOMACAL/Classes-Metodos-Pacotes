package br.edu.up.models;

public class Pessoa {
  private String nome;
  private Residencia residencia;
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Residencia getResidencia() {
    return residencia;
  }
  public void setResidencia(Residencia residencia) {
    this.residencia = residencia;
  }
}
