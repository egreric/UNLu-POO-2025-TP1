package ar.edu.unlu.poo.tp1.ej10;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainEj10 {
    public static void main(String[] args) {
        ArrayList<Tarea> listadoTareas = new ArrayList<>();

        listadoTareas.add(new Tarea("Ir al supermercado mañana", Prioridad.MEDIA, LocalDate.of(2023,9,2)));

        listadoTareas.add(new Tarea("Consultar repuesto del auto", Prioridad.BAJA, LocalDate.of(2024,12,20)));
        listadoTareas.get(1).completar();

        listadoTareas.add(new Tarea("Ir al cine a ver la nueva pelicula de Marvel", Prioridad.MEDIA, LocalDate.now().minusDays(1)));

        listadoTareas.add(new Tarea("Pasear con el perro", Prioridad.MEDIA, LocalDate.now().plusDays(10), LocalDate.now().minusDays(1) ));

        listadoTareas.add(new Tarea("Leer un libro", Prioridad.MEDIA, LocalDate.now().plusDays(10), LocalDate.now().plusDays(1)));


        for(Tarea t:listadoTareas){
            System.out.println(t.mostrarTarea());
        }

    }
}
