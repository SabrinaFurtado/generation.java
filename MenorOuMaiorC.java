package maiorMenor;

import java.util.Scanner;

public class MenorOuMaiorC {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	       
	     System.out.println("Digite o valor de A:");
	     int a = scanner.nextInt();
	        
	     System.out.println("Digite o valor de B:");
	     int b = scanner.nextInt();
	        
	     System.out.println("Digite o valor de C:");
	     int c = scanner.nextInt();
	       
	     int somaAB = a + b;

	        if (somaAB > c) {
	            System.out.println("A soma de A + B é maior do que C.");
	           } else if (somaAB < c) {
	            System.out.println("A soma de A + B é menor do que C.");
	              } else {
	            System.out.println("A soma de A + B é igual a C.");
	               }
	        
	   
	        scanner.close();
	    }
}
