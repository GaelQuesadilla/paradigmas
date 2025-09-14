package com.paradigmas.uaemex;

public class Alumno extends Persona {

    private String numCuenta;

    public Alumno() {
    }

    public Alumno(Nombre n) {
        setNombre(n);
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

}
