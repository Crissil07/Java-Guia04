package Ejercicio02;

public class Espectador {

    private String nombre;
    private int edad;
    private double dinero;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Espectador llenarEspectador() {
        Espectador espectador = new Espectador();
//        int años = (int) (Math.random() * 79) + 1;
//        double dinero = (Math.random() * 500) + 1;

        this.dinero = (Math.random() * 500) + 1; //va de 1 a 500
        this.edad = (int) (Math.random() * 79) + 1; // va de 1 a 79
        this.nombre = ("A");
        return espectador;

    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }

}
