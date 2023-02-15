package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade03Set {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<Integer>();
        Scanner leia = new Scanner(System.in);

        int numero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "° número inteiro: ");
            numero = leia.nextInt();
            numeros.add(numero);
        }

        Iterator<Integer> iNumeros = numeros.iterator();

        System.out.println("Listar dados do Set: \n");
        while (iNumeros.hasNext()) {
            System.out.println(iNumeros.next());
        }
    }
}