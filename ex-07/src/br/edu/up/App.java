package br.edu.up;

import java.text.DecimalFormat;
import br.edu.up.models.Carro;
import br.edu.up.models.Console;

public class App {
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		Carro carro = new Carro();

		carro.setCustoFabrica(Console.readDouble("Informe o custo de fábrica do carro: "));

		double valorComImposto = carro.getCustoFabrica() + carro.calcularImpostos();

		double percentagemDistribuidor = carro.percentagemDistribuidor(valorComImposto);

		double valorConsumidor = valorComImposto + percentagemDistribuidor;

		System.out.println("\nO valor do carro foi de: R$" + carro.getCustoFabrica() + "\nO valor com imposto foi de: R$" + valorComImposto + "\nE a percentagem do distribuidor é de: R$" + decimalFormat.format(percentagemDistribuidor) + "\nO valor para o consumidor final é de: R$" +  decimalFormat.format(valorConsumidor));
	}
}