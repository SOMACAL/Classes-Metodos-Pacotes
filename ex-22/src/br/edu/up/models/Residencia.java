package br.edu.up.models;

public class Residencia {
  private int tipoCliente; // 1 - Residência, 2 - Comércio, 3 - Indústria
  private double valorKWh;

  public Residencia(int tipoCliente) {
      this.tipoCliente = tipoCliente;
      definirValorKWh();
  }

  private void definirValorKWh() {
      switch (tipoCliente) {
          case 1:
              valorKWh = 0.602;
              break;
          case 2:
              valorKWh = 0.483;
              break;
          case 3:
              valorKWh = 1.29;
              break;
          default:
              System.out.println("Tipo de cliente inválido.");
      }
  }

  public double calcularConta(int consumoKWh) {
      return consumoKWh * valorKWh;
  }

  public void setTipoCliente(int tipoCliente) {
      this.tipoCliente = tipoCliente;
      definirValorKWh();
  }

  public double getValorKWh() {
      return valorKWh;
  }
}
