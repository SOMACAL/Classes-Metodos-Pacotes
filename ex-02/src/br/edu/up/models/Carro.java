package br.edu.up.models;

public class Carro {
  private String nome;
  private String modelo;
  private double consumoMedio;
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public double getConsumoMedio() {
    return consumoMedio;
  }
  public void setConsumoMedio(double consumoMedio) {
    this.consumoMedio = consumoMedio;
  }
}
