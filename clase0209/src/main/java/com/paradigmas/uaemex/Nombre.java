package com.paradigmas.uaemex;

public class Nombre {
    private String nombreDePila, primerApellido;

    public Nombre() {
        this.nombreDePila = null;
        this.primerApellido = null;
    }

    public String getNombreDePila() {
        return nombreDePila;
    }

    public void setNombreDePila(String nombreDePila) {
        this.nombreDePila = nombreDePila;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

}
