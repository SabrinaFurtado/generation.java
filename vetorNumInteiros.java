package vetores;

public class vetorNumInteiros {

    public static void main(String[] args) {
        int[] numeros = {5, 8, 9, 6, 7, 3, 4, 1, 2, 10};
        int soma = 0;
        float media = 0;

        System.out.println("Lista completa: ");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println(" "); 
        

        System.out.println("Números ímpares: ");
        for (int i : numeros) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        
        
        System.out.println("Números pares: ");
        for (int i : numeros) {
        	if (i % 2 == 0) {
        		System.out.print(i + " ");
        	}
        }
        System.out.println(" ");
        
        System.out.println("Soma de todos os números: ");
        for (int i : numeros) {
        	soma += i;
        }
        System.out.println(soma + " ");
        
        System.out.println("A média de todos os números: ");
        for (int i : numeros) {
        	media = (i) / 2;
        }
        System.out.println(media + " ");
    }
    
   
}
