package matriz;

public class tresMatriz {

    public static void main(String[] args) {
        int matrizInt[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int tamanhoMatriz = matrizInt.length;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        
        System.out.println("Todos os elementos da Diagonal Principal: ");
        for (int i = 0; i < matrizInt.length; i++) {
            System.out.print(matrizInt[i][i] +" ");
        }
        System.out.println();
        
        
        System.out.println("Todos os elementos da Diagonal Secundária: ");
        for (int i = 0; i < tamanhoMatriz; i++) {
            System.out.print(matrizInt[i][tamanhoMatriz - 1 - i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < tamanhoMatriz; i++) {
            somaDiagonalPrincipal += matrizInt[i][i];
        }

        for (int i = 0; i < tamanhoMatriz; i++) {
            somaDiagonalSecundaria += matrizInt[i][tamanhoMatriz - 1 - i];
        }

        
        
        System.out.println("Soma dos os elementos da Diagonal Primária: ");
        System.out.println(somaDiagonalPrincipal);
        System.out.println("Soma dos os elementos da Diagonal Secundária: ");
        System.out.println(somaDiagonalSecundaria);
        
        
    }
}
