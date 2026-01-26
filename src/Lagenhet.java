public class Lagenhet extends Bostad {
    private double månadsAvgift;
    private double hyraPris;


    public Lagenhet(int antalRum, double area, int antalBadRum, int antalKök, double pris,
                    double månadsAvgift, double hyraPris) {

        super(antalRum, area, antalBadRum, antalKök, pris);

        if (månadsAvgift <= 0 || månadsAvgift > 4000) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        if (hyraPris <= 0 || hyraPris > 15000) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }

        this.månadsAvgift = månadsAvgift;
        this.hyraPris = hyraPris;
    }

    public void setMånadsAvgift(double månadsAvgift) {
        if (månadsAvgift <= 0 || månadsAvgift > 4000) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.månadsAvgift = månadsAvgift;
    }

    public void setHyraPris(double hyraPris) {
        if (hyraPris <= 0 || hyraPris > 15000) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.hyraPris = hyraPris;
    }

    @Override
    protected void setAntalBadRum(int antalBadRum) {
        super.setAntalBadRum(antalBadRum);
    }

    @Override
    protected void setAntalKök(int antalKök) {
        super.setAntalKök(antalKök);
    }

    @Override
    protected void setAntalRum(int antalRum) {
        super.setAntalRum(antalRum);
    }

    @Override
    protected void setArea(double area) {
        super.setArea(area);
    }

    @Override
    protected void setPris(double pris) {
        super.setPris(pris);
    }

    @Override
    public String toString() {
        return "Lagenhet [månadsAvgift=" + månadsAvgift + ", hyraPris=" + hyraPris + ", toString()=" + super.toString()
                + "]";
    }

    

    

    

    

}
