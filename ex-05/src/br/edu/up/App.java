package br.edu.up;

import java.util.ArrayList;

import br.edu.up.models.Carrinho;
import br.edu.up.models.Produto;

public class App {
	public static void main(String[] args) {
		Produto chocolate = new Produto("Shot", 8.9);
		Produto batataPalha = new Produto("Pringles", 12.2);
		Produto pacoca = new Produto("Santa Helena", 5.2);

		Carrinho carrinho = new Carrinho();

		carrinho.setProdutos(chocolate);
		carrinho.setProdutos(batataPalha);
		carrinho.setProdutos(pacoca);

		ArrayList<Produto> produtos = carrinho.getProdutos();

		for (Produto produto : produtos) {
			System.out.println("----------");
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Valor: " + produto.getValor());
		}

		carrinho.calcularValorTotal();

		System.out.println("\nO valor total dessa compra, foi de: " + carrinho.getValorTotal());

		System.out.println("\nO valor dessa compra dividido em 5x é de: " + carrinho.getValorTotal() / 5);
	}
}