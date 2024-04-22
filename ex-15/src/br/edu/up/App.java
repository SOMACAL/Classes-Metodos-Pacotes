package br.edu.up;

import java.text.DecimalFormat;
import br.edu.up.models.Console;
import br.edu.up.models.Veiculo;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("-----------Sistema para calcular desconto de acordo com o tipo de combustivel------------");
		System.out.println("Informe o tipo de combustível e o valor do veículo, para sair ditite '0'");

		double valor = 1;

		DecimalFormat df = new DecimalFormat("0.00##");

		do {
			String tipoCombustivel = Console.readString("\nInforme o tipo de tipo combustivel 'Álcool', 'Gasolina' ou 'Diesel': ").toLowerCase();
			valor = Console.readDouble("Informe o valor do veículo: ");

			Veiculo veiculo = new Veiculo(tipoCombustivel, valor);

			double desconto = veiculo.calcularDesconto();

			double valorPago = veiculo.calcularValorPago();

			System.out.println("\n--------------------------------------------------------------------------------------------");
			System.out.println("Para o veículo que utiliza " + veiculo.getTipoCombustivel() + " com o valor de " + veiculo.getValor() + " o desconto é de " + df.format(desconto) + " e o valor pago será de: " + df.format(valorPago));
		} while (valor != 0);
	}
}
