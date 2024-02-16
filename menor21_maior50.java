package idadeMaiorMenor;

import java.util.Scanner;

public class menor21_maior50 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int idade; 
		int totalMenor21 = 0;
		int totalMaior50 = 0;
		
		System.out.println("Digite as idades das pessoas (Digite uma idade negativa para sair): ");
		idade = scanner.nextInt();
		
		
		while (idade >= 0) {
			if (idade <21) {
				totalMenor21++;
		    } else if (idade >50) {
		    	totalMaior50++;
		    }
			
			idade = scanner.nextInt();		
			}
		
		System.out.println("Total de pessoas com menos de 21 anos: "+totalMenor21);
		System.out.println("Total de pessoas com mais de 50 anos: "+totalMaior50);
		
		
		scanner.close();
	}
	

}
