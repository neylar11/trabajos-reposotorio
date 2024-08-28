import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] calificaciones = new double[5];
        double suma = 0.0;

        System.out.println("Introduce las 5 calificaciones:");

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;

        System.out.println("Tu promedio es: " + promedio);

        if (promedio > 0 && promedio <= 6) {
            System.out.println("Quedas reprobado.");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Pasas de panzazo.");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Muy bien, puedes mejorar.");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelente, sigue así.");
        } else if (promedio > 9 && promedio <= 10) {
            System.out.println("Perfecto, tu esfuerzo valió la pena.");
        } else {
            System.out.println("Las calificaciones deben estar entre 0 y 10.");
        }

        scanner.close();
    }
}
