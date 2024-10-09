package p108_Vehiculo;

public class Vehiculo {

    private String Serie;
    private String Marca;
    private int Año;
    private double Precio;

    public Vehiculo() {
    }

    public Vehiculo(String serie, String marca, int año, double precio) {
        Serie = serie;
        Marca = marca;
        Año = año;
        Precio = precio;

    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [Serie=" + Serie + ", Marca=" + Marca + ", Año=" + Año + ", Precio=" + Precio + "]";
    }


}
