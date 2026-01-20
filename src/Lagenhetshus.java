import java.util.Arrays;

public class Lagenhetshus {
    private Lagenhet[] lägenheter;
    private int antalLägenheter;

    public Lagenhetshus(Lagenhet[] lägenheter, int antalLägenheter) {
        this.lägenheter = lägenheter;
        if (antalLägenheter <= 0) { //Antal lägenheter måste vara över 0
            throw new IllegalArgumentException("Välj snälla rätta värden");
        }
        this.antalLägenheter = antalLägenheter;
    }

    public void lista_lägenheter(){ 
        for (int i = 0; i < lägenheter.length; i++) {
            System.out.println("Lägenhet-" + (i+1) + " " + lägenheter[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Lagenhetshus [lägenheter=" + Arrays.toString(lägenheter) + ", antalLägenheter=" + antalLägenheter + "]";
    }

    
}
