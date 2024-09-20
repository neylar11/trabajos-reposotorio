/**
 * p77_DiaSemana programa con una función que pida un número entero entre 1 y 7 y devuelva el día de la semana con
letra.
 */
import java.util.Scanner;
public class p77_DiaSemana {
    public static String diasSemana(int dia) {
        
        switch (dia) {
            case 1: return "Domingo";
            case 2: return "Lunes";
            case 3: return "Martes";
            case 4: return "Miércoles";
            case 5: return "Jueves";
            case 6: return "Viernes";
            case 7: return "Sábado";
            default: return "El número que ingresó no está dentro del rango";
        
    
  }
}
public static void main(String[] args) {
    
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Dado un número entre 1 y 7 imprime el dia de la semana\n ");
    System.out.print("Dame el día con número ? ");
    Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();
        String resultado = diasSemana(dia);
        System.out.println("El numero corresponde al dia: " + resultado);
        
        scanner.close();
}
}