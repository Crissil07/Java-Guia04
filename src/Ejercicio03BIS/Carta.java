package Ejercicio03BIS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Carta {

    private int valorCarta;
    private String paloCarta;
    ArrayList<Carta> cartas = new ArrayList();

    public Carta() {
    }

    public Carta(int valorCarta, String paloCarta) {
        this.valorCarta = valorCarta;
        this.paloCarta = paloCarta;

    }

    public int getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(int valorCarta) {
        this.valorCarta = valorCarta;
    }

    public String getPaloCarta() {
        return paloCarta;
    }

    public void setPaloCarta(String paloCarta) {
        this.paloCarta = paloCarta;
    }

    public void crearCarta() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Carta mazo;

        int valor;
        String palo;

        System.out.println("-------------------------------------------------");
        System.out.println("Ingresar el valor de la carta (exceptuando 8 y 9)");
        System.out.println("-------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            valor = scan.nextInt();
            for (int j = 1; j <= 4; j++) {
                mazo = new Carta();
                mazo.setValorCarta(valor);

                switch (j) {
                    case 1:
                        palo = "Oro";
                        mazo.setPaloCarta(palo);
                        break;
                    case 2:
                        palo = "Espada";
                        mazo.setPaloCarta(palo);
                        break;
                    case 3:
                        palo = "Basto";
                        mazo.setPaloCarta(palo);
                        break;
                    case 4:
                        palo = "Copa";
                        mazo.setPaloCarta(palo);
                        break;
                }
                cartas.add(mazo);
            }
        }

        for (Carta lasCartas : cartas) {
            System.out.println(lasCartas);
        }

    }

    public void barajar() {

        Collections.shuffle(cartas);
        for (Carta lasCartas : cartas) {
            System.out.println(lasCartas);
        }

    }

    public void siguienteCarta() {

    }

    public void cartasDisponibles() {

    }

    public void darCartas() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantas cartas desea recibir");
        int cantidad = leer.nextInt();

    }

    public void cartasMonton() {

    }

    public void mostrarBaraja() {

        for (Carta lasCartas : cartas) {
            System.out.println(lasCartas);
        }

    }

    @Override
    public String toString() {
        return "Carta{" + "valorCarta=" + valorCarta + ", paloCarta=" + paloCarta + '}';
    }

}
