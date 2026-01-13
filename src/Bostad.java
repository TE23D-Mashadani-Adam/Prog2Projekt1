public abstract class Bostad {
    private int antalRum;
    private double area;
    private int antalBadRum;
    private int antalKök;
    private double pris;

    protected Bostad(int antalRum, double area, int antalBadRum, int antalKök, double pris) {

        // Kolla att alla värden är positiva
        if (antalRum <= 0 || area <= 0 || antalBadRum <= 0 || antalKök <= 0 || pris <= 0) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }

        // Villkor för gränsen på värderna
        if (antalRum > 10) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }

        if (area > 700) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }

        if (antalBadRum > 4) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }

        if (antalKök > 3) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }

        if (pris > 15000000) { // 15 miljoner
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }

        // körs om allt ser bra ut
        this.antalRum = antalRum;
        this.area = area;
        this.antalBadRum = antalBadRum;
        this.antalKök = antalKök;
        this.pris = pris;
    }

    protected void setAntalRum(int antalRum) {
        if (antalRum <= 0 || antalRum > 10) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }
        this.antalRum = antalRum;
    }

    protected void setArea(double area) {
        if (area <= 0 || area > 700) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }
        this.area = area;
    }

    protected void setAntalBadRum(int antalBadRum) {
        if (antalBadRum <= 0 || antalBadRum > 4) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }
        this.antalBadRum = antalBadRum;
    }

    protected void setAntalKök(int antalKök) {
        if (antalKök <= 0 || antalKök > 3) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }
        this.antalKök = antalKök;
    }

    protected void setPris(double pris) {
        if (pris <= 0 || pris > 15000000) {
            throw new IllegalArgumentException("Snälla sätt in rätt värden");
        }
        this.pris = pris;
    }

}
