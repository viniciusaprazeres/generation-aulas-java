package aula_04;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matrizInteiros = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		

		// Entrada de dados da matriz
        for (int indiceLinha = 0; indiceLinha < matrizInteiros.length; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < matrizInteiros[indiceLinha].length; indiceColuna++) {
                System.out.println("Digite um número inteiro para a posição [" + indiceLinha + "][" + indiceColuna + "]: ");
                matrizInteiros[indiceLinha][indiceColuna] = leia.nextInt();
            }
        }
		
		
		// Diagonal principal usando for
		System.out.println("Elementos da Diagonal Principal: ");
		for (int indiceLinha = 0; indiceLinha < matrizInteiros.length; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < matrizInteiros[indiceLinha].length; indiceColuna++) {
            	//Saída de dados dos elementos e soma
            	if(indiceLinha == indiceColuna) {
            		System.out.print(matrizInteiros[indiceLinha][indiceColuna] + " ");
            		somaPrincipal += matrizInteiros[indiceLinha][indiceColuna];
            	}
            }
        }
		
		
		// Diagonal secundária usando for
		System.out.println("\nElementos da Diagonal Secundária: ");
		for (int indiceLinha = 0; indiceLinha < matrizInteiros.length; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < matrizInteiros[indiceLinha].length; indiceColuna++) {
            	//Saída de dados dos elementos e soma
            	if(indiceLinha + indiceColuna == 2) {
            		System.out.print(matrizInteiros[indiceLinha][indiceColuna] + " ");
            		somaSecundaria += matrizInteiros[indiceLinha][indiceColuna];
            	}
            }
        }
		
		// Saída de dados das somas
		System.out.println("\nSoma dos Elementos da Diagonal Principal: \n" + somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: \n" + somaSecundaria);
		
		leia.close();

	}

}