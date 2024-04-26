package br.edu.up;

import br.edu.up.models.Produto;
import br.edu.up.models.Console;

public class App {
    public static void main(String[] args) {
        double precoCusto = Console.readDouble("Digite o preço de custo do produto: ");
        double percentualAcrescimo = Console.readDouble("Digite o percentual de acréscimo: ");

        Produto calculadora = new Produto(precoCusto, percentualAcrescimo);
        double valorVenda = calculadora.calcularValorVenda();

        System.out.println("O valor de venda do produto é: R$" + valorVenda);
    }
}