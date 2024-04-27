package br.edu.up.models;

public class Funcionario {
  private double salario;
  private static final double SALARIO_MINIMO = 1100.0;

  public Funcionario(double salario) {
      this.salario = salario;
  }

  public void reajustarSalario() {
      if (salario < 3 * SALARIO_MINIMO) {
          salario *= 1.5; 
      } else if (salario >= 3 * SALARIO_MINIMO && salario <= 10 * SALARIO_MINIMO) {
          salario *= 1.2; 
      } else if (salario > 10 * SALARIO_MINIMO && salario <= 20 * SALARIO_MINIMO) {
          salario *= 1.15; 
      } else {
          salario *= 1.1; 
      }
  }

  public double getSalario() {
      return salario;
  }
}
