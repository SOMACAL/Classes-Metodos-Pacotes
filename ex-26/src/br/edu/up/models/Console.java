package br.edu.up.models;
import java.util.Scanner;


public class Console {
    public static Cliente lercliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite o grupo de risco do cliente (Baixo, Médio, Alto): ");
        String grupoRisco = scanner.nextLine();
        return new Cliente(nome, idade, grupoRisco);
    }

    public static void exibirCategoria(Cliente cliente) {
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Idade do cliente: " + cliente.getIdade());
        System.out.println("Grupo de risco do cliente: " + cliente.getGrupoRisco());
        System.out.println("Categoria do cliente: " + cliente.obterCategoria());
    }
}