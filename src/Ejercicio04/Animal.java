package Ejercicio04;

public abstract class Animal {

    protected String nombre;
    protected String alimentacion;
    protected Integer edad;
    protected String Raza;

    public Animal() {
    }

    public Animal(String nombre, String alimentacion, Integer edad, String Raza) {
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.edad = edad;
        this.Raza = Raza;
    }

    public void alimentarse(String animal) {
        System.out.println("La "+animal+" "+ nombre + " de raza " + Raza + " es de alimentacion " + alimentacion);
    }
}
