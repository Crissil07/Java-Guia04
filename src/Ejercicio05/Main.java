package Ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomestico> aparato = new ArrayList();

        Lavadora L1 = new Lavadora(10, 40000, "blanco", 'a', 65);
        L1.comprobarConsumoEnergetico(Character.MIN_VALUE);
        L1.comprobarColor("blanco");

        aparato.add(L1);

        Lavadora L2 = new Lavadora(12, 54000, "blanco", 'b', 60);
        L2.comprobarConsumoEnergetico(Character.MIN_VALUE);
        L2.comprobarColor("blanco");

        aparato.add(L2);

        Lavadora L3 = new Lavadora(8, 37500, "blanco", 'd', 58);
        L3.comprobarConsumoEnergetico(Character.MIN_VALUE);
        L3.comprobarColor("blanco");

        aparato.add(L3);

        Televisor tv1 = new Televisor(55, true, 45000, "negro", 'a', 14);
        tv1.comprobarConsumoEnergetico(Character.MIN_VALUE);
        tv1.comprobarColor("negro");

        aparato.add(tv1);

        Televisor tv2 = new Televisor(32, false, 28000, "negro", 'a', 7);
        tv2.comprobarConsumoEnergetico(Character.MIN_VALUE);
        tv2.comprobarColor("negro");

        aparato.add(tv2);

        Televisor tv3 = new Televisor(27, true, 45000, "negro", 'a', 9);
        tv3.comprobarConsumoEnergetico(Character.MIN_VALUE);
        tv3.comprobarColor("negro");

        aparato.add(tv3);

        for (Electrodomestico electrodomesticos : aparato) {
            System.out.println(electrodomesticos);
        }

        //ejecuciones del metodo precio final
        L1.precioFinal();
        L2.precioFinal();
        L3.precioFinal();
        tv1.precioFinal();
        tv2.precioFinal();
        tv3.precioFinal();

        //suma de todos los valores de los electrodomesticos
        System.out.println(L1.getPrecioBase() + L2.getPrecioBase() + L3.getPrecioBase() + tv1.getPrecioBase() + tv2.getPrecioBase() + tv3.getPrecioBase());

    }

}
