package br.edu.up.models;

public class Produto {
  private double precoCusto;
  private double percentualAcrescimo;

  public Produto(double precoCusto, double percentualAcrescimo) {
    this.precoCusto = precoCusto;
    this.percentualAcrescimo = percentualAcrescimo;
  }

  public double calcularValorVenda() {
    return precoCusto + (precoCusto * percentualAcrescimo / 100);
  }
}