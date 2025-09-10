package org.example;

public class Veterinaria {
    private Consultorio consultorio;

    public Veterinaria(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public void atender(Animal a) {
        a.sonido();
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }
}