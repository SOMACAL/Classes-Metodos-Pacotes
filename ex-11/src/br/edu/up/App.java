package br.edu.up;

import java.util.ArrayList;
import br.edu.up.models.Console;
import br.edu.up.models.Pessoa;

public class App {
	public static void main(String[] args) throws Exception {

		ArrayList<Pessoa> pessoas = new ArrayList<>();

		int contador = 1;
		
		while (pessoas.size() < 56) {
			String nome = Console.readString("Informe o nome da pessoa " + contador + ": ");

			String genero = Console.readString("Informe o gênero 'M' ou 'F'").toUpperCase();

			Pessoa pessoa = new Pessoa(nome, genero);

			pessoas.add(pessoa);

			contador++;
		}

		int qtdHomens = 0;

		for (Pessoa pessoa : pessoas) {
			if(pessoa.getGenero().equals("M")) {
				qtdHomens++;
			}
		}

		int qtdMulheres = pessoas.size() - qtdHomens;

		System.out.println("A quantidade de homens dessa lista de pessoas é de: " + qtdHomens + "\nA quantidade de mulher dessa lista de pessoas é de: " + qtdMulheres);


	}
}
