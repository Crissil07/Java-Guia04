package Ejercicio06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alquiler> barco = new ArrayList();
        Alquiler datos;
        Barco datos2;
        String op;
        String op2;
        String tipoBarco;

        do {

            datos = new Alquiler() {};
            datos2 = new Barco();
            System.out.println("-----------------------------------------");
            System.out.println("Nombre del cliente");
            String nombre = scan.next();
            datos.setNomClient(nombre);
            System.out.println("Dni");
            Integer dni = scan.nextInt();
            datos.setDni(dni);
            System.out.println("Nombre del barco");
            String nomBar = scan.next();
            datos.setNomBarco(nomBar);
            System.out.println("Ingrese la fecha de alquiler (Dia Mes Año)");
            Integer dia = scan.nextInt();
            datos.setDiaI(dia);
            Integer mes = scan.nextInt();
            datos.setMesI(mes);
            Integer año = scan.nextInt();
            datos.setAñoI(año);
            System.out.println("Ingrese la fecha de devolucion (Dia Mes Año)");
            Integer diaF = scan.nextInt();
            datos.setDiaF(diaF);
            Integer mesF = scan.nextInt();
            datos.setMesF(mesF);
            Integer añoF = scan.nextInt();
            datos.setAñoF(añoF);
            System.out.println("Poste de amarre");
            String poste = scan.next();
            datos.setPosAmarre(poste);
            barco.add(datos);
            System.out.println("Metros de eslora (largo del barco)");
            Double eslo = scan.nextDouble();
            datos.setEslora(eslo);
            System.out.println("-----------------------------------------");
            System.out.println("Datos extra");
            System.out.println("Matricula");
            Integer mat = scan.nextInt();
            datos2.setMatricula(mat);            
            System.out.println("Año de fabricacion");
            Integer fabric = scan.nextInt();
            datos2.setAñoFab(fabric);
            System.out.println("Si su barco es especial: velero, competicion, etc, ingrese si");
            op2 = scan.next();
            if (op2.equalsIgnoreCase("si")) {
                System.out.println("Numero de mastiles del barco");
                Integer mastil = scan.nextInt();
                datos2.setNumMastil(mastil);
                System.out.println("Cavallos de velocidad");
                Integer hp = scan.nextInt();
                datos2.setHp(hp);
                System.out.println("Numeros de camarotes");
                Integer camaro = scan.nextInt();
                datos2.setCamarotes(camaro);
            }
            barco.add(datos2);
            System.out.println("¿Desea agregar otro barco a la lista de alquiler?");
            op = scan.next();

        } while (op.equalsIgnoreCase("si"));

//        for (Alquiler alquiler : barco) {
//            System.out.println("[" + alquiler + "]");
//        }
        
        datos.diasDeAlquiler();
        datos.Alquiler();

    }

}
