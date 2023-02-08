package aula_01;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		
		float salario, abono, novoSalario;
		
		
		System.out.println("Digite o Salário R$: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono R$: ");
		abono = leia.nextFloat();
		
		
		novoSalario = salario + abono;
		
		
		System.out.printf("O Novo Salário é de R$: %.2f", novoSalario);
		
	}

}
