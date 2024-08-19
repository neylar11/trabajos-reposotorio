import java.util.Scanner;

public class p11_CalcularAngulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el ángulo 1 del triángulo (en grados): ");
        double angulo1 = scanner.nextDouble();
        
        System.out.print("Ingrese el ángulo 2 del triángulo (en grados): ");
        double angulo2 = scanner.nextDouble();
        

            double angulo3 = calcularTercerAngulo(angulo1, angulo2);
            
            System.out.println("El tercer ángulo es: " + angulo3 + " grados.");
        
        
        scanner.close();
    }

    public static double calcularTercerAngulo(double angulo1, double angulo2) {
        
        return 180 - (angulo1 + angulo2);
    }
}
