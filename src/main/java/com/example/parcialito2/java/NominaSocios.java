package com.example.parcialito2.java;

public class NominaSocios {
    private Socio socio;
    public NominaSocios(){
        this.socio=null;
    }
    public void agregar(Socio nuevo){
        this.socio=nuevo;
    }
    public void eliminar(Socio nuevo){
        this.socio=null;
    }
    public Socio get(String dni){
        if(this.socio!=null){
            if(this.socio.getDni().equals(dni)){
                return this.socio;
            }
        }
        return null;
    }
}
