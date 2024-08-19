import java.util.Scanner;

public class p15_ConvertirADolares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("dame cantidad en peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Dame cotizacion de dolar: ");
        double dolar = scanner.nextDouble();
        
        

            double Equivalente = peso/dolar;
            
            System.out.printf("En dolares seria: %.2f%n", Equivalente);
        
        
        scanner.close();
    }
}