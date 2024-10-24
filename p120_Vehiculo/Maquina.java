
public class Maquina {
    private String nombre;
    private String propietario;
    private int pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Maquina [Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]";
    }

    public void repostar() {
        System.out.println("Repostando ...");
    }

    public void arrancar() {
        System.out.println("Arrancando ...");
    }

    public void frenar() {
        System.out.println("Frenando ...");
    }
}
