package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaArray {
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<Double>();
        Scanner leia = new Scanner(System.in);

        int opcao = 0;
        double nota = 0.0;

        do {
            System.out.println("1 - Cadastrar notas");
            System.out.println("2 - Listar todas as notas");
            System.out.println("3 - Procurar uma nota");
            System.out.println("4 - Remover uma nota");
            System.out.println("5 - Atualizar uma nota");
            System.out.println("6 - Sair do sistema");
            System.out.println("Digite a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite uma nota entre 1 e 10: ");
                    nota = leia.nextDouble();
                    notas.add(nota); // Adiciona elementos no ArrayList
                    break;
                case 2:
                    System.out.println("Listar todas as notas");

                    if (notas.isEmpty())
                        System.out.println("Base de dados vazia!");
                    else
                        notas.forEach(System.out::println); // Percorre a Collection e mostra na tela
                    break;
                case 3:
                    System.out.println("Procurar uma nota");
                    System.out.println("Digite a nota: ");
                    nota = leia.nextDouble();
                    System.out.println("A nota " + nota + " existe?" + notas.contains(nota));
                    if(notas.contains(nota)) // Procura algo dentro da ArrayList
                        System.out.println("o índice da nota procurada é: " + notas.indexOf(nota));
                    break;
                case 4:
                    System.out.println("Remover nota");
                    System.out.println("Digite a nota: ");
                    nota = leia.nextDouble();
                    notas.remove(nota); // Remove algo da ArrayList
                    //notas.remove(notas.indexOf(nota));
                    break;
                case 5:
                    System.out.println("Atualizar nota");
                    System.out.println("Digite a nota atual: ");
                    nota = leia.nextDouble();
                    System.out.println("Digite a nova nota: ");
                    double novaNota = leia.nextDouble();
                    notas.set(notas.indexOf(nota), novaNota); // Localiza o primeiro e substitui pelo segundo
                    break;
                default:
                    if(opcao > 6)
                        System.out.println("Opção inválida!");
                    break;
            }

        }while (opcao != 6);




    }
}
