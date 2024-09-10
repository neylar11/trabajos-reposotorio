import java.util.Scanner;

public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s"; 

        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        int totalRechazados = 0;
        int sumaEdades = 0;
        double totalDineroAlumnos = 0;
        double totalDineroDocentes = 0;
        double totalDineroTrabajadores = 0;
        double totalDineroGeneral = 0;
        System.out.print("\033[H\033[2J"); System.out.flush();
        do {
            System.out.print("Dame tu nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("¿Cuál es tu sexo? ('m' o 'h'): ");
            String sexo = scanner.nextLine().toLowerCase();
            if (!sexo.equals("m") && !sexo.equals("h")) {
                System.out.println("Sexo no válido.");
                totalRechazados++;
                continue;
            }

            System.out.print("¿Qué tipo de participante eres? ('Alumno', 'Docente' o 'Trabajador'): ");
            String tipo = scanner.nextLine().trim();

            System.out.print("Dame tu edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            if (edad >= 23) {
                double costo = 0;
                switch (tipo.toLowerCase()) {
                    case "alumno":
                        costo = 40;
                        totalAlumnos++;
                        totalDineroAlumnos += costo;
                        break;
                    case "docente":
                        costo = 60;
                        totalDocentes++;
                        totalDineroDocentes += costo;
                        break;
                    case "trabajador":
                        costo = 80;
                        totalTrabajadores++;
                        totalDineroTrabajadores += costo;
                        break;
                    default:
                        System.out.println("Tipo de participante no válido.");
                        totalRechazados++;
                        continue; 
                }

                if (sexo.equals("h")) {
                    totalHombres++;
                } else if (sexo.equals("m")) {
                    totalMujeres++;
                }

                totalParticipantes++;
                sumaEdades += edad;
                totalDineroGeneral += costo;

                System.out.println("\n----- Datos -----");
                System.out.println("Nombre: " + nombre);
                System.out.println("Sexo: " + sexo);
                System.out.println("Tipo de participante: " + tipo);
                System.out.println("Edad: " + edad);
                System.out.println("Costo: $" + costo);

                if (tipo.equalsIgnoreCase("Alumno")) {
                    System.out.println("Bienvenido a la escuela, " + nombre );
                }
            } else {
                System.out.println("Lo siento, eres menor de 23.");
                totalRechazados++;
            }

            System.out.print("\n¿Deseas ingresar otro participante? (s/n): ");
            continuar = scanner.nextLine().trim().toLowerCase();
            
        } while (continuar.equals("s"));

        double promedioEdad = (totalParticipantes > 0) ? (double) sumaEdades / totalParticipantes : 0;

        System.out.println("\n----- Estadísticas Finales -----");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres: " + totalHombres);
        System.out.println("Total de Mujeres: " + totalMujeres);
        System.out.println("Total de Participantes: " + totalParticipantes);
        System.out.println("Promedio de Edad de los Participantes: " + promedioEdad);
        System.out.println("Total de Rechazados: " + totalRechazados);
        System.out.println("Total Dinero Recaudado de Alumnos: $" + totalDineroAlumnos);
        System.out.println("Total Dinero Recaudado de Docentes: $" + totalDineroDocentes);
        System.out.println("Total Dinero Recaudado de Trabajadores: $" + totalDineroTrabajadores);
        System.out.println("Total Dinero Recaudado en General: $" + totalDineroGeneral);

        System.out.println("\nMensaje Final:");
        if (totalDineroGeneral < 50) {
            System.out.println("El evento concluye con ganancias BAJAS.");
        } else if (totalDineroGeneral >= 50 && totalDineroGeneral < 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS.");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias.");
        }

        scanner.close();
    }
}
