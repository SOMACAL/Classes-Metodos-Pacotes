package br.edu.up.models;

public class Estudante {
  private String nome;
  private int matricula;
  private int notaLaboratorio = 0;
  private int notaAvSemestral = 0;
  private int notaExFinal = 0;

  public Estudante(String nome, int matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public int getMatricula() {
    return matricula;
  }

  public int getNotaLaboratorio() {
    return notaLaboratorio;
  }

  public void setNotaLaboratorio(int notaLaboratorio) {
    if(notaLaboratorio < 0 || notaLaboratorio > 2) {
      throw new IllegalArgumentException("A nota do laboratório deve estar entre 0 e 2");
    }

    this.notaLaboratorio = notaLaboratorio;
  }

  public int getNotaAvSemestral() {
    return notaAvSemestral;
  }

  public void setNotaAvSemestral(int notaAvSemestral) {
    if(notaAvSemestral < 0 || notaAvSemestral > 3) {
      throw new IllegalArgumentException("A nota da avaliação semestral deve estar entre 0 e 3");
    }

    this.notaAvSemestral = notaAvSemestral;
  }

  public int getNotaExFinal() {
    return notaExFinal;
  }

  public void setNotaExFinal(int notaExFinal) {
    if(notaExFinal < 0 || notaExFinal > 5) {
      throw new IllegalArgumentException("A nota do exame final deve estar entre 0 e 5");
    }

    this.notaExFinal = notaExFinal;
  }

  public String conceitoNota() {
    double notaFinal = (this.notaLaboratorio + this.notaAvSemestral +  this.notaExFinal) / 3;

    if(notaFinal >= 8.0 || notaFinal <= 10.0) {
      return "A";
    }

    if (notaFinal >= 7.0 || notaFinal < 8.0) {
      return "B";
    }

    if (notaFinal >= 6.0 || notaFinal < 7.0) {
      return "C";
    }

    if (notaFinal >= 5.0 || notaFinal < 6.0) {
      return "D";
    }

    if (notaFinal < 5.0) {
      return "R";
    }

    return "Dado inválido";
  }
}
