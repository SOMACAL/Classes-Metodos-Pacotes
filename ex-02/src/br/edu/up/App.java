package br.edu.up;

import br.edu.up.models.Carro;
import br.edu.up.models.Console;

public class App {
    public static void main(String[] args) {
        double distanciaTotal = Console.readDouble("Digite a distância total percorrida (em km):");
        double combustivelGasto = Console.readDouble("Digite o total de combustível gasto (em litros):");

        Carro carro = new Carro(distanciaTotal, combustivelGasto);

        double consumoMedio = carro.consumoMedio();
        System.out.println("Olá, o seu consumo médio foi: " + consumoMedio + " km/l");
    }
}