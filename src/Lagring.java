public abstract class Lagring {
    private double förrådsArea;
    private double pris;

    protected Lagring(double förrådsArea, double pris) {
        if (förrådsArea <= 0 || förrådsArea > 150) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        if (pris <= 0 || pris > 500000) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }

        // Körs om allt är ok
        this.pris = pris;
        this.förrådsArea = förrådsArea;
    }

    protected void setFörrådsArea(double förrådsArea) {
        if (förrådsArea <= 0 || förrådsArea > 150) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.förrådsArea = förrådsArea;
    }

    protected void setPris(double pris) {
        if (pris <= 0 || pris > 500000) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Lagring [förrådsArea=" + förrådsArea + ", pris=" + pris + "]";
    }

    



}
