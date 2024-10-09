package p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        
        Camioneta camioneta = new Camioneta("C123", "Toyota", 2020, 30000, 1500, 2);
        camioneta.setSerie("C123");
        camioneta.setMarca("Toyota");
        camioneta.setAño(2020);
        camioneta.setPrecio(30000);

  
        Compacto compacto = new Compacto("C456", "Honda", 2021, 20000, 5, 4);
        compacto.setSerie("C456");
        compacto.setMarca("Honda");
        compacto.setAño(2021);
        compacto.setPrecio(20000);

    
        System.out.println(camioneta);
        System.out.println(compacto);
    }
}
