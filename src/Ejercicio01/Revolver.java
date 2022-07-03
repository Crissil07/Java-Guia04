package Ejercicio01;

import java.util.Random;

public class Revolver {

    private int posicionActual; //posicion tambor con respecto al martillo
    private int posicionBala; // posicion bala en tambor
    //para comprobar si la bala corresponde a la posicion del martillo

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionBala) {
        this.posicionActual = posicionActual;
        this.posicionBala = posicionBala;

    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }

    public void llenarRevolver() {

        Random aleatorio = new Random();

        posicionActual = aleatorio.nextInt((6 - 1) + 1) + 1;
        posicionBala = aleatorio.nextInt((6 - 1) + 1) + 1;
    }

    public Boolean disparar() {
        boolean balaMartillo;
        balaMartillo = false;

        if (posicionActual == posicionBala) {
            balaMartillo = true;
        }
        return balaMartillo;
    }

    public void siguienteBala() {

        if (posicionActual == 6) {
            posicionActual = 1;
        } else {
            posicionActual = posicionActual + 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "Posicion del tambor con respecto al martillo=" + posicionActual + ", Posicion de la bala en el tambor con respecto al martillo=" + posicionBala + '}';
    }

}
