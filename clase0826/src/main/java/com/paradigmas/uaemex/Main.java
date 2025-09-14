package com.paradigmas.uaemex;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Racional r1, r2, r3;

        try {
            r1 = new Racional(1, 2);
            r2 = new Racional(1, 2);
            r3 = r1.suma(1);
            System.out.println(r3);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}