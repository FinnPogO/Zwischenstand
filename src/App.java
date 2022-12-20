import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {
       
        Mensch m1 = new Kunde (1,"Carsten", "Müller", 38,true);
        Mensch m2 = new Mitarbeiter(12,"Scharlatanius", "Trump", 43,false);
        Mensch m3 = new Kunde(72, "Daniel", "Trampe", 19, true);
        Mensch m4 = new Einbrecher(23, "Holger", "Trampe", 98, false);
        
        ArrayList<Mensch> menschen = new ArrayList<>();
        menschen.add(m1);
        menschen.add(m2);
        menschen.add(m3);
        menschen.add(m4);

        

        
        for (Mensch mensch : menschen) {
           mensch.showInfo();
        }

        if (m1.getRollstuhl()) {
            System.out.println("Der bre braucht Fahrstuhl");
        } else {
            System.out.println("Der bre kann treppen Laufen");
        
        }
        if (m2.getRollstuhl()) {
            System.out.println("Der bre braucht Fahrstuhl");
        } else {
            System.out.println("Der bre kann treppen Laufen");
        }

        if (m4.getRollstuhl()) {
            System.out.println("Der bre kann nicht mehr so gut einbrechen");
        } else {
            System.out.println("Der bre kann einbrechen");
        }




        
    }
}