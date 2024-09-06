import java.util.Scanner;

public class p64_SumaTerminos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos términos? ");
        int numeroTerminos = scanner.nextInt();
        
        int suma = 0;
        StringBuilder salida = new StringBuilder();
        
        for (int i = 1; i <= numeroTerminos; i++) {
            int termino = Integer.parseInt("1".repeat(i));
            if (i > 1) {
                salida.append("+");
            }
            salida.append(termino);
            suma += termino;
        }
        
        System.out.println(salida.toString());
        System.out.println("Suma " + suma);
        
        scanner.close();
    }
}
