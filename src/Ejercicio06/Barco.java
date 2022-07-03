//Barco se caracteriza por: su
//matrícula, su eslora en metros y año de fabricación. 
package Ejercicio06;

//se pretende diferenciar la información de algunos tipos de barcos
//especiales:
//• Número de mástiles para veleros
//• Potencia en CV para embarcaciones deportivas a motor
//• Potencia en CV y número de camarotes para yates de lujo.

public class Barco extends Alquiler {
    
    private Integer matricula;   
    private Integer añoFab;
    private Integer numMastil;
    private Integer hp;
    private Integer camarotes; 

    public Barco() {
    }

    public Barco(Integer matricula, Integer añoFab, Integer numMastil, Integer hp, Integer camarotes, String nomClient, Integer dni, Integer diaI, Integer mesI, Integer añoI, Integer diaF, Integer mesF, Integer AñoF, String posAmarre, String nomBarco, Integer diasOcupa, Integer diasA, Double eslora, Integer modulo) {
        super(nomClient, dni, diaI, mesI, añoI, diaF, mesF, AñoF, posAmarre, nomBarco, diasOcupa, diasA, eslora, modulo);
        this.matricula = matricula;
        this.añoFab = añoFab;
        this.numMastil = numMastil;
        this.hp = hp;
        this.camarotes = camarotes;
    }

   

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getAñoFab() {
        return añoFab;
    }

    public void setAñoFab(Integer añoFab) {
        this.añoFab = añoFab;
    }

    public Integer getNumMastil() {
        return numMastil;
    }

    public void setNumMastil(Integer numMastil) {
        this.numMastil = numMastil;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", a\u00f1oFab=" + añoFab + ", numMastil=" + numMastil + ", hp=" + hp + ", camarotes=" + camarotes + '}';
    }

    
    
}
