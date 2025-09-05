package ar.edu.unlu.poo.tp1.ej7;

public class MainEj7 {
    public static void main(String[] args){
        // Creo ecuacion la cual se que tiene dos raices reales
        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(2, 5, 2);

        //EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(1,-4,4); // ecuacion con una raiz real
        //EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(1,1,1); // ecuacion sin raices reales

        System.out.println("La ecuacion de segundo grado es: " + ecuacion.mostrarEcuacion() + "\n");

        int valorX = 2;
        System.out.println("f(" + valorX + ") = " + ecuacion.valorFuncionEnBaseAX(valorX) + "\n");

        System.out.print("Las raices de la ecuacion son: ");
        if (ecuacion.valorRaices().isEmpty()) {
            System.out.println("No hay soluciones reales");
        } else {
            System.out.println(ecuacion.valorRaices());
        }
    }
}

