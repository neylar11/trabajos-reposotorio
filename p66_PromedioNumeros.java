/**
 *  Calcula el promedio de tres números usando una función
*/ 
import java.util.Scanner;

public class p66_PromedioNumeros {
public static float promedio(float num1, float num2, float num3) {
float suma, prom;
suma = num1 + num2 + num3;
prom = suma /3;
return prom;
}

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("Dados tres numeros flotantes, obtener su promedio");

        float prom = promedio(10, 9, 7);
        System.out.println("El promedio es" + prom);

        System.out.println("El promedio es" + promedio(10, 10, 10));

        float n1, n2, n3, prom;
        Scanner obj = new Scanner(System.in);
        System.out.flush();
        System.out.print("Dame número 1 : ");
        n1 = obj.nextFloat();
        System.out.print("Dame número 2 : ");
        n2 = obj.nextFloat();
        System.out.print("Dame número 3 : ");
        n3 = obj.nextFloat();
        prom = promedio(n1, n2, n3);
        System.out.printf("\nEl promedio es %.2f", prom);
    }

}