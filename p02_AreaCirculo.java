//p02_AreaCirculo - calcular el area del circulo

import java.util.Scanner;

public class p02_AreaCirculo {
    public static void main(String [] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el area de un circulo\n");
        System.err.println("dame el area deL circulo");
        radio = lradio.nextFloat();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println(" \nEl circulo con radio de " + radio + " tiene un area de " + area); 
    }
}
