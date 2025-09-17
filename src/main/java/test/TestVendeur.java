/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.Vendeur;

/**
 *
 * @author sio2
 */
public class TestVendeur {
    public static void main (String args[]){
        
        //Instanciation de vendeur v
        Vendeur v = new Vendeur();
        v.setNom("Lelong");
        v.setPrenom("Lukas");
        v.setRue("13 Rue Victor Hugo");
        v.setCopos(50130);
        v.setVille("Cherbourg-en-Cotentin");
        v.setAdresseMessagerie("lukaslelong12@gmail.com");
        
        System.out.println("Le vendeur " + v.getNom() + " " + v.getPrenom() + " habite" + v.getRue()
                + " a " + v.getVille() + " " + v.getCopos() + ", avec comme adresse de contact "
                + v.getAdresseMessagerie());
    }
}
