package br.edu.up.models;

public class Aluno {
  private String nome;
  private float notaA1;
  private float notaA2;
  private float notaA3;

  public float getNotaA1() {
    return notaA1;
  }

  public void setNotaA1(float notaA1) {
    this.notaA1 = notaA1;
  }

  public float getNotaA2() {
    return notaA2;
  }

  public void setNotaA2(float notaA2) {
    this.notaA2 = notaA2;
  }

  public float getNotaA3() {
    return notaA3;
  }

  public void setNotaA3(float notaA3) {
    this.notaA3 = notaA3;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public float calcularMedia(float notaA1, float notaA2, float notaA3) {
    return (notaA1 + notaA2 + notaA3) / 3;
  }
}
