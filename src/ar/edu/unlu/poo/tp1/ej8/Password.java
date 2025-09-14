package ar.edu.unlu.poo.tp1.ej8;

import java.util.Random;

public class Password {
    private String valor;
    private int longitud; // Todas mis contraseñas tendran como minimo 8 caracteres de largo
    private String listadoCaracteresValidos = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Password() throws Exception {
        this(8);
    }

    public Password(int longitud) throws Exception {
        if (longitud > 0) {
            this.longitud = longitud;
            this.valor = generar(longitud);
        } else {
            throw new Exception("Longitud ingresada invalida...");
        }
    }

    private String generar(int longitud) {
        Random random = new Random();
        String valor = "";
        for (int i = 1; i <= longitud; i++){
            valor += listadoCaracteresValidos.charAt(random.nextInt(listadoCaracteresValidos.length()));
        }
        return valor;
    }

    public boolean esFuerte(){
        int cantMayus = 0;
        int cantMinus = 0;
        int canNum = 0;

        for (int i = 0; i < longitud; i++){
            if (Character.isDigit(valor.charAt(i))){
                canNum++;
            } else if (Character.isUpperCase(valor.charAt(i))){
                cantMayus++;
            } else if (Character.isLowerCase(valor.charAt(i))){
                cantMinus++;
            }
        }
        return (cantMayus > 2 && cantMinus > 1 && canNum >= 2);
    }

    public void hacerFuerte() {
        Random random = new Random();
        String alfabetoMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alfabetoMinus = "abcdefghijklmnopqrstuvwxyz";
        String numericos = "0123456789";
        String nuevoValor = "";

        if (!esFuerte()) {
            // Agrego 3 mayusculas
            for (int i = 1; i <= 3; i++) {
                nuevoValor += alfabetoMayus.charAt(random.nextInt(alfabetoMayus.length()));
            }

            // Agrego 2 minusculas
            for (int i = 1; i <= 2; i++) {
                nuevoValor += alfabetoMinus.charAt(random.nextInt(alfabetoMinus.length()));
            }

            // Agrego 2 numeros
            for (int i = 1; i <= 2; i++) {
                nuevoValor += numericos.charAt(random.nextInt(numericos.length()));
            }

            this.valor += nuevoValor;
            this.longitud = this.valor.length();
        }

    }

    public String getValor() {
        return valor;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) throws Exception {
        if (longitud > 0){
            this.longitud = longitud;
            generar(longitud);
        } else {
            throw new Exception("Longitud ingresada invalida...");
        }
    }

    @Override
    public String toString() {
        String s = "<" + this.getValor() + "> - ";
        if (this.esFuerte()){
            s += "Fuerte";
        } else {
            s += "Debil";
        }
        return s;
    }
}
