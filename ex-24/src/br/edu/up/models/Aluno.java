package br.edu.up.models;

public class Aluno {
  private String nome;
  private String curso;
  private Boletim boletim;
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCurso() {
    return curso;
  }
  public void setCurso(String curso) {
    this.curso = curso;
  }
  public Boletim getBoletim() {
    return boletim;
  }
  public void setBoletim(Boletim boletim) {
    this.boletim = boletim;
  }
}
