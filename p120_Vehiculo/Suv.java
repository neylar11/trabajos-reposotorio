
public class Suv extends Maquina implements TodoTerreno {
    public Suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    
    public void sistemaElectrico() {
        System.out.println("Es un automóvil con sistema eléctrico es una Suv");
    }


    public void combustionInterna() {
        System.out.println("Es un automóvil de combustión interna es una Suv");
    }


    public void traccion4x4() {
        System.out.println("Es un automóvil con tracción 4 x 4 es una Suv");
    }

    public void chasisIndependiente() {
        System.out.println("Es un automóvil con chasis independiente es una Suv");
    }
}
