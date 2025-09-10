package org.example;

public class Perro extends Animal {
    private Collar collar;

    public Perro(String nombre, Collar collar) {
        super(nombre);
        this.collar = collar;
    }

    @Override
    public void sonido() {
        System.out.println(nombre + " ladra: ¡Guau Guau!");
    }

    public void moverCola() {
        System.out.println(nombre + " mueve la cola felizmente 🐕");
    }

    public Collar getCollar() {
        return collar;
    }
}
