package br.edu.up;
import br.edu.up.models.Aluno;
import br.edu.up.models.Console;

public class App {
  public static void main(String[] args) throws Exception {
    Aluno aluno = new Aluno();

    aluno.setNome(Console.readString("Digite o nome do aluno: "));
    aluno.setNotaA1(Console.readLong("Digite a nota da avaliação 1: "));
    aluno.setNotaA2(Console.readLong("Digite a nota da avaliação 2: "));
    aluno.setNotaA3(Console.readLong("Digite a nota da avaliação 3: "));

    double media = aluno.calcularMedia();

    System.out.println("Olá " + aluno.getNome() + " a sua média foi de: " + media );
  }
}