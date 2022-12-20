import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {
       
        Mensch m1 = new Kunde("Carsten", "Meier", 98, true, 0);
        Mensch m2 = new Mitarbeiter("Scharlatanius", "Trump", 56, false, 2736, 23.5);
        Mensch m3 = new Mitarbeiter("Frank", "Mürer", 23, true, 4765, 12.5);
        Mensch m4 = new Einbrecher("Daniel", "Chowanek", 16, false, 4);
        
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
        } 
        
        
        if (m2.getRollstuhl()) {
            System.out.println("Der bre kann treppen Laufen");
        } 

        if (m3.getRollstuhl()) {
            System.out.println("Der bre braucht Fahrstuhl");
        }

        if (m4.getRollstuhl()) {
            System.out.println("Der bre kann nicht mehr so gut einbrechen");
        } else {
            System.out.println("Der bre kann einbrechen");
        }




        
    }
}
