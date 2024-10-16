package p112_ControlVentas;

public class VentaCredito extends Venta{
    private int Meses;
    private double interes;
  
    public VentaCredito(String articulo, int cantidad, double precio, int meses, double interes) {
        super(articulo, cantidad, precio);
        Meses = meses;
        this.interes = interes;
    }
    @Override
    public double getTotalVenta() {
        Total = Total - (Meses * interes);
        return Total;
    }
    @Override
    public String toString() {
        return "VentaCredito [" + super.toString() + "Meses=" + Meses + ", interes=" + interes + ", getTotalVenta()=" + getTotalVenta() + "]";
    }
}
    


