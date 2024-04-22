package br.edu.up;

import br.edu.up.models.Console;
import br.edu.up.models.Funcionario;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("\n---------Programa para calcular reajuste de salário------------\n");
		
		double salarioMinimo = Console.readDouble("Informe o salário mínimo hoje: ");
		String nome = Console.readString("Informe o nome do funcionário: ");
		Double salario = Console.readDouble("Informe o salário do funcionário: ");

		Funcionario funcionario = new Funcionario(nome, salario);

		if(salario > salarioMinimo) {
			System.out.println("\n---------------------\n");
			System.out.println("Nome do funcionário: " + funcionario.getNome() + "\nSalário do funcionário: " + funcionario.getSalario());
			System.out.println("\nFuncionário não apto a receber aumento.");
		} else {
			System.out.println("\n---------------------\n");
			System.out.println("Nome do funcionário: " + funcionario.getNome() + "\nSalário atual do funcionário: " + funcionario.getSalario() + "\nSalário ajustado: " + salarioMinimo);

			double qdtAumento = salarioMinimo - funcionario.getSalario();
			System.out.println("\nAumento de: " + qdtAumento);
		}
	}
}
