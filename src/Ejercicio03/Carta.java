package Ejercicio03;

public class Carta {

    private int valorCarta;
    private String paloCarta;
    

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
    
    @Override
    public String toString() {
        return "Mazo{" + "valorCarta=" + valorCarta + ", paloCarta=" + paloCarta + '}';
    }

}
