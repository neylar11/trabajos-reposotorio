/**
 * p81_InicializaArregloNumeros (2)
 */
public class p82_InicializaArregloNumeros2 {
    public class p81_inializaArregloNumeros {
        public static void main(String[] args) {
            String[] nums = new String[10];
    
            nums[0] = "Apozol";
            nums[1] = "Apulco";
            nums[2] = "Cañitas";
            nums[3] = "Jerez";
            nums[4] = "Fresnillo";
            nums[5] = "Rio grande";
            nums[6] = "Sain Alto";
            nums[7] = "Sombrerete";
            nums[8] = "Teul de Gonzalez Ortega";
            nums[9] = "Zacatecas";
    
            System.out.print("\033[H\033[2J");
            System.out.println("primer elemento" + nums[0]);
            System.out.println("ultimo  elemento" + nums[10]);
    
            System.out.println("\nTodos los elementos del arreglo con un foro en base al indice");
            for(int i=0; i<nums.length; i++)
                System.err.print(nums[i] + "");
    
            System.out.println("\nTodos los elementos del arreglo con un foro sin  indice");
            for(String i : nums)
                System.err.print(i + "");
    
            System.out.println("\n\nTodo ha terminado...");
    
    
        }
    
        
    }
    
}