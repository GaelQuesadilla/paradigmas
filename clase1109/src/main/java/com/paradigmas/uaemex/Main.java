package com.paradigmas.uaemex;

public class Main {
    public static void main(String[] args) {
        Persona persona;
        Nombre nombre, segundoNombre;

        nombre = new Nombre("Gael", "Gonzalez");

        persona = new Alumno(nombre);

        segundoNombre = persona.getNombre();
        System.out.println(segundoNombre.toString());
    }
}