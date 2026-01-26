public class Garage extends Lagring {
    private double parkeringArea;

     public Garage(double förrådsArea, double pris, double parkeringArea) {
        // Superklass hanterar validering av förrådsArea och pris
        super(förrådsArea, pris);

        // Validering av Garage-specifik variabel
        if (parkeringArea <= 0) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }

        this.parkeringArea = parkeringArea;
    }



    public void setParkeringArea(double parkeringArea) {
        if (parkeringArea <= 0) {
            throw new IllegalArgumentException("Välj snälla tillåtna värden");
        }
        this.parkeringArea = parkeringArea;
    }

    @Override
    protected void setFörrådsArea(double förrådsArea){
        super.setFörrådsArea(förrådsArea);
    }

    @Override
    protected void setPris(double pris){
        super.setPris(pris);
    }



    @Override
    public String toString() {
        return "Garage [parkeringArea=" + parkeringArea + ", toString()=" + super.toString() + "]";
    }

    



}
