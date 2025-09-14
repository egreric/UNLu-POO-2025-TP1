package ar.edu.unlu.poo.tp1.ej12y13;

import ar.edu.unlu.poo.tp1.ej10.Prioridad;
import ar.edu.unlu.poo.tp1.ej9.FechaUtilidad;

import java.time.LocalDate;

public class MainEj12 {
    public static void main(String[] args){
        AdministradorTareas at = new AdministradorTareas();

        at.crearTarea("Hacer la cena", Prioridad.BAJA,
                FechaUtilidad.getFechaDesdeFormato("25-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO),
                FechaUtilidad.getFechaDesdeFormato("23-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO));

        at.crearTarea("Dormir una siesta", Prioridad.MEDIA,
                FechaUtilidad.getFechaDesdeFormato("20-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO),
                FechaUtilidad.getFechaDesdeFormato("12-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO));

        at.crearTarea("Ir al gimnasio", Prioridad.ALTA,
                FechaUtilidad.getFechaDesdeFormato("10-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO),
                FechaUtilidad.getFechaDesdeFormato("23-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO));

        at.crearTarea("Programar", Prioridad.MEDIA,
                FechaUtilidad.getFechaDesdeFormato("25-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO),
                FechaUtilidad.getFechaDesdeFormato("15-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO));

        at.crearTarea("Sacar a pasear al perro", Prioridad.MEDIA,
                FechaUtilidad.getFechaDesdeFormato("25-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO),
                FechaUtilidad.getFechaDesdeFormato("20-10-2024",FechaUtilidad.FORMATO_DIA_MES_ANIO));

        at.crearTarea("Trabajar", Prioridad.MEDIA,
                FechaUtilidad.getFechaDesdeFormato("25-11-2025",FechaUtilidad.FORMATO_DIA_MES_ANIO),
                LocalDate.now());

        at.crearTarea("Cortar el pasto", Prioridad.BAJA,
                FechaUtilidad.getFechaDesdeFormato("25-03-2025",FechaUtilidad.FORMATO_DIA_MES_ANIO),
                LocalDate.now().plusDays(1));

        at.crearTarea("Jugar al futbol", Prioridad.BAJA,
                FechaUtilidad.getFechaDesdeFormato("25-02-2025",FechaUtilidad.FORMATO_DIA_MES_ANIO),
                LocalDate.now().plusDays(1));

        System.out.println("LISTADO ORDENADO\n" + at.getListadoTareasNoVencidasOrdenado());

        at.completarTarea(3);
        at.completarTarea("Hacer LA CENA");
        at.completarTarea(2,"Pedro");
        at.completarTarea(4,"Pedro");
        at.completarTarea(5,"Juan");

        System.out.println(at.buscarTareaPorTitulo("Hacer la cena"));
        System.out.println(at.buscarTareaPorTitulo("Ir al GIMNASio"));
        System.out.println(at.buscarTareaPorTitulo("CoRtar el pasto"));

        System.out.println("LISTADO NORMAL\n" + at.getListadoNormal());
        System.out.println("LISTADO ORDENADO\n" + at.getListadoTareasNoVencidasOrdenado());
        System.out.println("LISTADO ORDENADO POR TAREAS COMPLETADAS POR PEDRO\n" + at.getListadoPorColaborador("pedro"));
        System.out.println("LISTADO ORDENADO POR TAREAS COMPLETADAS POR JUAN\n" + at.getListadoPorColaborador("Juan"));

        System.out.println("LISTADO DE COLABORADORES\n" + at.getListadoColaboradores());

    }
}
