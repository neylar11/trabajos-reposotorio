/**
 * p78_MedidasLongitud
 */
import java.util.Scanner;
public class p78_MedidasLongitud {
    

        
        public float centimetros(float pulgadas) {
            return  pulgadas * 2.54f;
        }
    
    
        public float pies(float metros) {
            return metros * 3.281f;
        }
    
        public static void main(String[] args) {
            System.out.print("\033[H\033[2J");
    System.out.flush();
    int Conversión;
        
        p78_MedidasLongitud conversor = new p78_MedidasLongitud();
        Scanner luis = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
           
            System.out.println("Conversión de medidas ");
            System.out.println("1. pulgadas a centimetros\n2. metros a pies. ");
            System.out.println("Elige ? "); Conversión = luis.nextInt();
            if (Conversión == 1) {
                System.out.print("Introduce las pulgadas: ");
                float pulgadas = luis.nextFloat();
                float resultadoCentimetros = conversor.centimetros(pulgadas);
                System.out.println(pulgadas + " pulgadas son " + resultadoCentimetros + " centímetros.");
            } else if (Conversión == 2) {
                System.out.print("Introduce los metros: ");
                float metros = luis.nextFloat();
                float resultadoPies = conversor.pies(metros);
                System.out.println(metros + " metros son " + resultadoPies + " pies.");
            } else {
                System.out.println("Opción no válida.");
            }

            System.out.println(); 
        

        luis.close();
    }
}