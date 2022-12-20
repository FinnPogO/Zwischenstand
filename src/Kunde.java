public class Kunde extends Mensch {
    int Kundennummer;
    


    public Kunde(String vorname, String nachname, int alter, boolean rollstuhl, int kundennummer){
        super(vorname, nachname, alter, rollstuhl);
        setKundennummer(Kundennummer);
        

    }

    public void showInfo() {
        System.out.println(getVorname()+" "+getNachname()+" "+getAlter()+" "+getKundennummer()+" "+getRollstuhl());
    }

    public void setKundennummer(int kundennummer) {
        Kundennummer = kundennummer;
    }
    public int getKundennummer() {
        return Kundennummer;
    }

    
    
    
}
