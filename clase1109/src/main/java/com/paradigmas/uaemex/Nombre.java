package com.paradigmas.uaemex;

public class Nombre {
    protected String nombreDePila;
    protected String primerApellido;

    public Nombre(String nombreDePila, String primerApellido) {
        this.nombreDePila = nombreDePila;
        this.primerApellido = primerApellido;
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

    @Override
    public String toString() {
        return "Nombre [nombreDePila=" + nombreDePila + ", primerApellido=" + primerApellido + "]";
    }

}
