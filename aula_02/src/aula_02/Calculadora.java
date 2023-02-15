package aula_02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double n1, n2;

		System.out.println("Digite o 1° número: ");
		n1 = leia.nextDouble();

		System.out.println("Digite o 2° número: ");
		n2 = leia.nextDouble();

		System.out.println("O número " + n1 + " elevado ao número " + n2 + " é igual a " + Math.pow(n1, n2));

		System.out.println("A raíz quadrada do número " + n1 + " é igual a " + Math.sqrt(n1));

		/*
		 * System.out.println("Pré incremento"); System.out.println(n1);
		 * System.out.println(++ n1);
		 * 
		 * System.out.println("Pós incremento"); System.out.println(n2);
		 * System.out.println(n2 ++); System.out.println(n2);
		 */

		System.out.println("A soma de n1 + n2 é igual a " + (n1 += n2));
		System.out.println("O novo valor de n1 é igual a " + n1);
		
		leia.close();

	}

}
