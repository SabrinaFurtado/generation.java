package calculoBruto;
public class CalculoSalario {
    public static void main(String[] args) {

        float salarioBruto = 2000.00f;
        float adicionalNoturno = 500.00f;
        float horasExtras = 100.00f;
        float descontos = 200.00f;
        
        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
        
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Adicional Noturno: " + adicionalNoturno);
        System.out.println("Horas Extras: " + horasExtras);
        System.out.println("Descontos: " + descontos);
        System.out.println("\nSalário Líquido: " + salarioLiquido);
    }

    @Override
    public String toString() {
        return "CalculoSalario []";
    }
}
