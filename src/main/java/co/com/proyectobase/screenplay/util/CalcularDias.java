package co.com.proyectobase.screenplay.util;


import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;


public class CalcularDias {

    public static long calcularDias( String checkIn, String checkOut) {


        LocalDate inicio = LocalDate.of(Integer.parseInt(checkIn.substring(6)), Integer.parseInt(checkIn.substring(0, 2)), Integer.parseInt(checkIn.substring(3, 5)));
        LocalDate fin = LocalDate.of(Integer.parseInt(checkOut.substring(6)), Integer.parseInt(checkOut.substring(0, 2)), Integer.parseInt(checkOut.substring(3, 5)));

        return 1+DAYS.between(inicio, fin);


    }
}