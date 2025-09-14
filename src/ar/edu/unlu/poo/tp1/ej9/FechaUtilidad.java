package ar.edu.unlu.poo.tp1.ej9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaUtilidad {
    public static final DateTimeFormatter FORMATO_DIA_MES_ANIO = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static final DateTimeFormatter FORMATO_MES_DIA_ANIO = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    public static LocalDate getFechaDesdeFormato(String fecha, DateTimeFormatter formato){
        if (formato.equals(FORMATO_DIA_MES_ANIO) || formato.equals(FORMATO_MES_DIA_ANIO)){
            return LocalDate.parse(fecha,formato);
        } else {
            return null;
        }
    }

    public static boolean estaEntre(LocalDate fecha1, LocalDate fecha2, LocalDate fechaAComparar) {
        if (esMayor(fecha1,fecha2)) {
            return (esMayor(fechaAComparar, fecha2) && esMenor(fechaAComparar, fecha1));
        } else {
            return (esMayor(fechaAComparar,fecha1) && esMenor(fechaAComparar,fecha2));

        }
    }

    public static boolean esMayor(LocalDate fecha1, LocalDate fecha2){
        return fecha1.isAfter(fecha2);
    }

    public static boolean esMenor(LocalDate fecha1, LocalDate fecha2){
        return fecha1.isBefore(fecha2);
    }

}
