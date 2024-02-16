package salario;

import java.util.Scanner;

public class ReajusteSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	     System.out.println("Digite o nome do colaborador:");
	     String nome = scanner.nextLine();

	     System.out.println("Digite o código do cargo do colaborador (1 a 6):");
	     int codigoCargo = scanner.nextInt();

	     System.out.println("Digite o salário do colaborador:");
	     float salario = scanner.nextFloat();

	     float reajuste = 0;

	       switch (codigoCargo) {
	          case 1:
	              reajuste = 0.10f; // 10%
	              System.out.println("Cargo: GERENTE");
	              break;
	          case 2:
	              reajuste = 0.07f; // 7%
	              System.out.println("Cargo: VENDEDOR");
	              break;
	          case 3:
	              reajuste = 0.09f; // 9%
	              System.out.println("Cargo: SUPERVISOR");
	              break;
	          case 4:
	              reajuste = 0.06f; // 6%
	              System.out.println("Cargo: MOTORISTA");
	              break;
	          case 5:
	              reajuste = 0.05f; // 5%
	              System.out.println("Cargo: ESTOQUISTA");
	              break;
	          case 6:
	              reajuste = 0.08f; // 8%
	              System.out.println("Cargo: TÉCNICO DE TI");
	              break;
	           default:
	              System.out.println("Código de cargo inválido.");
	              return;
	      }

	        float novoSalario = salario + (reajuste * salario);
	        System.out.println("Nome do Colaborador: " + nome);
	        System.out.println("Novo Salário: " + novoSalario);
    }
}
