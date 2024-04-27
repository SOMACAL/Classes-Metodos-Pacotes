package br.edu.up.models;

public class Carro {
  private int totalCarrosAte2000;
  private int totalGeral;

  public Carro() {
      this.totalCarrosAte2000 = 0;
      this.totalGeral = 0;
  }

  public void calcularDesconto(int ano) {
      double desconto;
      if (ano <= 2000) {
          desconto = 0.12;
          totalCarrosAte2000++;
      } else {
          desconto = 0.07;
      }
      totalGeral++;
      double valorDesconto = desconto * 100;
      System.out.println("O desconto para um carro de " + ano + " é de " + valorDesconto + "%.");
  }

  public void exibirTotais() {
      System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
      System.out.println("Total geral de carros: " + totalGeral);
  }
}
