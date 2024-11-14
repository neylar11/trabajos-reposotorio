package p147_TercerExamenParcial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Util {
    public static ArrayList <Jugador> inicializarDatos() {
        ArrayList <Jugador> datos = new ArrayList<>();
        return datos;
    }


    @SuppressWarnings("ConvertToTryWithResources")
    public static void grabarDatos(String archivo, ArrayList <Jugador> datos) throws IOException {
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }

    @SuppressWarnings({ "ConvertToTryWithResources", "unchecked" })
    public static ArrayList <Jugador> leerDatos (String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream (new FileInputStream(archivo));
        datos = (ArrayList <Jugador>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
}