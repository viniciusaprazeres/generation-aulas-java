package aula_02;

import java.util.Scanner;

public class Lista2Atividade6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigo;
		float salario;
		
		
		System.out.println("1 Gerente 10%");
		System.out.println("2 Vendedor 7%");
		System.out.println("3 Supervisor 9%");
		System.out.println("4 Motorista 6%");
		System.out.println("5 Estoquista 5%");
		System.out.println("6 Técnico de TI 8%");
		
		
		System.out.println("Digite o nome do colaborador: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite o código do cargo do colaborador (1 a 6): ");
		codigo = leia.nextInt();
		
		
		switch (codigo) {
		case 1:
			System.out.println("Digite o salário do colaborador R$: ");
			salario = leia.nextFloat();
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário reajustado R$: %.2f", (salario + (10 * salario)/100));
			break;
		case 2:
			System.out.println("Digite o salário do colaborador R$: ");
			salario = leia.nextFloat();
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário reajustado R$: %.2f", (salario + (7 * salario)/100));
			break;
		case 3:
			System.out.println("Digite o salário do colaborador R$: ");
			salario = leia.nextFloat();
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário reajustado R$: %.2f", (salario + (9 * salario)/100));
			break;
		case 4:
			System.out.println("Digite o salário do colaborador R$: ");
			salario = leia.nextFloat();
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário reajustado R$: %.2f", (salario + (6 * salario)/100));
			break;
		case 5:
			System.out.println("Digite o salário do colaborador R$: ");
			salario = leia.nextFloat();
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário reajustado R$: %.2f", (salario + (5 * salario)/100));
			break;
		case 6:
			System.out.println("Digite o salário do colaborador R$: ");
			salario = leia.nextFloat();
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Salário reajustado R$: %.2f", (salario + (8 * salario)/100));
			break;
		default:
			System.out.println("Código inválido!");
			break;
		}
		
		leia.close();

	}

}
