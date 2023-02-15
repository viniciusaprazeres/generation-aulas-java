package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();
        Scanner leia = new Scanner(System.in);

        int opcao;
        String cliente;

        do {
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar Cliente na Fila            ");
            System.out.println("            2 - Listar todos os Clientes             ");
            System.out.println("            3 - Retirar Cliente da Fila              ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada: ");
            System.out.println("                                                     ");

            opcao = leia.nextInt();


            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    leia.skip("\\R?");
                    cliente = leia.nextLine();
                    fila.add(cliente);
                    System.out.println("Fila: ");
                    fila.forEach(System.out::println);
                    System.out.println("Cliente Adicionado!");
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Lista de clientes na fila: ");
                        fila.forEach(System.out::println);
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Fila: ");
                        fila.poll();
                        fila.forEach(System.out::println);
                        System.out.println("O cliente foi chamado!");
                    }
                    break;
                default:
                    if (opcao != 0)
                        System.out.println("Opção não encontrada!");
                    break;
            }
        } while (opcao != 0);

        System.out.println("Programa Finalizado!");

    }
}
