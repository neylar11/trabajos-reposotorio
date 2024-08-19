import java.util.Scanner;

public class p14_CalculaTiempo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de horas: ");
        int horas = scanner.nextInt();
        
        int dias = horas / 24;
        int horasRestantes = horas % 24;
        int minutos = horasRestantes * 60;
        int segundos = minutos * 60;
        
        System.out.printf("Equivalente en días: %d días%n", dias);
        System.out.printf("Horas restantes: %d horas%n", horasRestantes);
        System.out.printf("Equivalente en minutos: %d minutos%n", minutos);
        System.out.printf("Equivalente en segundos: %d segundos%n", segundos);
    
        scanner.close();
    }
}
