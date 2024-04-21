package br.edu.up;

import java.util.ArrayList;
import br.edu.up.models.Console;
import br.edu.up.models.ListaDeNumero;

public class App {
	public static void main(String[] args) throws Exception {
		ListaDeNumero listaDeNumero = new ListaDeNumero();
		int contador = 1;
		
		while (listaDeNumero.getNumeros().size() < 80) {
			listaDeNumero.setNumeros(Console.readInt("Informe o " + contador + " número: "));
			contador++;
		}

		ArrayList<Integer> numerosInclusos = listaDeNumero.verificarNumeros();

		System.out.println(numerosInclusos);
	}
}
