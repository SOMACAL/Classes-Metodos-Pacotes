package br.edu.up;
import br.edu.up.models.Pessoa;
import br.edu.up.models.Residencia;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o tipo de cliente da residência (1 - Residência, 2 - Comércio, 3 - Indústria): ");
        int tipoCliente = scanner.nextInt();

        System.out.print("Informe o consumo em kWh da residência: ");
        int consumoKWh = scanner.nextInt();

        Residencia residencia = new Residencia(tipoCliente);

        double valorConta = residencia.calcularConta(consumoKWh);

        Pessoa pessoa = new Pessoa(nome, residencia);

        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Valor da conta de luz: R$" + valorConta);

        scanner.close();
    }
}
