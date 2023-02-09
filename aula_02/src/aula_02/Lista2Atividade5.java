package aula_02;

import java.util.Scanner;

public class Lista2Atividade5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int item, quantidade;
		
		System.out.println("1 Cachorro Quente R$ 10.00");
		System.out.println("2 X-Salada R$ 15.00");
		System.out.println("3 X-Bacon R$ R$ 18.00");
		System.out.println("4 Bauru R$ 12.00");
		System.out.println("5 Refrigerante R$ 8.00");
		System.out.println("6 Suco de laranja R$ 13.00");
		
		
		System.out.println("Digite o código do produto (1 a 6): ");
		item = leia.nextInt();
		
		
		switch (item) {
		case 1:
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total R$: " + (quantidade * 10.00));
			break;
		case 2:
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total R$: " + (quantidade * 15.00));
			break;
		case 3:
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total R$: " + (quantidade * 18.00));
			break;
		case 4:
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			System.out.println("Bauru");
			System.out.println("Valor total R$: " + (quantidade * 12.00));
			break;
		case 5:
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			System.out.println("Refrigerante");
			System.out.println("Valor total R$: " + (quantidade * 8.00));
			break;
		case 6:
			System.out.println("Digite a quantidade: ");
			quantidade = leia.nextInt();
			System.out.println("Suco de laranja");
			System.out.println("Valor total R$: " + (quantidade * 13.00));
			break;
		default:
			System.out.println("Código do produto inválido!");
		}
		
		leia.close();

	}

}
