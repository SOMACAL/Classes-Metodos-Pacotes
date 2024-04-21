package br.edu.up.models;

public class Aluno {
  private String nome;
  private double notaA1;
  private double notaA2;
  private double notaA3;

  public double getNotaA1() {
    return notaA1;
  }

  public void setNotaA1(double notaA1) {
    this.notaA1 = notaA1;
  }

  public double getNotaA2() {
    return notaA2;
  }

  public void setNotaA2(double notaA2) {
    this.notaA2 = notaA2;
  }

  public double getNotaA3() {
    return notaA3;
  }

  public void setNotaA3(double notaA3) {
    this.notaA3 = notaA3;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double calcularMedia() {
    return (this.notaA1 + this.notaA2 + this.notaA3) / 3;
  }
}
