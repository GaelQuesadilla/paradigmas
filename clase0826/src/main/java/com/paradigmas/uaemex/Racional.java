package com.paradigmas.uaemex;

public class Racional {
    private int numerador, denominador;

    /**
     * Crea un racional 0/1
     */
    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    /**
     * Copia un racional
     * 
     * @param r Racional a copiar
     */
    public Racional(Racional r) {
        this.numerador = r.numerador;
        this.denominador = r.denominador;
    }

    /**
     * Crea un racional n/d
     * 
     * @param n Numerador
     * @param d Denominador
     * @throws Exception Cuando el denominador sea 0
     */
    public Racional(int n, int d) throws Exception {
        this.numerador = n;
        this.setDenominador(d);

    }

    /**
     * Crea un racional n/1
     * 
     * @param n Numerador
     */
    public Racional(int n) {
        this.numerador = n;
        this.denominador = 1;
    }

    /**
     * Suma un racional
     * 
     * @param r Sumando
     * @return Resultado
     */
    public Racional suma(Racional r) throws Exception {
        Racional result = new Racional(
                this.numerador + r.numerador,
                this.denominador * r.denominador);
        return result;
    }

    /**
     * Suma un entero
     * 
     * @param r Sumando
     * @return Resultado
     */
    public Racional suma(int n) throws Exception {
        Racional result = new Racional(
                this.numerador + n * this.denominador,
                this.denominador);
        return result;
    }

    /**
     * Resta un racional a este racional
     * 
     * @param r Sustraendo
     * @return Resultado
     */
    public Racional resta(Racional r) throws Exception {
        Racional result = new Racional(
                this.numerador - r.numerador,
                this.denominador * r.denominador);
        return result;
    }

    /**
     * 
     * @param r Producto
     * @return
     */
    public Racional multiplica(Racional r) throws Exception {
        Racional result = new Racional(
                this.numerador * r.numerador,
                this.denominador * r.denominador);
        return result;
    }

    /**
     * Divide el objeto entre el parámetro
     * 
     * @param r Divisor
     * @return Resultado
     */
    public Racional divide(Racional r) throws Exception {

        if (r.numerador == 0) {
            throw new ArithmeticException("Imposible dividir entre 0");
        }

        Racional result = new Racional(
                this.numerador * r.denominador,
                this.denominador * r.numerador);
        return result;
    }

    /**
     * Potencia un racional
     * 
     * @param p Potencia
     * @return Resultado
     * @throws Exception Cuando el denominador sea cero
     */
    public Racional potencia(int p) throws Exception {
        Racional result = new Racional(
                (int) Math.pow(this.numerador, p),
                (int) Math.pow(this.denominador, p));
        return result;
    }

    /**
     * 
     * @return Numerador
     */
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int n) {
        this.numerador = n;

    }

    public int getDenominador() {
        return denominador;
    }

    /**
     * Establece el valor del denominador
     * 
     * @param d Denominador
     * @throws Exception Cuando el denominador sea 0
     */
    public void setDenominador(int d) throws Exception {
        if (d == 0) {
            throw new Exception("El valor del denominador no puede ser 0");
        }
        this.denominador = d;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

}
