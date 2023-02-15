package aula_06;

import java.util.LinkedList;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) { // Último que entra é o primeiro que sai

        Stack<String> pilha = new Stack<String>(); // Instancia uma fila e realiza operações sempre do último para o primeiro?

        pilha.push("Rony"); // Adiciona elementos no topo da pilha
        pilha.push("Lucas");
        pilha.push("Isaac");
        pilha.push("Fernando");
        pilha.push("Laise");
        pilha.push("Elizangela");

        for (var elemento : pilha) {
            System.out.println(elemento);
        }

        System.out.println("Remover um elemento da pilha");
        pilha.pop(); // Remove o elemento do topo da pilha

        for (var elemento : pilha) {
            System.out.println(elemento);
        }


        System.out.println("Topo da pilha: " + pilha.peek());
    }
}
