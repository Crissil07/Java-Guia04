package Ejercicio03BIS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Carta carta = new Carta();
        carta.crearCarta();
        String op;

        do {
            System.out.println("------------------------------");
            System.out.println("Menu:");
            System.out.println("A - Barajar cartas");
            System.out.println("B - Siguiente carta");
            System.out.println("C - Cartas disponibles");
            System.out.println("D - Dar cartas");
            System.out.println("E - Cartas que ya salieron");
            System.out.println("F - Mostrar todas las cartas");
            System.out.println("G - Salir");
            System.out.println("------------------------------");

            op = scan.next();

            switch (op) {
                case "a":
                    carta.barajar();
                    break;
                case "b":
                    carta.siguienteCarta();
                    break;
                case "c":
                    carta.cartasDisponibles();
                    break;
                case "d":
                    carta.darCartas();
                    break;
                case "e":
                    carta.cartasMonton();
                    break;
                case "f":
                    carta.mostrarBaraja();
                    break;
            }

        } while (op.equalsIgnoreCase("g"));
    }
}
