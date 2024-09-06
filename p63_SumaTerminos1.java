import java.util.Scanner;

public class p63_SumaTerminos1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos términos? ");
        int numeroTerminos = scanner.nextInt();
        
        double suma = 0.0;
        StringBuilder salida = new StringBuilder();
        
        for (int i = 1; i <= numeroTerminos; i++) {
            if (i > 1) {
                salida.append("+");
            }
            salida.append("1/");
            salida.append(i);
            suma += 1.0 / i;
        }
        
        System.out.println("Salida: " + salida.toString());
        System.out.printf("Suma %.12f%n", suma);
        
        scanner.close();
    }
}
