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

    @Override
    protected void setAntalBadRum(int antalBadRum) {
        // TODO Auto-generated method stub
        super.setAntalBadRum(antalBadRum);
    }

    @Override
    protected void setAntalKök(int antalKök) {
        // TODO Auto-generated method stub
        super.setAntalKök(antalKök);
    }

    @Override
    protected void setAntalRum(int antalRum) {
        // TODO Auto-generated method stub
        super.setAntalRum(antalRum);
    }

    @Override
    protected void setArea(double area) {
        // TODO Auto-generated method stub
        super.setArea(area);
    }

    @Override
    protected void setPris(double pris) {
        // TODO Auto-generated method stub
        super.setPris(pris);
    }

    @Override
    public String toString() {
        return "Villa [tomtArea=" + tomtArea + ", antalBassänger=" + antalBassänger + ", toString()=" + super.toString()
                + "]";
    }

    

    

}
