public class p83_InicializaNombresEdad {
    
    public static void main (String[] args) {
        
            String[] nombres = {"Juan", "Pedro", "Luis", "Jose", "Mateo", "Maria"};
            int[] edades = {22, 25, 44, 38, 50, 16};
        
            // Limpiar la consola
            System.out.print("\033[H\033[2J");
            System.out.flush();
        
            // Mostrar longitudes de los arreglos
            System.out.println("Longitud de nombres: " + nombres.length);
            System.out.println("Longitud de edades: " + edades.length);
        
            // Mostrar los nombres
            System.out.println("\nLos nombres:");
            for (String nombre : nombres) {
                System.out.print(nombre + " ");
            }
        
            // Mostrar las edades
            System.out.println("\nLas edades:");
            for (int edad : edades) {
                System.out.print(edad + " ");
            }
        
            // Mostrar cada nombre con su edad
            System.out.println("\nCada nombre con su edad:");
            for (int i = 0; i < nombres.length; i++) {
                System.out.println(nombres[i] + " - " + edades[i]);
            }
        }
    }
        