public class Villa extends Bostad {
    private double tomtArea;
    private int antalBassänger;

     public Villa(int antalRum, double area, int antalBadRum, int antalKök, double pris,
                 double tomtArea, int antalBassänger) {

        // Superklass hanterar validering av antalRum, area, antalBadRum, antalKök och pris
        super(antalRum, area, antalBadRum, antalKök, pris);

        // Validering av Villa-specifika variabler
        if (tomtArea <= 0 || antalBassänger <= 0) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }

        this.tomtArea = tomtArea;
        this.antalBassänger = antalBassänger;
    }

    public void setTomtArea(double tomtArea) {
        if (tomtArea <= 0) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.tomtArea = tomtArea;
    }

    public void setAntalBassänger(int antalBassänger) {
        if (antalBassänger <= 0) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.antalBassänger = antalBassänger;
    }

}
