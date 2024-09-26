package p95_Empleado02;

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        empleado1.setNombre("carlos");
        empleado1.setEdad(25);
        empleado2.setNombre("maria");
        empleado2.setEdad(22);

        System.out.print("\033¨[H\033[2J");
        System.out.flush();
        System.out.println("Empleado1 Nombre" + empleado1.getNombre());
        System.out.println("Empleado1 Edad" + empleado1.getEdad());
        System.out.println(empleado1.toString());
        System.out.println("Empleado2 Nombre" + empleado2.getNombre());
        System.out.println("Empleado2 Edad" + empleado2.getEdad());
        System.out.println(empleado2.toString());

    }

}
