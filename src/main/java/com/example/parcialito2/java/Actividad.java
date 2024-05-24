package com.example.parcialito2.java;

import java.util.ArrayList;

public class Actividad {
    private String nombre;
    private int maxInscriptos;
    private ArrayList inscritos=new ArrayList<>();
    private Socio responsable=null;
    public Actividad(String nombre, int maxInscriptos) {
        this.nombre = nombre;
        this.maxInscriptos = maxInscriptos;
    }
    public void inscribir(Socio socio){
        this.inscritos.add(socio);
    }
    public void setResponsable(Socio socio){
        this.responsable=socio;
    }
    public ArrayList<Socio> getInscriptos(){
        return inscritos;
    }

}
