public class Einbruch {
    String grund;
    double datum;
    String ort;


    public Einbruch(String grund, double datum, String ort){
        setDatum(datum);
        setGrund(grund);
        setOrt(ort);
    }



    
    public void setDatum(double datum) {
        this.datum = datum;
    }
    public double getDatum() {
        return datum;
    }
    public void setGrund(String grund) {
        this.grund = grund;
    }
    public String getGrund() {
        return grund;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }
    public String getOrt() {
        return ort;
    }
}
