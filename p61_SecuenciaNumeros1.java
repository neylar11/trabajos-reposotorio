import java.util.Scanner;

public class p61_SecuenciaNumeros1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos renglones? ");
        int numeroRenglones = scanner.nextInt();

        for (int i = 1; i <= numeroRenglones; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }
        
        scanner.close(); 
    }
}
