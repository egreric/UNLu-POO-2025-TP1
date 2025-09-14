package ar.edu.unlu.poo.tp1.ej8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainEj8 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Password> listaPw = new ArrayList<Password>();
        int cantPwAGenerar;
        int longitud;
        boolean hayDebiles = false;

        System.out.println("Ingrese la cantidad de passwords a generar");
        cantPwAGenerar = sc.nextInt();

        for (int i = 1; i <= cantPwAGenerar; i++) {
            System.out.println("Ingresar longitud de la password " + i);
            longitud = sc.nextInt();
            listaPw.add(new Password(longitud));
        }


        for (Password p : listaPw) {
            System.out.println(p.toString());
            if (!p.esFuerte()) {
                hayDebiles = true;
            }
        }

        if (hayDebiles) {
            System.out.println("\nExisten passwords debiles, se regeneraran para convertirlas en fuertes\n");
        }

        for (Password p : listaPw) {
            if (!p.esFuerte()) {
                System.out.print("La password debil: " + p.getValor() + " de " + p.getLongitud() + " caracteres");
                p.hacerFuerte();
                System.out.println(" fue reemplazada por la password fuerte: " + p.getValor() + " de " + p.getLongitud() + " caracteres");
            }
        }
    }

}
