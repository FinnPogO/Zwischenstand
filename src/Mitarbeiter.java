public class Mitarbeiter extends Mensch{
    int mitarbeiternummer;
    double gehalt;

    public Mitarbeiter(String vorname, String nachname, int alter, boolean rollstuhl, int mitarbeiternummer, double gehalt){
        super(vorname, nachname, alter, rollstuhl);
        setMitarbeiternummer(mitarbeiternummer);
        setGehalt(gehalt);

    }

    public void showInfo() {
        System.out.println(getVorname()+" "+getNachname()+" "+getAlter()+" "+getGehalt()+" "+getMitarbeiternummer()+" "+getRollstuhl());
    }

    public void setMitarbeiternummer(int mitarbeiternummer) {
        this.mitarbeiternummer = mitarbeiternummer;
    }
    public int getMitarbeiternummer() {
        return mitarbeiternummer;
    }   

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
    public double getGehalt() {
        return gehalt;
    }


    
}
