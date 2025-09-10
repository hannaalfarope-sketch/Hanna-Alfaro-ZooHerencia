package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear un consultorio
        Consultorio cons = new Consultorio("Consultorio 1");

        // Pasar el consultorio al constructor de Veterinaria
        Veterinaria vet = new Veterinaria(cons);

        Perro perro = new Perro("Firu", new Collar("rojo"));
        Gato gato = new Gato("Misu");

        vet.atender(perro); // polimorfismo
        vet.atender(gato);  // polimorfismo

        Animal a = new Perro("Rocky", new Collar("azul")); // upcasting
        if (a instanceof Perro) {
            Perro p = (Perro) a; // downcasting
            // acción específica de Perro (aquí puedes poner algo de Perro si quieres)
        }

        Caja<Animal> caja = new Caja<>();
        caja.setObjeto(gato); // corregido
        Animal guardado = caja.getObjeto(); // corregido
        vet.atender(guardado);
    }
}
