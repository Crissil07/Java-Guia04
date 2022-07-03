package Ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------------");
        System.out.println("|||||Ruleta Rusa|||||");
        System.out.println("---------------------");
        System.out.println("\n");

        Scanner scan = new Scanner(System.in);
        Jugador ruleta;
        ArrayList<Jugador> jugadores = new ArrayList();

        //Ingresamos la cantidad de participantes
        System.out.println("Ingresa la cantidad de jugadores (1-6)");
        Integer n = scan.nextInt();
        //Valido la cantidad de jugadores, si es mayor que 6, n va a ser por defecto 6
        if (n > 6) {
            n = 6;
        }
        //Se crea el jugador. El objeto ruleta recibe los atributos id y nombre a travez
        //del metodo llenarJugador. Luego se añade el objeto (con los atributos seteados)
        //al arraylist "jugadores".
        for (int i = 1; i <= n; i++) {
            ruleta = new Jugador();//creacion del objeto en cada vuelta dentro del bucle para que vayan creando diferentes jugadores
            ruleta.llenarJugador();
            //verifico nombres e id de jugadores
            System.out.println(ruleta);
            jugadores.add(ruleta);
        }

        //Se crea el objeto rev, para poder acceder a la clase Revolver
        //El mismo tendra sus atributos en la clase Revolver.
        Revolver rev = new Revolver();
        //Ahora cargamos el revolver de manera aleatoria
        rev.llenarRevolver();
//        System.out.println(rev);

        //Llamo a disparar revolver
//        System.out.println(rev.disparar());
        //Siguiente Bala
        rev.siguienteBala();
//        System.out.println(rev.disparar());
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, rev);
        juego.Ronda();

    }

}
