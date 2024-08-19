import java.util.Scanner;

public class p10_HipotenusaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();
        
        double hipotenusa = calcularHipotenusa(lado1, lado2);
        
        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
        
        scanner.close();
    }

    public static double calcularHipotenusa(double lado1, double lado2) {
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
    }
}
