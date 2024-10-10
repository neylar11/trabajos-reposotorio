package p109_FormaV2;

abstract class Forma {
    protected String Color;
    protected boolean Relleno;

    public Forma() {
    }
    public Forma(String color, boolean relleno) {
        Color = color;
        Relleno = relleno;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public boolean isRelleno() {
        return Relleno;
    }
    public void setRelleno(boolean relleno) {
        Relleno = relleno;
    }
    @Override
    public String toString() {
        return "Forma [Color=" + Color + ", Relleno=" + Relleno + "]";
    }
    public abstract double getArea();
    public abstract double getPerimetro();
}