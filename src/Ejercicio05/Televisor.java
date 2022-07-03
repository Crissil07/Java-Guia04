package Ejercicio05;

public class Televisor extends Electrodomestico {

    private Integer pulgadas;
    private Boolean sintonizadorTDT;

    public Televisor() {//constructor por defecto
        this.pulgadas = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(Integer precioBase, Integer peso) {//Un constructor con el precio y peso, el resto por defecto
        super(precioBase, peso);
        this.color = "Blanco";
        this.consumo = 'f';
        this.pulgadas = 20;
        this.sintonizadorTDT = false;
    }

    public Televisor(Integer pulgadas, Boolean sintonizadorTDT, Integer precioBase, String color, Character consumo, Integer peso) {

//        Un constructor con la resolución
//        , sintonizador TDT y el resto de atributos heredados
        super(precioBase, color, consumo, peso);
        this.pulgadas = 20;
        this.sintonizadorTDT = false;
    }

//    Método get y set de los atributos resolución y sintonizador TDT
    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public void precioFinal() {
        //To change body of generated methods, choose Tools | Templates.

        if (pulgadas > 40) {
            precioBase = ((precioBase * 30) / 100) + precioBase;
        } else if (sintonizadorTDT = true) {
            precioBase = precioBase + 500;
        }
        System.out.println(precioBase);
        //        si el televisor tiene una resolución mayor de 40 pulgadas
        //        , se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado
        //        , aumentará $500. 
        //        Recuerda que las condiciones que hemos visto en la clase 
        //        Electrodomestico también deben afectar al precio
    }

}
