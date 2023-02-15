package aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);

        int numero;
        boolean ok = false;
        String continua;

        do {
            do {

                System.out.println("Digite a tabuada que deseja calcular: ");
                numero = leia.nextInt();

                if (numero < 1 || numero > 10)
                    System.out.println("Digite um número entre 1 e 10.");
                else
                    ok = true;
            } while (ok == false);

            for (int contador = 1; contador <= 10; contador++) {
                System.out.println(numero + " x " + contador + " = " + (numero * contador));
            }
            
            ok = false;
            System.out.println("Deseja continuar (s/n)?: ");
            leia.skip("\\R?");
            continua = leia.nextLine();

        } while (continua.equals("s"));

        leia.close();

	}

}
