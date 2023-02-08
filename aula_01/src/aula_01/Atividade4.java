package aula_01;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		
		
		int n1, n2, n3, n4, diferenca;
		
		
		System.out.println("Digite o primeiro número (N1): ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número (N2): ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número (N3): ");
		n3 = leia.nextInt();
		
		System.out.println("Digite o quarto número (N4): ");
		n4 = leia.nextInt();
		
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		
		System.out.println("A diferença do produto entre (N1) e (N2) pelo produto entre (N3) e (N4) é de: " + diferenca);
		
	}

}
