package br.edu.up.models;

public class Funcionario {
  private String nome;
  private int idade;
  private char sexo;
  private double salarioFixo;

  public Funcionario(String nome, int idade, char sexo, double salarioFixo) {
      this.nome = nome;
      this.idade = idade;
      this.sexo = sexo;
      this.salarioFixo = salarioFixo;
  }

  public double calcularAbono() {
      double abono;
      if (sexo == 'M') {
          if (idade >= 30) {
              abono = 100.0;
          } else {
              abono = 50.0;
          }
      } else {
          if (idade >= 30) {
              abono = 200.0;
          } else {
              abono = 80.0;
          }
      }
      return abono;
  }

  public double calcularSalarioLiquido() {
      return salarioFixo + calcularAbono();
  }

  public String getNome() {
      return nome;
  }

  public double getSalarioLiquido() {
      return calcularSalarioLiquido();
  }
}
