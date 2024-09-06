import java.util.Scanner;

public class p62_SecuenciaNumeros2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el número de renglones
        System.out.print("¿Cuántos renglones? ");
        int numeroRenglones = scanner.nextInt();
        
        // Imprimir la secuencia
        for (int i = 1; i <= numeroRenglones; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
        
        scanner.close(); // Cerrar el scanner
    }
}
