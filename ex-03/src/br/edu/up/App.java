package br.edu.up;

import br.edu.up.models.Console;
import br.edu.up.models.Vendedor;

public class App {
  public static void main(String[] args) throws Exception {
		Vendedor vendedor = new  Vendedor();

		vendedor.setNome(Console.readString("Digite o nome do vendendor: "));
		vendedor.setSalarioFixo(Console.readDouble("Digite o valor do salário fixo: "));
		vendedor.setVendas(Console.readDouble("Digite o valor total das vendas: "));

		double salarioFinal = vendedor.calcularSalarioFinal();

		System.out.println("O vendedor " + vendedor.getNome() + " tem um salário de R$" + vendedor.getSalarioFixo() + " e com sua comissão o saláro é de: R$" + salarioFinal);
  }
}
