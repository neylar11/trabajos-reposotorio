import java.util.Scanner;

public class p38_AceptarEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);
        System.out.print("Dame tu nombre ");
        String nombre = scanner.nextLine();

        System.out.println("¿cual es tu sexo? ('mujer' o 'hombre')");
        String sexo = scanner.nextLine().toLowerCase();
        
        if (sexo.equals("mujer")) {   
        System.out.println("¿Cual es tu edad?");
        int edad = scanner.nextInt();
            scanner.nextLine();
            if (edad >= 21) {

                System.out.print("Dame una calificacion ");
                double primera = scanner.nextDouble();
                System.out.print("Dame una segunda calificacion ");
                double segunda = scanner.nextDouble();
                System.out.print("Dame una tercera calificacion ");
                double tercera = scanner.nextDouble();
                double promedio = (primera + segunda + tercera) / 3;
                
                System.out.println("Calificaciones ingresadas:");
                System.out.println("1. " + primera);
                System.out.println("2. " + segunda);
                System.out.println("3. " + tercera);
                System.out.println("Promedio de calificaciones: " + promedio);


                if (promedio >= 8 && promedio <= 9.5) {
                    System.out.println("Felicidades, has sido aceptada en la Universidad Kitty Kat SA.");
                } else {
                    System.out.println("Lo siento, no fuiste aceptada en la Universidad Kitty Kat SA porque tu promedio no está en el rango de 8 a 9.5.");
                }
            } else {
                System.out.println("Lo siento, no fuiste aceptada en la Universidad Kitty Kat SA porque tu edad es menor de 21.");
            }
        } else {
            System.out.println("Lo siento, no fuiste aceptada en la Universidad Kitty Kat SA porque este programa está diseñado solo para mujeres.");
        }

        scanner.close();
    }
}