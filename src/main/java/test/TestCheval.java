package test;

import java.time.LocalDate;
import model.Cheval;
import model.Race;
import model.Robe;

public class TestCheval {

    public static void main (String args[]){

        // création d'une instance de cheval nommée c
        Cheval c = new Cheval();
        c.setId(2);
        c.setNom("Houri");
        c.setSire("0808.000.020Z");
        c.setTaille("1,70");
        c.setPoids("500kg");

        // création d'une instance de race nommée r
        Race r = new Race();
        r.setId(1);
        r.setNom("pur-sang");
        
        // création d'une instance de race nommée r
        Robe r1 = new Robe();
        r1.setId(1);
        r1.setLibelle("Isabelle");

        //affectation de  la race au cheval grâce à la relation ManyToOne
        c.setRace(r);
        c.setRobe(r1);

        // Affichage des informations dans la console
        //voir notamment du nom de la race du cheval
        System.out.println("Cheval : " + c.getId() + " " + c.getNom() + " " + c.getSire() + " " + c.getTaille() + " " + c.getPoids() + " " 
                + c.getRace().getId() + " " + c.getRace().getNom() + " "
                + c.getRobe().getId() + " " + c.getRobe().getLibelle());
    }
}
