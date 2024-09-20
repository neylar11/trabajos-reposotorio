import java.util.Scanner;

public class p80_Angulo {

    public static String Tipoangulo(int angulo) {
        int agudoMi = 1;
        int agudoMa = 89;
        int recto = 90;
        int obtusoMi = 91;
        int obtusoMa = 179;
        int llano = 180;
        int concavoMi = 181;
        int concavoMa = 360;

        if (angulo >= agudoMi && angulo <= agudoMa) {
            return "El ángulo es agudo.";
        } else if (angulo == recto) {
            return "El ángulo es recto.";
        } else if (angulo >= obtusoMi && angulo <= obtusoMa) {
            return "El ángulo es obtuso.";
        } else if (angulo == llano) {
            return "El ángulo es llano.";
        } else if (angulo >= concavoMi && angulo <= concavoMa) {
            return "El ángulo es cóncavo.";
        } else {
            return "El ángulo no es valido,  debe ser del  0 a 360.";
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un ángulo y le diré el tipo: ");
        int angulo = scanner.nextInt();

        String resultado = Tipoangulo(angulo);
        System.out.println(resultado);
    }
}

