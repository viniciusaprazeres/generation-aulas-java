package aula_06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila { // Primeiro que entra é o primeiro que sai
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>(); // Instancia uma fila e realiza operações sempre do primeiro para o último?

        fila.add("Rony");
        fila.add("Lucas");
        fila.add("Isaac");
        fila.add("Fernando");
        fila.add("Laise");
        fila.add("Elizangela");

        Iterator<String> iFila = fila.iterator();

        while (iFila.hasNext())
            System.out.println(iFila.next());

        System.out.println("Retirar um elemento da fila");
        System.out.println(fila.poll()); // Retira o primeiro elemento da lista e mostra qual foi retirado

        System.out.println("Fila atualizada: ");
        for (var elemento : fila)
            System.out.println(elemento);

        System.out.println("Primeiro elemento da fila: ");
        System.out.println(fila.peek());

        System.out.println("Tamanho da fila: ");
        System.out.println(fila.size());

    }
}
