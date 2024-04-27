package br.edu.up;

import java.util.Scanner;

import br.edu.up.models.Carro;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro concessionaria = new Carro();

        char continuar;
        do {
            System.out.print("Informe o ano do veículo: ");
            int ano = scanner.nextInt();
            concessionaria.calcularDesconto(ano);

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        concessionaria.exibirTotais();

        scanner.close();
    }
}
