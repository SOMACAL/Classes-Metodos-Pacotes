package br.edu.up;

import br.edu.up.models.Aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();
        Aluno aluno = new Aluno(nome);

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            aluno.adicionarNota(nota, i);
        }

        System.out.println("O aluno " + aluno.getNome() + " obteve média " + aluno.calcularMedia() +
                           " e está " + aluno.obterMencao() + ".");

        scanner.close();
    }
}
