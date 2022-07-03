package Ejercicio01;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver rev;

    public Juego() {

    }

    public Juego(ArrayList<Jugador> jugadores, Revolver rev) {
        this.jugadores = jugadores;
        this.rev = rev;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRev() {
        return rev;
    }

    public void setRev(Revolver rev) {
        this.rev = rev;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver rev) {

        this.jugadores = jugadores;
        this.rev = rev;

    }

    public void Ronda() {

        for (Jugador players : jugadores) {

            System.out.println(rev);

            if (players.disparo(rev)) {
                System.out.println("Jugador: " + players + " ha muerto");
                break;
            } else {
                System.out.println("Jugador: " + players + " se ha salvado");
            }

        }

    }

}
