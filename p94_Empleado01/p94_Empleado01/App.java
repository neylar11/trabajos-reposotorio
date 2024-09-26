package p94_Empleado01;

public class App {
    public static void main(String[] args) {
        
    
    Empleado empleado1 = new Empleado();
    Empleado empleado2 = new Empleado();

    empleado1.Nombre = "juan perez";
    empleado1.Edad = 45;

    empleado2.Nombre = "maria lopez";
    empleado2.Edad = 25;

    Empleado empleado3;
    empleado3 = new Empleado();
    empleado3.Nombre = "El Patito";
    empleado3.Edad = 1;

    System.out.print("\033¨[H\033[2J");System.out.flush();
    System.out.println("Empleado 1 Nombre:" + empleado1.Nombre);
    System.out.println("Empleado 1 Edad:" + empleado1.Edad);
    System.out.println(empleado1.toString());
    System.out.println("Empleado 2 Nombre:" + empleado1.Nombre);
    System.out.println("Empleado 2 Edad:" + empleado2.Edad);
    System.out.println(empleado1.toString());
    System.out.println("\nempleado3");
    System.out.println(empleado3.toString());

}
}