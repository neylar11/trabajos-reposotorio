
public class Sedan extends Maquina implements Familiar {
    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico es un Sedan");
    }


    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna es un Sedan");
    }

    public void chasisTres() {
        System.out.println("Es de tipo familiar con carrocería en tres partes es un Sedan");
    }

   
    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");
    }
}
