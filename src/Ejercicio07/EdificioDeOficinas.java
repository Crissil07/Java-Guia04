
package Ejercicio07;


public class EdificioDeOficinas extends Polideportivo implements Edificio {
    
    private Integer numOfi;
    private Integer numPisos;
    
    

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numOfi, Integer numPisos, Double anchoA, Double largoA, Integer contA, Integer contB, String nombre, String cubierta, Double largo, Double ancho) {
        super(contA, contB, nombre, cubierta, largo, ancho);
        this.numOfi = numOfi;
        this.numPisos = numPisos;        
    }

    public Integer getNumOfi() {
        return numOfi;
    }

    public void setNumOfi(Integer numOfi) {
        this.numOfi = numOfi;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numOfi=" + numOfi + ", numPisos=" + numPisos + '}';
    }
    
    
    
}
