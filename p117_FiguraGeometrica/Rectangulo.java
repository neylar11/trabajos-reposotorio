package p117_FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica, Ajustar {
    private double Largo;
    private double Ancho;

    public Rectangulo(double largo, double ancho) {
        Largo = largo;
        Ancho = ancho;
    }

    @Override
    public double getArea() {
        return Largo + Ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * Largo + 2 * Ancho;
    }

    public void ajustar(double porcentaje) {
        Largo = Largo + (Largo * porcentaje);
        Ancho = Ancho + (Ancho * porcentaje);
    }

    @Override
    public String toString() {
        return "Rectangulo [Largo=" + Largo + ", Ancho=" + Ancho + ", Area = " +
                String.format("%.2f", getArea()) + ", Perimetro= " +
                String.format("%.2f", getPerimetro()) + "]";
    }
}