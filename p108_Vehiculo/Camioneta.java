package p108_Vehiculo;



public class Camioneta extends Vehiculo{
    private double Capacidad;
    private int Ejes;

    public Camioneta(){}

    public Camioneta(String serie, String marca, int año, double precio, double capacidad, int ejes){
     Capacidad = capacidad;
     Ejes = ejes;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(double Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getEjes() {
        return Ejes;
    }

    public void setEjes(int Ejes) {
        this.Ejes = Ejes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camioneta{");
        sb.append(super.toString());
        sb.append("Capacidad=").append(Capacidad);
        sb.append(", Ejes=").append(Ejes);
        sb.append('}');
        return sb.toString();
    }

   

}
