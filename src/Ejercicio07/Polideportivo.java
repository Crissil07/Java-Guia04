
package Ejercicio07;


public abstract class Polideportivo implements Edificio {
    
    protected Integer contA;
    protected Integer contB;//no la uso
    private String nombre;
    protected String cubierta;
    private Double largo;
    private Double ancho;

    public Polideportivo() {
        contA = 0;
        contB = 0;        
    }

    public Polideportivo(Integer contA, Integer contB, String nombre, String cubierta, Double largo, Double ancho) {
        this.contA = contA;
        this.contB = contB;
        this.nombre = nombre;
        this.cubierta = cubierta;
        this.largo = largo;
        this.ancho = ancho;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCubierta() {
        return cubierta;
    }

    public void setCubierta(String cubierta) {
        this.cubierta = cubierta;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    
    @Override
    public Double calcularSuperficie() {
        Double Superficie = ancho * largo;
        return Superficie;        
    }

    @Override
    public Integer tipoInstalacion() {
        if (cubierta.equalsIgnoreCase("cubierto")) {
            contA=1;
        }else if (cubierta.equals("descubierto")) {
            contA=2;            
        }
    
        return contA;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", cubierta=" + cubierta + ", largo=" + largo + ", ancho=" + ancho + '}';
    }
    
    
}
