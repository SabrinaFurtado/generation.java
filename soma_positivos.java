package somarPositivos;

import java.util.Scanner;

public class soma_positivos {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int numero;
       int somaPositivos = 0;
       
       do {
    	   System.out.println("Digite um número inteiro (ou 0 para sair): ");
    	   numero = scanner.nextInt();
    	
    	   if (numero > 0) {
    		   somaPositivos += numero;
    	   }   
       } while (numero != 0);
       
       System.out.println("A soma dos números positivos é: "+somaPositivos);
       
       
       scanner.close();

	}

}
