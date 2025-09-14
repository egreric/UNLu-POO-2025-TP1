package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Diccionario diccionario;
    private int rondasTotales;

    public Juego(){
        jugadores = new ArrayList<>();
        setRondasTotales(3);
    }

    public void agregarJugador(String nombreJugador){
        jugadores.add(new Jugador(nombreJugador));
    }

    public void setDiccionario(ArrayList<String> diccionario){
        this.diccionario = new Diccionario(diccionario);
    }

    public void setRondasTotales(int totalRondas){
        this.rondasTotales = totalRondas;
    }

    public void jugar(){
        Scanner sc = new Scanner(System.in);
        String palabraIngresada = "";
        for (int rondaActual = 1; rondaActual <= rondasTotales; rondaActual++){
            System.out.println("Ronda " + rondaActual + " de " + rondasTotales + "\n");
            for (Jugador j : jugadores) {
                System.out.println("Es el turno de: " + j.getNombre() + "!");
                System.out.print("Ingresa una palabra: ");
                palabraIngresada = sc.nextLine();
                if (diccionario.contiene(palabraIngresada)) {
                    if (j.buscarPalabra(palabraIngresada)) {
                        System.out.println("La palabra es valida pero ya la habias ingresado!, no sumas puntos.");
                    } else {
                        System.out.println("La palabra es valida!, sumas: " + calcularPuntos(palabraIngresada) + " puntos!.");
                        j.sumarPuntaje(calcularPuntos(palabraIngresada));
                        j.agregarPalabra(palabraIngresada);
                    }
                } else {
                    System.out.println("La palabra es invalida!, no sumas puntos.");
                }
                System.out.println("Tenes un total de: " + j.getPuntaje() + " puntos.");
                System.out.println("-----------------------------------------------------\n");
            }
            System.out.println("-----------------------------------------------------");
            System.out.println("-----------------------------------------------------");
            System.out.println("-----------------------------------------------------");
        }
        Jugador ganador = getGanador();
        System.out.println("El ganador es: " + ganador.getNombre() + " con un total de " + ganador.getPuntaje() + " puntos." );
        System.out.println("Sus palabras ingresadas fueron: " + ganador.getPalabras());
    }

    private int calcularPuntos(String palabraIngresada) {
        int puntaje = 0;
        for (int i = 0; i < palabraIngresada.length(); i++){
            if (esLetraBonus(palabraIngresada.charAt(i))){
                puntaje++;
            }
            puntaje++;
        }
        return puntaje;
    }

    private boolean esLetraBonus(char letraIngresada) {
        String letrasBonus = "kzxywq";
        return letrasBonus.contains(String.valueOf(letraIngresada));
    }

    /* OTRA FORMA DE HACERLO
    private boolean esLetraBonus(char letraIngresada) {
        char[] letrasBonus = {'k','z','x','y','w','q'};
        for (char letra : letrasBonus) {
            if (letraIngresada == letra) {
                return true;
            }
        }
        return false;
    }
    */

    private Jugador getGanador(){
        Jugador ganador = null;
        int maximoPuntaje = -1;
        for (Jugador j:jugadores){
            if (j.getPuntaje() > maximoPuntaje){
                ganador = j;
                maximoPuntaje = j.getPuntaje();
            }
        }
        return ganador;
    }
}
