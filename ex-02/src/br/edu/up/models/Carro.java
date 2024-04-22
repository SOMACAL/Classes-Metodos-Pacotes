package br.edu.up.models;

public class Carro {
  private double distanciaTotal;
  private double combustivelGasto;

  public Carro(double distanciaTotal, double combustivelGasto) {
    this.distanciaTotal = distanciaTotal;
    this.combustivelGasto = combustivelGasto;
  }

  public double consumoMedio() {
    return distanciaTotal / combustivelGasto;
  }
}