
package Ejercicio03;

import java.util.ArrayList;
import java.util.Collections;



public class Baraja {
    
    private ArrayList <Carta> baraja;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
    public void Barajar() {
        
        Collections.shuffle(baraja);
        for (Carta desorden : baraja) {
            System.out.println(desorden);
        }
        
    }

    public void siguienteCarta() {
        
    }

    public void cartasDisponibles() {

    }

    public void darCartas() {

    }

    public void cartasMonton() {

    }

    public void mostrarBaraja() {

    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
    
    
    
}
