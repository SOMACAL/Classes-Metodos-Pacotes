package br.edu.up;
import br.edu.up.models.Funcionario;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[584];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.print("Informe o salário do funcionário " + (i + 1) + ": ");
            double salario = scanner.nextDouble();

            funcionarios[i] = new Funcionario(salario);
            funcionarios[i].reajustarSalario();
        }

        System.out.println("\nSalários reajustados:");
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Funcionário " + (i + 1) + ": R$" + funcionarios[i].getSalario());
        }

        scanner.close();
    }
}
