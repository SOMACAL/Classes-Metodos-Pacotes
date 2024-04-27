package br.edu.up;
import br.edu.up.models.Funcionario;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a idade do funcionário: ");
        int idade = scanner.nextInt();

        System.out.print("Informe o sexo do funcionário (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Informe o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, sexo, salarioFixo);

        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido: R$" + funcionario.getSalarioLiquido());

        scanner.close();
    }
}

