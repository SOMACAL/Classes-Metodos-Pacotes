package br.edu.up.models;
import java.util.ArrayList;

public class ListaDeNumero {
  ArrayList<Integer> numeros = new ArrayList<>();

  public ArrayList<Integer> getNumeros() {
    return numeros;
  }

  public void setNumeros(Integer number) {
    this.numeros.add(number);
  }
  
  public ArrayList<Integer> verificarNumeros() {
    ArrayList<Integer> numerosInclusos = new ArrayList<>();
    for (Integer numero : numeros) {
      if(numero >= 10 && numero <= 150) {
        numerosInclusos.add(numero);
      }
    }
    return numerosInclusos;
  }
}
