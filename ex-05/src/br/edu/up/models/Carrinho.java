package br.edu.up.models;
import java.util.ArrayList;

public class Carrinho {
	private ArrayList<Produto> produtos = new ArrayList<>();
	private double valorTotal = 0;

	public ArrayList<Produto> getProdutos() {
		return this.produtos;
	}

	public void setProdutos(Produto produto) {
		this.produtos.add(produto);
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void calcularValorTotal() {
		for (Produto produto : produtos) {
			this.valorTotal += produto.getValor();
		}
	}
}
