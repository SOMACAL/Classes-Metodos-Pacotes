package br.edu.up.models;

public class Professor {
  private String nome;
  private int nivel;
  private double horaAula;
  private double salario = 0;
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getNivel() {
    return nivel;
  }
  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
  public double getHoraAula() {
    return horaAula;
  }
  public void setHoraAula(double horaAula) {
    this.horaAula = horaAula;
  }
  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }
}
