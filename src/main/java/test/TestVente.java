/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.CategVente;
import model.Lieu;
import model.Vente;
//import java.time.LocalDate

/**
 *
 * @author sio2
 */
public class TestVente {

    public static void main (String args[]){

        // création d'une instance de Vente nommée v
        Vente v = new Vente();
        v.setId(2);
        v.setNom("Jument");
        v.setDateDebutVente("2024-05-25");

        // création d'une instance de CategVente nommée c
        CategVente c = new CategVente();
        c.setCode(1);
        c.setLibelle("pur-sang");
        
        // création d'une instance de Lieu nommée l
        Lieu l = new Lieu();
        l.setId(3);
        l.setVille("Cherbourg");
        l.setNbBoxes(5);
        l.setCommentaires("Rawru");

        //affectation de  la CategVente au Vente grâce à la relation ManyToOne
        v.setCategVente(c);

        // Affichage des informations dans la console
        //voir notamment du nom de la catgegorie de vente
        System.out.println("Cheval : " + v.getId() + " " + v.getNom() + " " + v.getDateDebutVente());
        System.out.println("Cheval : " + v.getCategVente().getCode() + " " + v.getCategVente().getLibelle());
        
    }
}
