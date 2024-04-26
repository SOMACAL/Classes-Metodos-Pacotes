package br.edu.up.models;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double readDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}