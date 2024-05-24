package com.example.parcialito2.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Socio {
    private String dni;
    private String nombre;
    private String fNac;
    public Socio(String dn,String nom,String f){
        this.dni=dn;
        this.nombre=nom;
        this.fNac=f;
    }

    public String getDni() {
        return dni;
    }
    public void setfNac(String fNac) {
        this.fNac = fNac;
    }
    public int getEdad() throws ParseException {
        // Crea un objeto SimpleDateFormat para parsear la fecha de nacimiento.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Parsea la fecha de nacimiento.
        Date fechaNac = (Date) sdf.parse(fNac);
        // Obtiene la fecha actual.
        Date fechaActual = new Date();

        // Crea un objeto Calendar para calcular la diferencia entre las fechas.
        Calendar calNac = Calendar.getInstance();
        Calendar calActual = Calendar.getInstance();
        calNac.setTime(fechaNac);
        calActual.setTime(fechaActual);

        // Calcula la diferencia de años.
        int edad = calActual.get(Calendar.YEAR) - calNac.get(Calendar.YEAR);

        // Verifica si el cumpleaños ya pasó este año.
        if (calNac.get(Calendar.MONTH) > calActual.get(Calendar.MONTH)
                || (calNac.get(Calendar.MONTH) == calActual.get(Calendar.MONTH)
                && calNac.get(Calendar.DAY_OF_MONTH) > calActual.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }

        return edad;
    }

    public int getanioNac() {
        String[] partes = fNac.split("-");
        return Integer.parseInt(partes[0]);
    }
}
