package lacoRepeticao_for;

import java.util.Scanner;

public class atividade_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro número: ");
        int primeiroNum = scanner.nextInt();
        
        System.out.println("Digite o Segundo número: ");
        int segundoNum = scanner.nextInt();
        
        
        if (primeiroNum >= segundoNum) {
        	System.out.println("Intervalo Inválido. O primeiro número deve ser menor do que o segundo número ");
        }
        
        System.out.println("Multiplos de 3 e 5 no intervalo ["+primeiroNum +","+segundoNum + "]:");
        for (int i = primeiroNum; i < segundoNum; i++) {
        	if (i % 3 == 0 && i % 5 == 0) {
        		System.out.println(i + " é multiplo de 3 e 5");
        	}
        }
	}

}
