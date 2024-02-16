package escolherMenu;

import java.util.Scanner;

public class MenuLanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	      System.out.println("Digite o código do item (1 a 6):");
	      int codigo = scanner.nextInt();

	      System.out.println("Digite a quantidade comprada:");
	      int quantidade = scanner.nextInt();

	      float preco = 0;
	      String produto = "";

	        switch (codigo) {
	            case 1:
	                produto = "Cachorro Quente";
	                preco = 10.00f;
	                break;
	            case 2:
	                produto = "X-Salada";
	                preco = 15.00f;
	                break;
	            case 3:
	                produto = "X-Bacon";
	                preco = 18.00f;
	                break;
	            case 4:
	                produto = "Bauru";
	                preco = 12.00f;
	                break;
	            case 5:
	                produto = "Refrigerante";
	                preco = 8.00f;
	                break;
	            case 6:
	                produto = "Suco de Laranja";
	                preco = 13.00f;
	                break;
	            default:
	                System.out.println("Código de item inválido!");
	                return;
	        }

	        float valorTotal = quantidade * preco;
	        System.out.println("Item comprado: " + produto);
	        System.out.println("Valor total da conta: R$" + valorTotal);
	    }
	
	}

