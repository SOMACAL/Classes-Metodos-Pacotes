package br.edu.up;
import br.edu.up.models.Boletim;
import br.edu.up.models.Aluno;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados do aluno:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Nota do trabalho de laboratório: ");
        double notaLaboratorio = scanner.nextDouble();

        System.out.print("Nota da avaliação semestral: ");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.print("Nota do exame final: ");
        double notaExameFinal = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
        Boletim boletim = new Boletim(aluno);

        System.out.println();
        boletim.exibirBoletim();

        scanner.close();
    }
}
