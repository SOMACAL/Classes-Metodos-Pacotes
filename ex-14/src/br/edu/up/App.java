package br.edu.up;
import br.edu.up.models.Produto;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        Produto[] produtos = new Produto[40];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            System.out.print("Preço de custo: ");
            double precoCusto = scanner.nextDouble();

            System.out.print("Preço de venda: ");
            double precoVenda = scanner.nextDouble();

            produtos[i] = new Produto(precoCusto, precoVenda);

            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;

            System.out.println("Produto " + (i + 1) + ": " + produtos[i].calcularLucroOuPrejuizo());
        }

        double mediaPrecoCusto = somaPrecoCusto / 40;
        double mediaPrecoVenda = somaPrecoVenda / 40;

        System.out.println("\nMédia de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);

        scanner.close();
    }
}
