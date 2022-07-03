package Ejercicio04;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimentacion, Integer edad, String Raza) {
        super(nombre, alimentacion, edad, Raza);
    }

    @Override
    public void alimentarse(String animal) {
        super.alimentarse(animal); //To change body of generated methods, choose Tools | Templates.
    }
}
