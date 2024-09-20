/**
 * p76_NumeroMenor  programa con funcion que pida 4 numeros y devuelva el menor
 */
import java.util.Scanner;
public class p76_NumeroMenor {
    public static float menor (float num1,float num2,float num3, float num4) {
   float men = num1;

   if (num2 < men){
    men = num2;
   }
   if (num3 < men){
    men = num3;
   }
   if (num3 < men){
    men = num3;
   }
   return men ;
    } 
    public static void main(String[] args) {
        float num1,num2,num3, num4;
        Scanner luis = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("dame un numero"); num1 =luis.nextFloat();
        System.out.println("dame un segundo numero"); num2 =luis.nextFloat();
        System.out.println("dame un tercernumero"); num3 =luis.nextFloat();
        System.out.println("dame un  cuarto numero"); num4 =luis.nextFloat();
        float resultado = menor(num1,num2,num3,num4);
        System.out.println("el numero menor es: " + resultado);
     luis.close();
    }
    
}