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
        v.setNom("Un poneyyyy");
        v.setDateDebutVente("2024-05-25");

        // création d'une instance de CategVente nommée c
        CategVente c = new CategVente();
        c.setCode(1);
        c.setLibelle("Jument");
        
        // création d'une instance de Lieu nommée l
        Lieu l = new Lieu();
        l.setId(3);
        l.setVille("Cherbourg");
        l.setNbBoxes(5);
        l.setCommentaires("Rawru");

        //affectation de  la CategVente au Vente grâce à la relation ManyToOne
        v.setCategVente(c);
        v.setLieu(l);

        // Affichage des informations dans la console
        //voir notamment du nom de la catgegorie de vente
        System.out.println("Vente : " + " " + v.getNom() + " a vendre, date de debut de la vente prevu le " + v.getDateDebutVente()+ " dans la categorie " + 
                v.getCategVente().getLibelle() + " situee dans la ville de " + v.getLieu().getVille() + " dans le box numero " + v.getLieu().getNbBoxes() + ". " + v.getLieu().getCommentaires());
    }
}