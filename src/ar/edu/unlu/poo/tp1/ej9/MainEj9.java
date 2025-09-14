package ar.edu.unlu.poo.tp1.ej9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainEj9 {
    public static void main(String[] args){
        LocalDate fecha2 = FechaUtilidad.getFechaDesdeFormato("31-05-1992", FechaUtilidad.FORMATO_DIA_MES_ANIO);
        LocalDate fecha1 = FechaUtilidad.getFechaDesdeFormato("07-29-2023", FechaUtilidad.FORMATO_MES_DIA_ANIO);

        System.out.println("El " + fecha1.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + " es Mayor que el " + fecha2.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + "? : " + FechaUtilidad.esMayor(fecha1,fecha2));
        System.out.println("El " + fecha1.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + " es Menor que el " + fecha2.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + "? : " + FechaUtilidad.esMenor(fecha1,fecha2));

        LocalDate fecha3 = FechaUtilidad.getFechaDesdeFormato("25-06-1991", FechaUtilidad.FORMATO_DIA_MES_ANIO);
        System.out.println("El " + fecha3.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + " esta entre el " + fecha1.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + " y el: " + fecha2.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + "?: " + FechaUtilidad.estaEntre(fecha1, fecha2, fecha3));
        System.out.println("El " + fecha3.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + " esta entre el " + fecha2.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + " y el: " + fecha1.format(FechaUtilidad.FORMATO_DIA_MES_ANIO) + "?: " + FechaUtilidad.estaEntre(fecha2, fecha1, fecha3));
    }
}
