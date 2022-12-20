public class Einbrecher extends Mensch {
 Integer anzahleinbruch;

    public Einbrecher(String vorname, String nachname, int alter, boolean rollstuhl, int anzahleinbruch){
    super(vorname, nachname, alter, rollstuhl);
    setAnzahleinbruch(anzahleinbruch);
}

    public void showInfo() {
        System.out.println(getVorname()+" "+getNachname()+" "+getAlter()+" "+getAnzahleinbruch()+" "+getRollstuhl());
    }

    public void setAnzahleinbruch(Integer anzahleinbruch) {
        this.anzahleinbruch = anzahleinbruch;
    }
    public Integer getAnzahleinbruch() {
        return anzahleinbruch;
    }
    

    
}
