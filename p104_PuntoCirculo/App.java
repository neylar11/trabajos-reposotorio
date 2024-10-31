package p104_PuntoCirculo;

public class App {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Circulo circulo2;
        circulo2 = new Circulo();
        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println("Circulo 1 Area : " + circulo1.getArea());
        System.out.println("Circulo 1 Circunferencia : " + circulo1.getCircunferencia());
        System.out.println("Circulo 1 Centro : " + circulo1.getCentro());
        System.out.println("Distancia a Circulo 2 : " + circulo1.getCentro().getDistancia(circulo2.getCentro()));
    }
}