package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int goles, int partidos ) {
        super(nombre, sexo, descripcion, salario);
        this.Partidos = partidos;
        this.Goles = goles;
        this.Total = salario + getBono(); 
    }

    @Override
    public double getBono() {
        return (getSalario() * 0.10) + (Partidos * 50) + (goles * 5);
    }

    @Override
    public String toString() {
        return "JugadorActivo [" + super.toString() + ", Partidos=" + Partidos + ", Goles=" + goles + 
               ", Bono=" + getBono() + ", Total=" + total + "]";
    }
}