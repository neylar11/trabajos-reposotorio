import java.util.InputMismatchException;
import java.util.Scanner;

public class p130_ExcepcionEdades {
    public static void main(String[] args) {
        int[] EdadesUsuarios = new int[5];

        try (Scanner luis = new Scanner(System.in)) {
            System.out.print("\033[H\033[2J");
            
            System.out.println("--- Se captura la edad de 5 personas --- ");
            for (int i = 0; i < EdadesUsuarios.length; i++) {
                while (true) {
                    try {
                        System.out.print("Ingrese la edad de la persona " + (i + 1) + ": "); EdadesUsuarios[i] = luis.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor ingresa un número entero ... ");
                        luis.next();
                    }
                }
            }
            System.out.println("\nLas edades obtenidas son las siguientes: ");
            for (int i = 0; i < EdadesUsuarios.length; i++) {
                System.out.print(EdadesUsuarios[i]);
                if (i < EdadesUsuarios.length - 1) {
                    System.out.print(" ");
                } 
            }
        }
    }
}