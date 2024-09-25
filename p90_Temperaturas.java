/**
 * p90_Temperaturas
 */
public class p90_Temperaturas {
    public static void main(String[] arg) {
        double[] temperatura = {2.34, 44.56, 7.89, 0.5, 2.5, 4.67, 40.3, 22.35, 56.22};

        System.out.println("Primer elemento: " + temperatura[0]);
        System.out.println("Tercer elemento: " + temperatura[2]);
        
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] > 10) {
                temperatura[i] = 0;
            }
        }

        System.out.println("Elementos después de la modificación:");
        for (double temp : temperatura) {
            System.out.println(temp);
        }
    }
}
