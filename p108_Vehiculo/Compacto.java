package p108_Vehiculo;

public class Compacto extends Vehiculo {
    private int Pasajero;
    private int Puerta;

    public Compacto(){}

    public Compacto(String serie, String marca, int año, double precio, int pasajero, int puerta){
        super(serie, marca, año, precio );
        Puerta = puerta;
        Pasajero = pasajero;
        

    }

    public int getPasajero() {
        return Pasajero;
    }

    public void setPasajero(int Pasajero) {
        this.Pasajero = Pasajero;
    }

    public int getPuerta() {
        return Puerta;
    }

    public void setPuerta(int Puerta) {
        this.Puerta = Puerta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Compacto{");
        sb.append(super.toString());
        sb.append("Pasajero=").append(Pasajero);
        sb.append(", Puerta=").append(Puerta);
        sb.append('}');
        return sb.toString();
    }

    

    
}
