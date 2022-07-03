//Para cada Alquiler
//se guarda: el nombre y DNI del cliente, las fechas inicial y final de alquiler, la
//posición del amarre y el barco que lo ocupará. 
package Ejercicio06;

//Un alquiler se calcula
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//multiplicando el número de días de ocupación (incluyendo los días inicial y final)
//por un valor módulo de cada barco (obtenido simplemente multiplicando por 10
//los metros de eslora) y por un valor fijo (2 es en la actualidad).
public abstract class Alquiler {

    protected String nomClient;
    protected Integer dni;
    protected Integer diaI;//inicio alquiler
    protected Integer mesI;
    protected Integer añoI;
    protected Integer diaF;//fin alquiler
    protected Integer mesF;
    protected Integer AñoF;
    protected String posAmarre;
    protected String nomBarco;
    protected Integer diasOcupa;//no lo use
    protected Integer diasA;
    protected Double eslora;
    private Integer modulo;

    public Alquiler() {
        this.modulo = 2;
    }

    public Alquiler(String nomClient, Integer dni, Integer diaI, Integer mesI, Integer añoI, Integer diaF, Integer mesF, Integer AñoF, String posAmarre, String nomBarco, Integer diasOcupa, Integer diasA, Double eslora, Integer modulo) {
        this.nomClient = nomClient;
        this.dni = dni;
        this.diaI = diaI;
        this.mesI = mesI;
        this.añoI = añoI;
        this.diaF = diaF;
        this.mesF = mesF;
        this.AñoF = AñoF;
        this.posAmarre = posAmarre;
        this.nomBarco = nomBarco;
        this.diasOcupa = diasOcupa;
        this.diasA = diasA;
        this.eslora = eslora;
        this.modulo = modulo;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getDiaI() {
        return diaI;
    }

    public void setDiaI(Integer diaI) {
        this.diaI = diaI;
    }

    public Integer getMesI() {
        return mesI;
    }

    public void setMesI(Integer mesI) {
        this.mesI = mesI;
    }

    public Integer getAñoI() {
        return añoI;
    }

    public void setAñoI(Integer añoI) {
        this.añoI = añoI;
    }

    public Integer getDiaF() {
        return diaF;
    }

    public void setDiaF(Integer diaF) {
        this.diaF = diaF;
    }

    public Integer getMesF() {
        return mesF;
    }

    public void setMesF(Integer mesF) {
        this.mesF = mesF;
    }

    public Integer getAñoF() {
        return AñoF;
    }

    public void setAñoF(Integer AñoF) {
        this.AñoF = AñoF;
    }

    public String getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(String posAmarre) {
        this.posAmarre = posAmarre;
    }

    public String getNomBarco() {
        return nomBarco;
    }

    public void setNomBarco(String nomBarco) {
        this.nomBarco = nomBarco;
    }

    public Integer getDiasOcupa() {
        return diasOcupa;
    }

    public void setDiasOcupa(Integer diasOcupa) {
        this.diasOcupa = diasOcupa;
    }

    public Integer getDiasA() {
        return diasA;
    }

    public void setDiasA(Integer diasA) {
        this.diasA = diasA;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public void Alquiler() {

        Double valorAlq = diasA * (10 * eslora) * 2;
        System.out.println("Valor de alquiler: " + valorAlq);

    }

    public void diasDeAlquiler() {

        Date fechaInicio = new Date(añoI - 1900, mesI, diaI);
        Date fechaFin = new Date(AñoF - 1900, mesF, diaF);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFinString = sf.format(fechaFin);
        LocalDate fin = LocalDate.parse(fechaFinString);
        LocalDate inicio = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(fechaInicio));
        //usando ChronoUnit, calculo el numero de dias
        long dias = ChronoUnit.DAYS.between(inicio, fin);
        diasA = (int) dias;
        System.out.println("Dias de alquiler: " + diasA);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nomClient=" + nomClient + ", dni=" + dni + ", diaI=" + diaI + ", mesI=" + mesI + ", a\u00f1oI=" + añoI + ", diaF=" + diaF + ", mesF=" + mesF + ", A\u00f1oF=" + AñoF + ", posAmarre=" + posAmarre + ", nomBarco=" + nomBarco + ", diasOcupa=" + diasOcupa + ", diasA=" + diasA + '}';
    }

}
