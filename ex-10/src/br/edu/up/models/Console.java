package br.edu.up.models;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, insira um número inteiro válido.");
            scanner.next(); // Limpar o buffer do scanner
            System.out.print(prompt);
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Limpar a nova linha pendente
        return input;
    }
}
