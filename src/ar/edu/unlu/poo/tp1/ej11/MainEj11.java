package ar.edu.unlu.poo.tp1.ej11;

import java.util.ArrayList;

public class MainEj11 {
    public static void main(String[] args){
        ArrayList<String> palabrasDiccionario = new ArrayList<>();
        palabrasDiccionario.add("Pez");             // 4  puntos
        palabrasDiccionario.add("Kiwi");            // 6  puntos
        palabrasDiccionario.add("Cualquiera");      // 10 puntos
        palabrasDiccionario.add("Zorro");           // 6  puntos
        palabrasDiccionario.add("Yelmo");           // 6  puntos
        palabrasDiccionario.add("Yerba");           // 6  puntos
        palabrasDiccionario.add("Azucar");          // 7  puntos
        palabrasDiccionario.add("Extraterrestre");  // 15 puntos
        palabrasDiccionario.add("Wakanda");         // 9  puntos
        palabrasDiccionario.add("Reloj");           // 5  puntos
        palabrasDiccionario.add("Cinta");           // 5  puntos

        Juego juego = new Juego();
        juego.agregarJugador("Eric");
        juego.agregarJugador("Flor");
        juego.setDiccionario(palabrasDiccionario);
        juego.jugar();
    }
}
