import java.util.Scanner;

public class p13_VolumenCilindro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de radio: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese el valor de altura: ");
        double altura = scanner.nextDouble();
        
        

            double volumen = Math.PI * (radio * radio) * altura;
            
            System.out.printf("La temperatura en grados Celsius es: %.2f%n", volumen);
        
        
        scanner.close();
    }
}