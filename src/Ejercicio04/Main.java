package Ejercicio04;

public class Main {

    public static void main(String[] args) {

        Perro perro1 = new Perro("Tamara", "Carnivora", 16, "Mestiza");//declaracion del objeto Perro y sus atributos predefinidos
        perro1.alimentarse("perra");
        Perro perro2 = new Perro("Lola", "Carnivora", 9, "Callejerasa");//declaracion del objeto Perro y sus atributos predefinidos
        perro2.alimentarse("perra");

        Gato gato = new Gato("Valentin", "Carnivora", 10, "Callejero");
        gato.alimentarse("gato");
        Caballo caballo = new Caballo("Tornado", "Hervivora", 14, "LLobaca");
        caballo.alimentarse("caballo");
    }
}
