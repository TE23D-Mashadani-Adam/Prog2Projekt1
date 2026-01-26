import java.util.ArrayList;

public class Bestallningar {
    private ArrayList<Bostad> bostäder = new ArrayList<>();
    private Double totalPris;
    private ArrayList<Lagring> lagringar = new ArrayList<>();
    private ArrayList<Lagenhetshus> lagenhetshusLista = new ArrayList<>();

    public void lägg_till_villa(Villa villa){
        bostäder.add(villa);
    }

    public void lägg_till_lagenhet(Lagenhet lagenhet){
        bostäder.add(lagenhet);
    }

    public void lägg_till_radhus(Radhus radhus){
        bostäder.add(radhus);
    }

    public void lägg_till_garage(Garage garage){
        lagringar.add(garage);
    }

    public void lägg_till_lägenhetshus(Lagenhetshus lagenhetshus){
        lagenhetshusLista.add(lagenhetshus);
    }

    public void lista_beställningar(){
        System.out.println("Beställningar:");
        System.out.println("Bostäder: " + bostäder + "\n" +"Lagringar: " + lagringar 
            + "\n" + "Lägenhetshus: " + lagenhetshusLista
        );

    }

    public void ta_bort_en_beställning(){
        
    }

}
