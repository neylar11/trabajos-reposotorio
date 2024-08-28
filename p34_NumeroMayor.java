import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);
        System.out.print("Dame el primer numero ? ");int num1 = scanner.nextInt();
        System.out.print("Dame el seguno numero ? "); int num2 = scanner.nextInt();
        System.out.print("Dame el tercer numero ? "); int num3 = scanner.nextInt();
     int mayor =num1;
        if (num2 > mayor) {
        mayor = num2;
     }
     if(num3 > mayor) {
        mayor = num3;
     }
     System.out.println("el numero mayor es:" + mayor);
     scanner.close();
    }
}