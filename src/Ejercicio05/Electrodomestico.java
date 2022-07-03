//Crear una superclase llamada Electrodomestico con los siguientes atributos:
//precio base, color, consumo energético (letras entre A y F) y peso. Por defecto, el
//color será blanco, el consumo energético sera F, el precioBase de $1000 y el peso
//de 5 kg. Los colores disponibles para los electrodomésticos son blanco, negro,
//rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.
package Ejercicio05;

public class Electrodomestico {

    protected Integer precioBase;
    protected String color;
    protected Character consumo;
    protected Integer peso;

    public Electrodomestico() {//constructor por defecto
        this.precioBase = 1000;
        this.color = "blanco";
        this.consumo = 'f';
        this.peso = 5;

    }

    public Electrodomestico(Integer precioBase, Integer peso) {//constructor con precio y peso, el resto de los atributos por defecto
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumo = 'f';
    }

    public Electrodomestico(Integer precioBase, String color, Character consumo, Integer peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    //Métodos getters y setters de todos los atributos
    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public char comprobarConsumoEnergetico(Character letra) {

        if (consumo.equals('a') || consumo.equals('b') || consumo.equals('c') || consumo.equals('d') || consumo.equals('e') || consumo.equals('f')) {
        } else {
            consumo = 'f';
        }
//        comprueba que la letra
//        es correcta, sino es correcta usara la letra por defecto.Este método se debe
//        invocar al crear el objeto y no será visible.
        return consumo;
    }

    public void comprobarColor(String Color) {

        if (color.equalsIgnoreCase("blanco")) {
        } else {
            if (color.equalsIgnoreCase("amarillo") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("violeta")) {
                color = "blanco";
            }
        }

//        comprueba que el color es correcto, y
//        si no lo es, usa el color por defecto
//        . Este método se invocará al crear el objeto
//        y no será visible
    }

    public void precioFinal() {

        switch (consumo) {
            case 'a':
                precioBase = precioBase + 1000;
                break;
            case 'b':
                precioBase = precioBase + 800;
                break;
            case 'c':
                precioBase = precioBase + 600;
                break;
            case 'd':
                precioBase = precioBase + 500;
                break;
            case 'e':
                precioBase = precioBase + 300;
                break;
            case 'f':
                precioBase = precioBase + 100;
                break;
        }

        System.out.println(precioBase);
        //según el consumo energético y su tamaño
        //aumentará el precio

//        if (peso > 0 & peso <= 19) {
//            precioBase = precioBase + 100;
//        } else if (peso >= 20 & peso <= 49) {
//            precioBase = precioBase + 500;
//        } else if (peso >= 50 & peso <= 79) {
//            precioBase = precioBase + 800;
//        } else if (peso >= 80) {
//            precioBase = precioBase + 1000;
//        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

}
