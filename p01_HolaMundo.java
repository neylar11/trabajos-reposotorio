// Envia un saludo a la pantalla//

public class p01_HolaMundo {
    public static void main(String [] args) {
        String amigo = "adrian";
        String hermano = "Reynaldo";
        String mensaje = String. format ("Tanto &s como &s desean aprender Java", amigo, hermano);
       
        System.out.println ("Hola Mundo desde el Lenguaje Java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a Java");
        System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
        System.out.println("n" + mensaje) ;

    }
}
