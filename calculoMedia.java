package calcularMedia;

public class calculoMedia {
    public static void main(String[] args) {
        
        float nota1 = 10;
        float nota2 = 8;
        float nota3 = 7;
        float nota4 = 7;
        
        float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("\nMédia final: " + mediaFinal);
    }
}
