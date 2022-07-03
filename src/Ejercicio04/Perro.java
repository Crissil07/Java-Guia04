package Ejercicio04;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimentacion, Integer edad, String Raza) {
        super(nombre, alimentacion, edad, Raza);
    }

    @Override
    public void alimentarse(String animal) {
        super.alimentarse(animal); //To change body of generated methods, choose Tools | Templates.
    }
}
