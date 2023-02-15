package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade01ArrayList {
    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<String>();
        Scanner leia = new Scanner(System.in);

        String cor;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o nome de uma cor: ");
            leia.skip("\\R?");
            cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println(" ");
        System.out.println("Listar todas as cores:");
        System.out.println(" ");
        cores.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("Ordenar as cores:");
        System.out.println(" ");
        cores.sort(null);
        cores.forEach(System.out::println);

    }
}