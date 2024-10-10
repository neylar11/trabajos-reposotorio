package p110_CuentaBancariaV1;



public class Cliente {
    private String nombre;
    private CuentaBancaria cuenta;

    public cliente(String nombre, CuentaBancaria cuenta){
        this.nombre = nombre;
        This,cuenta = cuenta;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", cuenta=").append(cuenta);
        sb.append('}');
        return sb.toString();
    }
    
}
