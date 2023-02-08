package aula_01;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);

		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		
		System.out.println("Digite o salário bruto R$: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o adicional noturno R$: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite os descontos R$: ");
		descontos = leia.nextFloat();
		
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5)) - descontos;
		
		
		System.out.printf("O salário líquido do funcionário é de R$: %.2f", salarioLiquido);
		
	}

}
