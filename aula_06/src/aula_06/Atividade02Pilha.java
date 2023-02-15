package aula_06;

import java.util.Scanner;
import java.util.Stack;

public class Atividade02Pilha {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<String>();
        Scanner leia = new Scanner(System.in);

        int opcao;
        String livro;

        do {
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar Livro na Pilha             ");
            System.out.println("            2 - Listar todos os Livros               ");
            System.out.println("            3 - Retirar Livros da Pilha              ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada: ");
            System.out.println("                                                     ");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do livro: ");
                    leia.skip("\\R?");
                    livro = leia.nextLine();
                    pilha.push(livro);
                    System.out.println("Pilha: ");
                    pilha.forEach(System.out::println);
                    System.out.println("Livro adicionado!");
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("Lista de livros na pilha: ");
                        pilha.forEach(System.out::println);
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("Pilha: ");
                        pilha.pop();
                        pilha.forEach(System.out::println);
                        System.out.println("Um Livro foi retirado da pilha!");
                    }
                    break;
                default:
                    if (opcao != 0)
                        System.out.println("Opção não encontrada!");
                    break;
            }
        }while (opcao != 0);

        System.out.println("Programa Finalizado!");

    }
}
