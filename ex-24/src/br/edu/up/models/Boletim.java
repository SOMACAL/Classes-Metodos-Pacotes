package br.edu.up.models;

public class Boletim {
  private double trabalhoLab = 2;
  private double avSemestral = 3;
  private double exameFinal = 5;
  
  public double getTrabalhoLab() {
    return trabalhoLab;
  }
  public void setTrabalhoLab(double trabalhoLab) {
    this.trabalhoLab = trabalhoLab;
  }
  public double getAvSemestral() {
    return avSemestral;
  }
  public void setAvSemestral(double avSemestral) {
    this.avSemestral = avSemestral;
  }
  public double getExameFinal() {
    return exameFinal;
  }
  public void setExameFinal(double exameFinal) {
    this.exameFinal = exameFinal;
  }
}
