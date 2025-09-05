package ar.edu.unlu.poo.tp1.ej7;

import java.util.ArrayList;

public class EcuacionSegundoGrado {
    private final double COEFICIENTE_A;
    private final double COEFICIENTE_B;
    private final double COEFICIENTE_C;

    public EcuacionSegundoGrado(double COEFICIENTE_A, double COEFICIENTE_B, double COEFICIENTE_C) {
        this.COEFICIENTE_A = COEFICIENTE_A;
        this.COEFICIENTE_B = COEFICIENTE_B;
        this.COEFICIENTE_C = COEFICIENTE_C;
    }

    public ArrayList<Double> valorRaices(){
        ArrayList<Double> listadoValores = new ArrayList<Double>();
        if (valorDiscriminante() > 0){
            listadoValores.add( (-this.COEFICIENTE_B + (Math.sqrt(valorDiscriminante())) ) / (2 * this.COEFICIENTE_A) );
            listadoValores.add( (-this.COEFICIENTE_B - (Math.sqrt(valorDiscriminante())) ) / (2 * this.COEFICIENTE_A) );
        } else {
            if (valorDiscriminante() == 0){
                listadoValores.add( (-this.COEFICIENTE_B + (Math.sqrt(valorDiscriminante())) ) / (2 * this.COEFICIENTE_A) );
            }
        }
        return listadoValores;
    }

    private double valorDiscriminante(){
        return (Math.pow(COEFICIENTE_B,2)) - (4 * COEFICIENTE_A * COEFICIENTE_C);
    }

    public double valorFuncionEnBaseAX(double x){
        return (COEFICIENTE_A * (Math.pow(x,2))) + (COEFICIENTE_B * x) + COEFICIENTE_C;
    }

    public String mostrarEcuacion(){
        return "Y = " + COEFICIENTE_A + "x^2 + " + COEFICIENTE_B + "x + " + COEFICIENTE_C;
    }

}
