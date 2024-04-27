package br.edu.up.models;

public class Aluno {
  private String nome;
  private double notaLaboratorio;
  private double notaAvaliacaoSemestral;
  private double notaExameFinal;

  public Aluno(String nome, double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
      this.nome = nome;
      this.notaLaboratorio = notaLaboratorio;
      this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
      this.notaExameFinal = notaExameFinal;
  }

  public double calcularNotaFinal() {
      return (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
  }

  public String getNome() {
      return nome;
  }
}
