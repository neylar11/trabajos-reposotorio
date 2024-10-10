package p110_CuentaBancariaV1;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class App {
    public static void main(String[] args) {
        System.out.print("\033¨[H\033[2J");
        CuentaBancaria c1 = new CuentaBancaria(5000);
        System.out.println("saldo inicial:" + c1.getSaldo() );
        c1.deposita(10000);
        System.out.println("Saldo despues del 1er deposito" + c1.getSaldo());
        double cr = 4000;
        boolean rsn = c1.retirar(cr);
        if(rsn) System.out.println("retirarse" + cr + "te quedan" + c1.getSaldo());
        else System.Out.println("No tienes ni para los cigarros, ponte a trabajar");

        System.err.println("\nProbando clase cliente");
        cliente cliente1

    }
}
