package br.edu.up.models;

public class Usuario {
  private double cotacaoDolar;
  private double quantidadeDolares;

  public Usuario(double cotacaoDolar, double quantidadeDolares) {
    this.cotacaoDolar = cotacaoDolar;
    this.quantidadeDolares = quantidadeDolares;
  }

  public double converterParaReais() {
    return quantidadeDolares * cotacaoDolar;
  }
}