package Ejercicio07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Polideportivo> poli = new ArrayList();
        ArrayList<EdificioDeOficinas> ofis = new ArrayList();
        Polideportivo pol;
        EdificioDeOficinas of;
        String nombre;
        String tipo;
        Double ancho;
        Double anchoB;
        Double largo;
        Double largoB;
        Integer pisos;
        Integer cantOf;
        Integer cubierto = 0;
        Integer descubierto = 0;

        System.out.println("Polideportivos:");

        for (int i = 1; i <= 3; i++) {
            pol = new Polideportivo() {
            };
            System.out.println("Nombre del polideportivo numero " + i);
            nombre = scan.next();
            pol.setNombre(nombre);
            System.out.println("Ingresa si es cubierto o descubierto");
            tipo = scan.next();
            pol.setCubierta(tipo);
            System.out.println("Ingresa el ancho (con decimales)");
            ancho = scan.nextDouble();
            pol.setAncho(ancho);
            System.out.println("Ingresa el largo (con decimales)");
            largo = scan.nextDouble();
            pol.setLargo(largo);
            poli.add(pol);
            System.out.print(poli.toString());
        }

        System.out.println("\n");
        System.out.println("Oficinas:");

        for (int i = 1; i <= 2; i++) {
            of = new EdificioDeOficinas();
            System.out.println("Ingrese el numero de pisos");
            pisos = scan.nextInt();
            of.setNumPisos(pisos);
            System.out.println("Ingrese el numero de oficinas");
            cantOf = scan.nextInt();
            of.setNumOfi(cantOf);
            System.out.println("Ingrese el ancho");
            ancho = scan.nextDouble();
            of.setAncho(ancho);
            System.out.println("Ingrese el largo");
            largo = scan.nextDouble();
            of.setLargo(largo);
            ofis.add(of);
            System.out.print(ofis.toString());
        }

        Iterator<Polideportivo> it1 = poli.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
            System.out.println("Superficie: " + it1.next().calcularSuperficie());
            if (it1.next().tipoInstalacion().equals(1)) {
                cubierto++;
            }
            if (it1.next().tipoInstalacion().equals(2)) {
                descubierto++;
            }

        }

        Iterator<EdificioDeOficinas> it2 = ofis.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
            System.out.println("Superficie: " + it2.next().calcularSuperficie());
        }
    }
}
