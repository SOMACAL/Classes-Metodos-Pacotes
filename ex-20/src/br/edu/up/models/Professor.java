package br.edu.up.models;

public class Professor {
  private int nivel;
  private double valorHoraAula;

  public Professor(int nivel) {
      this.nivel = nivel;
      definirValorHoraAula();
  }

  private void definirValorHoraAula() {
      switch (nivel) {
          case 1:
              valorHoraAula = 12.0;
              break;
          case 2:
              valorHoraAula = 17.0;
              break;
          case 3:
              valorHoraAula = 25.0;
              break;
          default:
              System.out.println("Nível de professor inválido.");
      }
  }

  public double calcularSalario(int horasAula) {
      return horasAula * valorHoraAula;
  }

  public void setNivel(int nivel) {
      this.nivel = nivel;
      definirValorHoraAula();
  }

  public double getValorHoraAula() {
      return valorHoraAula;
  }
}
