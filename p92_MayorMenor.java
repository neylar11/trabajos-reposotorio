import java.util.Scanner;

public class p92_MayorMenor {
    public static void main(String[] args) {
        int n = 0;
        float[] numeros;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Cuantos numeros deseas procesar? ");
        n = obj.nextInt();

        numeros = new float[n];

        System.out.printf("Introduce los numeros:\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("Numero %d: ", i + 1);
            numeros[i] = obj.nextFloat(); 
        }

        for (float num : numeros) { 
            System.out.println(num + "");
        }

        float mayor = numeros[0];
        float menor = numeros[0];

        for (int i = 1; i < n; i++) { 
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) { 
                menor = numeros[i];
            }
        }

        System.out.printf("El mayor numero es: %.2f\n", mayor);
        System.out.printf("El menor numero es: %.2f\n", menor);
        
        obj.close();
    }
}

