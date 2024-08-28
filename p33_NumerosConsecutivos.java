import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);
        System.out.print("Dame el primer numero ? ");int num1 = scanner.nextInt();
        System.out.print("Dame el seguno numero ? "); int num2 = scanner.nextInt();
        System.out.print("Dame el tercer numero ? "); int num3 = scanner.nextInt();

        boolean sonconsecutivos =(num2 == num1 + 1 && num3 == num2 + 1)|| (num2 == num1 - 1 && num3 == num2 - 1);
        if(sonconsecutivos){
            System.out.println("son consecutivos");
        } else {
            System.out.println("no son consecutivos");
        }
        scanner.close();
}
}