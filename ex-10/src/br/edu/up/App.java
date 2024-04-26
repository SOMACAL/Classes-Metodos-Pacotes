package br.edu.up;

import br.edu.up.models.Console;
import br.edu.up.models.Pessoa;

public class App {
    public static void main(String[] args) {
        int numPessoas = Console.readInt("Quantas pessoas deseja verificar a idade? ");

        for (int i = 1; i <= numPessoas; i++) {
            int idade = Console.readInt("Informe a idade da pessoa " + i + ": ");
            Pessoa pessoa = new Pessoa(idade);
            System.out.println("Pessoa " + i + ": " + pessoa.getStatusIdade());
        }
    }
}
