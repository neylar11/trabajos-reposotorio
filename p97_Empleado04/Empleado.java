package p97_Empleado04;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Casado;
   
    public Empleado() {}

    public Empleado(String nombre, int edad, char sexo, boolean casado) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
       Casado = casado;

    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public boolean isCasado() {
        return Casado;
    }

    @Override
    public String toString() {
        return "Empleado [Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Casado=" + Casado + "]";
    }
    

    
}
