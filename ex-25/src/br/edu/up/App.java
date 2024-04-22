package br.edu.up;

import br.edu.up.models.Console;
import br.edu.up.models.Estudante;

public class App {
  public static void main(String[] args) {
    System.out.println("----------Verificar Classificação Estudante----------");
    String nome = Console.readString("Informe o nome: ");
    int matricula = Console.readInt("Informe o número da matrícula: ");

    Estudante estudante = new Estudante(nome, matricula);
    System.out.println("\nAluno cadastrado com sucesso.");

    System.out.println("\n----------Notas----------");
    estudante.setNotaLaboratorio(Console.readInt("Informe a nota do trabalho do laboratório (peso 2): "));
    estudante.setNotaAvSemestral(Console.readInt("Informe a nota da Avaliação Semestral (Peso 3): "));
    estudante.setNotaExFinal(Console.readInt("Informe a nota do Exame Final (Peso 5): "));

    String conceitoNota = estudante.conceitoNota();

    System.out.println("\n----------Resultados----------");
    System.out.println("Nome: " + estudante.getNome());
    System.out.println("Matricula: " + estudante.getMatricula());
    System.out.println("Nota Laboratório: " + estudante.getNotaLaboratorio());
    System.out.println("Nota Avaliação Semestral: " + estudante.getNotaAvSemestral());
    System.out.println("Nota Exame Final: " + estudante.getNotaExFinal());
    System.out.println("Conceito: " + conceitoNota);
  }
}