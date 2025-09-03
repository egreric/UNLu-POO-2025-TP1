package ar.edu.unlu.poo.tp1.ej5;

import java.time.LocalDate;

public class MainEj5 {
    public static void main(String[] args){
        LocalDate fechaAyer = LocalDate.now().minusDays(1);  // seteo una variable fecha con la fecha actual de hoy
        LocalDate fecha = LocalDate.of(2023,9,2);

        System.out.println("\nCOMIENZA EL EJERCICIO\n");
        Tarea tarea1 = new Tarea("Ir al supermercado mañana", Prioridad.MEDIA, fecha);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", Prioridad.ALTA);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel",Prioridad.BAJA, fechaAyer);
        Tarea tarea4 = new Tarea("Ir al Gym",Prioridad.BAJA, LocalDate.now());
        Tarea tarea5 = new Tarea("Ir al cine a ver la nueva película de Marvel",Prioridad.BAJA, fechaAyer);
        Tarea tarea6 = new Tarea("Consultar repuesto del auto", Prioridad.ALTA);

        tarea4.completar();
        tarea5.completar();
        tarea6.completar();

        System.out.println(tarea1.mostrarTarea());
        System.out.println(tarea2.mostrarTarea());
        System.out.println(tarea3.mostrarTarea());
        System.out.println(tarea4.mostrarTarea());
        System.out.println(tarea5.mostrarTarea());
        System.out.println(tarea6.mostrarTarea());
    }
}
