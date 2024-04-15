package br.edu.up.models;

public class Produto {
  private String nome;
  private double precoCusto;
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public double getPrecoCusto() {
    return precoCusto;
  }
  public void setPrecoCusto(double precoCusto) {
    this.precoCusto = precoCusto;
  }
}
