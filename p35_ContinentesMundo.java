import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new
        Scanner(System.in);
        System.out.println("elige un numero del 1 al 6 para ver que continente es");
        System.out.print("Dame un numero ");
        int continente = new Scanner(System.in).nextInt();
        switch (continente) {
            case 1 : System.out.println("Asia "); break;
            case 2 : System.out.println("Africa"); break;
            case 3 : System.out.println("América del Norte"); break;
            case 4 : System.out.println("América del Sur"); break;
            case 5 : System.out.println("Antártida"); break;
            case 6 : System.out.println("Europa"); break;
            default : System.out.println("el numero no es del 1 al 6"); break;
        }
        scanner.close();
    }
}