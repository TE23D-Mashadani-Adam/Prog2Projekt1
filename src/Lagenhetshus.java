import java.util.ArrayList;
import java.util.Arrays;

public class Lagenhetshus {
    private ArrayList<Lagenhet> lägenheter;
    private int antalLägenheter;

    public Lagenhetshus(ArrayList<Lagenhet> lägenheter, int antalLägenheter) {
        this.lägenheter = lägenheter;
        if (antalLägenheter <= 0) { //Antal lägenheter måste vara över 0
            throw new IllegalArgumentException("Välj snälla rätta värden");
        }
        this.antalLägenheter = antalLägenheter;
    }

    // Metoden listar upp alla lägenheter i lägenhetshuset
    public void lista_lägenheter(){ 
        for (int i = 0; i < lägenheter.size(); i++) {
            System.out.println("Lägenhet-" + (i+1) + " " + lägenheter.get(i).toString());
        }
    }

    // Visar upp all information om lägenhetshuset
    @Override
    public String toString() {
        return "Lagenhetshus [lägenheter=" + lägenheter.toString() + ", antalLägenheter=" + antalLägenheter + "]";
    }

    
}
