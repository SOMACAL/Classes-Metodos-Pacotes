package br.edu.up;

import br.edu.up.models.Console;
import br.edu.up.models.Usuario;

public class App {
    public static void main(String[] args) {
        double cotacaoDolar = Console.readDouble("Digite a cotação do dólar (em reais): ");
        double quantidadeDolares = Console.readDouble("Digite a quantidade de dólares disponíveis: ");

        Usuario conversor = new Usuario(cotacaoDolar, quantidadeDolares);
        double valorEmReais = conversor.converterParaReais();

        System.out.println("O valor convertido em reais é: R$" + valorEmReais);
    }
}