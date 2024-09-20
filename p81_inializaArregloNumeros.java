
/**
 * p81_inializaArregloNumeros inizializar un arreglo numero con valor flotante
 */

public class p81_inializaArregloNumeros {
    public static void main(String[] args) {
        double[] nums = new double[7];

        nums[0] = 5.0;
        nums[1] = 10.0;
        nums[2] = 15.5;
        nums[3] = 20.5;
        nums[4] = 25.0;
        nums[5] = 100.22;
        nums[6] = 90.0;
        //nums[7] no existe posicion 7

        System.out.print("\033[H\033[2J");
        System.out.println("primer elemento" + nums[0]);
        System.out.println("ultimo  elemento" + nums[6]);

        System.out.println("\nTodos los elementos del arreglo con un foro en base al indice");
        for(int i=0; i<nums.length; i++)
            System.err.print(nums[i] + "");

        System.out.println("\nTodos los elementos del arreglo con un foro sin  indice");
        for(double i : nums)
            System.err.print(i + "");

        System.out.println("\n\nTodo ha terminado...");


    }

    
}