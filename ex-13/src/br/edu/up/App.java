package br.edu.up;

import java.util.ArrayList;
import br.edu.up.models.Console;
import br.edu.up.models.Pessoa;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("----------Sistema para verificar aptdão------------");
		int qtdPessoas = Console.readInt("Informe quantas pessoas quer verificar: ");

		ArrayList<Pessoa> pessoas = new ArrayList<>();

		for(int i = 0; i < qtdPessoas; i++) {
			String nome = Console.readString("Informe o nome: ");
			int idade = Console.readInt("Informe a idade: ");
			String genero = Console.readString("Informe o genero 'M' ou 'H'").toUpperCase();
			String aptoEscolha = Console.readString("Pessoa encontra-se apto? 'S' para sim, 'N', para não").toUpperCase();
			Boolean apto = aptoEscolha.equals("S")? true : false;

			Pessoa pessoa =  new Pessoa(nome, genero, idade, apto);

			pessoas.add(pessoa);
		}

		int qtdAptos = 0;

		for (Pessoa pessoa : pessoas) {
			if(pessoa.getSaude()) qtdAptos++;
		}

		int qtdInaptos = pessoas.size() - qtdAptos;

		System.out.println("A quatidade de pessoas lidas foi de: " + qtdPessoas + ".\nDessas pessoas foram contadas " + qtdAptos + " pessoas aptas e " + qtdInaptos + " pessoas inaptas.");
	}
}
