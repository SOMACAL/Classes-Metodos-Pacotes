package br.edu.up.models;

public class Carro {
  private String nome;
  private String modelo;
  private double ano;
  private double valor;
  
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
  public double getAno() {
    return ano;
  }
  public void setAno(double ano) {
    this.ano = ano;
  }
  public double getValor() {
    return valor;
  }
  public void setValor(double valor) {
    this.valor = valor;
  }
}
