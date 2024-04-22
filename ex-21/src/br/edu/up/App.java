package br.edu.up;

import br.edu.up.models.Console;
import br.edu.up.models.Nadador;

public class App {
	public static void main(String[] args) throws Exception {
		int idade = Console.readInt("Informe a idade do nadador: ");

		Nadador nadador = new Nadador(idade);

		String categoria = nadador.classificarCategoria();

		System.out.println("O nadador informado se encaixa na categoria: " + categoria);
	}
}
