package Ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Carta carta;
        ArrayList <Carta> listaCartas = new ArrayList();
        int valor;
        String palo;
        
        System.out.println("-------------------------------------------------");
        System.out.println("Ingresar el valor de la carta (exceptuando 8 y 9)");
        System.out.println("-------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            valor = scan.nextInt();
            for (int j = 1; j <= 4; j++) {
                carta = new Carta();
                carta.setValorCarta(valor);

                switch (j) {
                    case 1:
                        palo = "Oro";
                        carta.setPaloCarta(palo);
                        break;
                    case 2:
                        palo = "Espada";
                        carta.setPaloCarta(palo);
                        break;
                    case 3:
                        palo = "Basto";
                        carta.setPaloCarta(palo);
                        break;
                    case 4:
                        palo = "Copa";
                        carta.setPaloCarta(palo);
                        break;
                }
                listaCartas.add(carta);
            }
        }

        for (Object listaCarta : listaCartas) {
            System.out.println(listaCarta);
        }
        
        Baraja baraja = new Baraja();
        baraja.Barajar();
        
        System.out.println("------------------------------");
        System.out.println("¿Que operacion desea realizar?");
        System.out.println("A - Barajar cartas");
        System.out.println("B - Siguiente carta");
        System.out.println("C - Cartas disponibles");
        System.out.println("D - Dar cartas");
        System.out.println("E - Cartas que ya salieron");
        System.out.println("F - Mostrar todas las cartas");
        System.out.println("G - Salir");
        System.out.println("------------------------------");
        
        String op = scan.next();
        do{
            switch (op){
                case "A":
                    
            }
            
        }while(op.equalsIgnoreCase("g"));
    }
}
