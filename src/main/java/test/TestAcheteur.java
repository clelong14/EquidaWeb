/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.Acheteur;

/**
 *
 * @author sio2
 */
public class TestAcheteur {
    public static void main (String args[]){
        
        //Instanciation de vendeur v
        Acheteur a = new Acheteur();
        a.setNom("Lelong");
        a.setPrenom("Yohann");
        a.setRue("13 Rue Victor Hugo");
        a.setCopos(50130);
        a.setVille("Cherbourg-en-Cotentin");
        a.setAdresseMessagerie("youlelong@aol.com");
        
        System.out.println("L'acheteur " + a.getNom() + " " + a.getPrenom() + " habite" + a.getRue()
                + " a " + a.getVille() + " " + a.getCopos() + ", avec comme adresse de contact "
                + a.getAdresseMessagerie());
    }
}
