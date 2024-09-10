import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P61SistemaPapeleria {

    public static void main(String[] args) {
        //entrada donde se inicializan las ventas y totales, precios y los tipos al igual que el letrero
        Scanner scanner = new Scanner(System.in);
        int ventaNumero = 1;
        int totalVentas = 0;
        int totalCopias = 0;
        

        Map<String, Integer> ventasPorTipo = new HashMap<>();
        Map<String, Integer> preciosPorTipo = new HashMap<>();
        preciosPorTipo.put("C", 3);
        preciosPorTipo.put("O", 4);
        preciosPorTipo.put("D", 6);

        ventasPorTipo.put("Carta", 0);
        ventasPorTipo.put("Oficio", 0);
        ventasPorTipo.put("Doble", 0);

        String linea = "----------------------------------------";
        System.out.println(linea);
        System.out.println("Papelería La Malena, S.A. de C.V.");
        System.out.println("Sistema de ventas de copias");
        System.out.println(linea);
        System.out.println();
        
        //proceso donde sale el numero de venta, selecciona tipo, cantidad y verifica que los datos sean validos
        while (true) {
            System.out.println("Venta: " + ventaNumero);
            System.out.println("(C)arta $3, (O)ficio $4, (D)oble $6? ");
            String tipoCopia = scanner.nextLine().trim().toUpperCase();
            if (!preciosPorTipo.containsKey(tipoCopia)) {
                System.out.println("Opción no válida.");
                continue;
            }

            int precio = preciosPorTipo.get(tipoCopia);
            String nombreTipo = tipoCopia.equals("C") ? "Carta" : tipoCopia.equals("O") ? "Oficio" : "Doble";

            System.out.print("Cantidad ? ");
            int cantidad = 0;
            boolean cantidadValida = false;

            while (!cantidadValida) {
                try {
                    cantidad = Integer.parseInt(scanner.nextLine());
                    if (cantidad > 0) {
                        cantidadValida = true;
                    } else {
                        System.out.println("La cantidad debe ser un número positivo. Inténtalo de nuevo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Introduce un número entero positivo.");
                }
            }

            int subtotal = precio * cantidad;
            totalVentas += subtotal;
            totalCopias += cantidad;
            ventasPorTipo.put(nombreTipo, ventasPorTipo.get(nombreTipo) + cantidad);


            System.out.print("Otra venta (S/N) ? ");
            String continueOption = scanner.nextLine().trim().toUpperCase();

            if (continueOption.equals("N")) {
                break;
            }

            ventaNumero++;
        }
        //salida donde muestra el resumen dando cuanto se compro de cada cosa y el total de cada unas y final. total de ventas y que tipo de venta fue 
        System.out.println(linea);
        System.out.println("Resumen diario de ventas");
        System.out.println(linea);

        System.out.println("-------------------------");
        int totalGeneral = 0;
        for (Map.Entry<String, Integer> entry : ventasPorTipo.entrySet()) {
            String tipo = entry.getKey();
            int cantidad = entry.getValue();
            int precio = preciosPorTipo.get(tipo.equals("Doble") ? "D" : tipo.equals("Oficio") ? "O" : "C");
            int subtotal = cantidad * precio;
            System.out.printf("%s : %d - $ %d%n", tipo, cantidad, subtotal);
            totalGeneral += subtotal;
        }
        System.out.println("-------------------------");
        System.out.printf("Tot. Ventas : %d - $ %d%n", totalCopias, totalVentas);

        String mensajeFrecuencia = totalVentas > 50 ? "Esta venta es una : Venta frecuente" : "Esta venta es una : Venta ocasional";
        System.out.println(mensajeFrecuencia);
        scanner.close();
    }
}
