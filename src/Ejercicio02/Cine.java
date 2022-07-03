package Ejercicio02;

import java.util.ArrayList;

public class Cine {

    private String salaMatriz[][];
    private Pelicula reproduciendo;
    private double entrada = 150;

    public Cine() {
    }

    public Cine(String[][] salaMatriz, Pelicula reproduciendo, double entrada) {
        this.salaMatriz = salaMatriz;
        this.reproduciendo = reproduciendo;
        this.entrada = entrada;
    }

    public String[][] getSalaMatriz() {
        return salaMatriz;
    }

    public void setSalaMatriz(String[][] salaMatriz) {
        this.salaMatriz = salaMatriz;
    }

    public Pelicula getReproduciendo() {
        return reproduciendo;
    }

    public void setReproduciendo(Pelicula reproduciendo) {
        this.reproduciendo = reproduciendo;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public void salaVacia() {
        this.salaMatriz = new String[8][9];
        String[] butaca = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};

        int contador = 8; // cantidad de filas

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                this.salaMatriz[i][j] = contador + butaca[j];
            }
            contador--;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(this.salaMatriz[i][j]);
            }
            System.out.println("");
        }
    }

    public void salaLLena() {
        Pelicula peli = new Pelicula();
        peli.llenarPelicula();
        ArrayList<Espectador> listaEspect = new ArrayList();

        for (int i = 0; i < 10; i++) {
            Espectador especta = new Espectador();
            especta.llenarEspectador();
            listaEspect.add(especta);
        }

        for (Espectador espe : listaEspect) {
            System.out.println(espe.toString());
        }

        Cine elCine = new Cine();

        for (Espectador espe : listaEspect) {
            int edadEspect = espe.getEdad();
            int edadMin = peli.getEdadMinima();
            double precioEntrada = elCine.getEntrada();
            double plataDisponible = espe.getDinero();

            if (edadEspect >= edadMin) {

                if (plataDisponible > precioEntrada) {
                    boolean accedio = false;
                    do {
                        int fila = (int) (Math.random() * 8);
                        int colum = (int) (Math.random() * 9);

                        if (this.salaMatriz[fila][colum].equalsIgnoreCase(" 0 ")) {
                            System.out.println("Se le asignara otro lugar");
                        } else {
                            this.salaMatriz[fila][colum] = " 0 ";
                            accedio = true;
                            break;
                        }

                    } while (!accedio);

                } else {
                    System.out.println("No alcanza el dinero");
                }
            } else {
                System.out.println("No tiene la mayoria de edad");
            }

        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(this.salaMatriz[i][j]);
            }
            System.out.println("");
        }

    }

}
