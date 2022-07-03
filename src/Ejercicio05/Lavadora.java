package Ejercicio05;

public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {//Un constructor por defecto
        this.carga = 5;
    }

    public Lavadora(Integer precioBase, Integer peso) {//Un constructor con el precio y peso. El resto por defecto
        super(precioBase, peso);
        this.color = "Blanco";
        this.consumo = 'f';
    }

    public Lavadora(Integer carga, Integer precioBase, String color, Character consumo, Integer peso) {
        //Un constructor con la carga 
        //y el resto de atributos heredados.
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
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

        if (peso > 30) {//To change body of generated methods, choose Tools | Templates.
            precioBase = precioBase + 500;
        } else if (peso <= 30) {
            precioBase = precioBase + 0;
        }
        System.out.println(precioBase);
        {
//        si tiene una carga mayor de 30 kg
//        , aumentará el precio en $500
//        , si la carga es menor o igual
//        , no se incrementará el precio.
//        Este método debe llamar al método padre y añadir el código necesario
//        . Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también
//        deben afectar al precio
        }
    }
}
