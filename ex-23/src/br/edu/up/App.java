package br.edu.up;

import java.text.DecimalFormat;
import br.edu.up.models.Console;
import br.edu.up.models.Pessoa;

public class App {
	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println("-----------Peso ideal de acordo com gênero-----------");

		String nome = Console.readString("Informe o nome: ");
		Double altura = Console.readDouble("Informe a altura: ");
		int idade = Console.readInt("Informe a idade: ");
		String genero = Console.readString("Informe o gênero 'H' (homem) ou 'M' (mulher): ").toUpperCase();

		Pessoa pessoa = new Pessoa(nome, genero, altura, idade);
		
		double pesoIdeal = pessoa.calcularPesoIdeal();

		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Altura: " + pessoa.getAltura());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Gênero: " + pessoa.getGenero());
		System.out.println("Peso ideal: " + df.format(pesoIdeal));
	}
}
