public class Radhus extends Bostad {
    private double tomtArea;
    private int antalVåningar;
    private double altanArea;

    public Radhus(int antalRum, double area, int antalBadRum, int antalKök, double pris,
            double tomtArea, int antalVåningar, double altanArea) {

        super(antalRum, area, antalBadRum, antalKök, pris);

        if (tomtArea <= 0 || antalVåningar <= 0 || altanArea <= 0) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }

        setTomtArea(tomtArea);
        setAntalVåningar(antalVåningar);
        setAltanArea(altanArea);
    }

    public void setTomtArea(double tomtArea) {
        if (tomtArea <= 0) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.tomtArea = tomtArea;
    }

    public void setAntalVåningar(int antalVåningar) {
        if (antalVåningar <= 0) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.antalVåningar = antalVåningar;
    }

    public void setAltanArea(double altanArea) {
        if (altanArea <= 0) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.altanArea = altanArea;
    }

}
