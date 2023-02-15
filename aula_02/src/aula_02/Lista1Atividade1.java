package aula_02;

import java.util.Scanner;

public class Lista1Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o número A: ");
        a = leia.nextInt();

        System.out.println("Digite o número B: ");
        b = leia.nextInt();

        System.out.println("Digite o número C: ");
        c = leia.nextInt();

        if ((a + b) < c)
            System.out.println("A soma A + B é MENOR que C.");
        else if ((a + b) > c)
            System.out.println("A soma A + B é MAIOR que C.");
        else
            System.out.println("A soma A + B é IGUAL a C.");
        
        leia.close();

	}

}
