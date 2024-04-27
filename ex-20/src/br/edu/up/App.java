package br.edu.up;
import br.edu.up.models.Professor;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nível do professor (1, 2 ou 3): ");
        int nivel = scanner.nextInt();

        System.out.print("Informe o número de horas/aula ministradas: ");
        int horasAula = scanner.nextInt();

        Professor professor = new Professor(nivel);

        double salario = professor.calcularSalario(horasAula);

        System.out.println("Salário do professor: R$" + salario);

        scanner.close();
    }
}
