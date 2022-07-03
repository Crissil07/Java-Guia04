package Ejercicio01;

import java.util.Scanner;

public class Jugador {

    private int id;
    private String nombre;
    private boolean vivo;

    Scanner scan = new Scanner(System.in);

    public Jugador() {

    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void llenarJugador() {

        System.out.println("ID (Numero) de jugador en orden ascendente");
        id = scan.nextInt();
        System.out.println("Nombre del jugador");
        nombre = scan.next();
        vivo = true;
    }

    public boolean disparo(Revolver rev) {
        boolean seDisparo = false;

        System.out.println("Jugador: " + id + ", nombre: " + nombre + " ha gatillado");
        if (rev.disparar()) {
            vivo = false; //Muere el jugador
            seDisparo = true;
            System.out.println("Jugador: " + id + ", nombre: " + nombre + " murio del disparo");
        } else {
            System.out.println("Jugador: " + id + ", nombre: " + nombre + " se ha salvado");
            rev.siguienteBala();
        }
        return seDisparo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", vivo=" + vivo + '}';
    }
}
