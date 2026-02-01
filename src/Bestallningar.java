import java.util.ArrayList;

public class Bestallningar {
    private ArrayList<Bostad> bostäder = new ArrayList<>(); // Lista för beställda bostäder
    private Double totalPris;
    private ArrayList<Lagring> lagringar = new ArrayList<>(); // Beställda lagringar
    private ArrayList<Lagenhetshus> lagenhetshusLista = new ArrayList<>(); // Beställda lägenhetshus

    // Metoder som lägger till beställningsobjekt i sina rätta listor

    public void lägg_till_villa(Villa villa) {
        bostäder.add(villa);
    }

    public void lägg_till_lagenhet(Lagenhet lagenhet) {
        bostäder.add(lagenhet);
    }

    public void lägg_till_radhus(Radhus radhus) {
        bostäder.add(radhus);
    }

    public void lägg_till_garage(Garage garage) {
        lagringar.add(garage);
    }

    public void lägg_till_lägenhetshus(Lagenhetshus lagenhetshus) {
        lagenhetshusLista.add(lagenhetshus);
    }

    //Listar upp alla beställningar
    public void lista_beställningar() {
        System.out.println("Beställningar:");
        System.out.println("Bostäder: " + bostäder + "\n" + "Lagringar: " + lagringar
                + "\n" + "Lägenhetshus: " + lagenhetshusLista);

    }

}
