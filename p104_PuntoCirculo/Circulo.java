package p104_PuntoCirculo;

public class Circulo {
    public class Circulo {
        private Punto centro;
        private double radio;
    
        public Circulo() {
            this.centro = new Punto();
            this.radio = 0.0;
        }
    
        public Circulo(Punto centro, double radio) {
            this.centro = centro;
            this.radio = radio;
        }
    
        public Punto getCentro() {
            return centro;
        }
    
        public void setCentro(Punto centro) {
            this.centro = centro;
        }
    
        public double getRadio() {
            return radio;
        }
    
        public void setRadio(double radio) {
            this.radio = radio;
        }
    
        public double getArea() {
            return Math.PI * Math.pow(radio, 2);
        }
    
        public double getCircunferencia() {
            return 2 * Math.PI * radio;

        @Override
    public String toString() {
        return "Circulo{" + "centro=" + centro + ", radio=" + radio + '}';
    }
}

    public String getArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }

    public String getCircunferencia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCircunferencia'");
    }