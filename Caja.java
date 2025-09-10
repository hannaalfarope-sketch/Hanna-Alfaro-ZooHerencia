package org.example;

public class Caja<T> {
    private T objeto;

    public Caja(T objeto) {
        this.objeto = objeto;
    }

    public Caja() {

    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}