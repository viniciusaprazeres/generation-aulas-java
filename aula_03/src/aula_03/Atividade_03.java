package aula_03;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade = 1, pessoasMenos21 = 0, pessoasMais50 = 0;
		
		
		while (idade >= 0) {
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade >= 0 && idade <= 21)
				pessoasMenos21 ++;
			else if(idade >= 50)
				pessoasMais50 ++;
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + pessoasMenos21);
		System.out.println("Total de pessoas maiores de 50 anos: " + pessoasMais50);
		
		leia.close();

	}

}
