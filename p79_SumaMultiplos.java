import java.util.Scanner;

public class p79_SumaMultiplos {
    public static int SumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el inicio del rango: ");
        int ini = scanner.nextInt();
        System.out.print("Ingrese el fin del rango: ");
        int fin = scanner.nextInt();
        
        if (ini >= fin) {
            System.out.println("El inicio del rango debe ser menor que el fin.");
            return;
        }

        int suma3 = SumaMultiplos(ini, fin, 3);
        int suma4 = SumaMultiplos(ini, fin, 4);

        System.out.println("La suma de múltiplos de 3 entre " + ini + " y " + fin + " es: " + suma3);
        System.out.println("La suma de múltiplos de 4 entre " + ini + " y " + fin + " es: " + suma4);
    }
}