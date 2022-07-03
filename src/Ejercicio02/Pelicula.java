package Ejercicio02;

import java.util.Scanner;

public class Pelicula {

    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public Pelicula llenarPelicula(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Pelicula peli = new Pelicula();
        System.out.println("Titulo");
        titulo= scan.next();
        peli.setTitulo(titulo);
        System.out.println("Duracion");
        duracion = scan.nextInt();
        peli.setDuracion(duracion);;
        System.out.println("Edada Minima");
        edadMinima= scan.nextInt();
        peli.setEdadMinima(edadMinima);
        System.out.println("Director");
        director = scan.next();
        peli.setDirector(director);        
        System.out.println(peli.toString());
        return peli; //retorno el objeto con los datos ya cargados       
        
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
    

}
