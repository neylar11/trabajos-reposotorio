import java.util.Scanner;

public class p91_MayoresPromedio  
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de calificaciones: ");
        int n = scanner.nextInt();
        
        float[] calificaciones = new float[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }
        
        System.out.println("Las calificaciones ingresadas son:");
        for (float calificacion : calificaciones) {
            System.out.println(calificacion);
        }
        
        float suma = 0;
        for (float calificacion : calificaciones) {
            suma += calificacion;
        }
        float promedio = suma / n;

        System.out.printf("Suma de calificaciones: %.2f%n", suma);
        System.out.printf("Promedio de calificaciones: %.2f%n", promedio);
        
        System.out.println("Calificaciones mayores al promedio:");
        int contador = 0;
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.println(calificacion);
                contador++;
            }
        }
        
        System.out.println("Número de calificaciones mayores al promedio: " + contador);
        
        scanner.close();
    }
}
