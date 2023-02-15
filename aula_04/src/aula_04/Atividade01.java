package aula_04;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero, posicao = 0;
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		boolean possui = false;
		
		// Entrada de dados
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			if (numero == vetorInteiros[indice]) {
				posicao = indice;
				possui = true;
			}
		}
		
		// Saída de dados
		if (possui)
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		else
			System.out.println("O número " + numero + " não foi encontrado!");
		
		
		leia.close();

	}

}
