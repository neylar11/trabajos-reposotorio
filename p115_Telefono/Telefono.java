package p115_Telefono;

public class Telefono implements Gps, Radio {

    @Override
    public void obtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas (0,0) ...");

    }

    @Override
    public void detenerRadio() {
        System.out.println("Deteniendo radio ...");
    }

    @Override
    public void iniciarRadio() {
        System.out.println("iniciando radio ...");
    }
}