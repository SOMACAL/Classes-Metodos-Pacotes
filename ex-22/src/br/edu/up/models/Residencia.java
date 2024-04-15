package br.edu.up.models;

public class Residencia {
  private String tipo;
  private String endereco;
  private double kwH;
  
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getEndereco() {
    return endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  public double getKwH() {
    return kwH;
  }
  public void setKwH(double kwH) {
    this.kwH = kwH;
  }
}
