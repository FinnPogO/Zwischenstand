public abstract class Mensch {
    String vorname;
    String nachname;
    int alter;
    boolean rollstuhl;
    

    public Mensch(String vorname, String nachname, int alter, boolean rollstuhl){
        setNachname(nachname);
        setVorname(vorname);
        setAlter(alter);
        setRollstuhl(rollstuhl);
    }

    public abstract void showInfo();


    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getVorname() {
        return vorname;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getAlter() {
        return alter;
    }
    public void setRollstuhl(boolean rollstuhl) {
        this.rollstuhl = rollstuhl;
    }
    public boolean getRollstuhl() {
        return rollstuhl;
    }

    
}
