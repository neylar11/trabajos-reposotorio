
public class App {
    public static void main(String[] args) {
        Sedan miSedan = new Sedan("Vochito", "Maria Diaz", 4);
        System.out.println(miSedan);
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.chasisTres();
        miSedan.chasisMonocasco();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();

        Suv miSUV = new Suv("La mamalona", "Carlos Castaneda", 6);
        System.out.println(miSUV);
        miSUV.sistemaElectrico();
        miSUV.combustionInterna();
        miSUV.traccion4x4();
        miSUV.chasisIndependiente();
        miSUV.repostar();
        miSUV.arrancar();
        miSUV.frenar();
    }
}
