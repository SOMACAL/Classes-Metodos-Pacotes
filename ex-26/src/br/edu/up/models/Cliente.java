package br.edu.up.models;

public class Cliente {
  private String nome;
  private int idade;
  private GrupoDeRisco GrupoDeRisco;
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  public GrupoDeRisco getGrupoDeRisco() {
    return GrupoDeRisco;
  }
  public void setGrupoDeRisco(GrupoDeRisco grupoDeRisco) {
    GrupoDeRisco = grupoDeRisco;
  }
}
