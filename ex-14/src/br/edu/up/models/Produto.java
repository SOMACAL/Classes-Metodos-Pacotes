package br.edu.up.models;

public class Produto {
  private String nome;
  private double precoCusto;
  private double precoVenda;
  
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
  public double getPrecoVenda() {
    return precoVenda;
  }
  public void setPrecoVenda(double precoVenda) {
    this.precoVenda = precoVenda;
  }
}
