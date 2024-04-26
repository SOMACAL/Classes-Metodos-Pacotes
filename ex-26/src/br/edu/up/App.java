package br.edu.up;

import br.edu.up.models.Console;
import br.edu.up.models.Cliente;

public class App {
    public static void main(String[] args) {
        // Ler os dados do pretendente
        Cliente cliente = Console.lercliente();
        
        // Verificar se a idade do pretendente está dentro da faixa necessária
        if (cliente.getIdade() >= 17 && cliente.getIdade() <= 70) {
            // Exibir os dados do pretendente e sua categoria
            Console.exibirCategoria(cliente);
        } else {
            // Caso a idade do pretendente não esteja na faixa necessária, exibir mensagem de erro
            System.out.println("O cliente não se enquadra na faixa etária permitida para adquirir seguro.");
        }
    }
}
