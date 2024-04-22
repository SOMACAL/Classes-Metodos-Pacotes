package br.edu.up;

import br.edu.up.models.Console;
import br.edu.up.models.Triangulo;

public class App {
	public static void main(String[] args) throws Exception {
		int triLado1 = Console.readInt("Informe a medida do lado 1 do triângulo: ");
		int triLado2 = Console.readInt("Informe a medida do lado 2 do triângulo: ");
		int triLado3 = Console.readInt("Informe a medida do lado 3 do triângulo: ");

		Triangulo triangulo = new Triangulo(triLado1, triLado2, triLado3);

		String tipoTriangulo = triangulo.verificarTipoTriangulo();

		System.out.println(tipoTriangulo);
	}
}