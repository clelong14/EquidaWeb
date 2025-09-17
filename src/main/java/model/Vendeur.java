/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sio2
 */
public class Vendeur extends Client {

    public Vendeur() {
    }
    
    public Vendeur(int id) {
        super(id);
    }

    public Vendeur(int id, String titre) {
        super(id, titre);
    }

    public Vendeur(int id, String titre, String nom) {
        super(id, titre, nom);
    }

    public Vendeur(int id, String titre, String nom, String prenom, String rue) {
        super(id, titre, nom, prenom, rue);
    }

    public Vendeur(int id, String titre, String nom, String prenom, String rue, int copos) {
        super(id, titre, nom, prenom, rue, copos);
    }

    public Vendeur(int id, String titre, String nom, String prenom, String rue, int copos, String ville) {
        super(id, titre, nom, prenom, rue, copos, ville);
    }

    public Vendeur(int id, String titre, String nom, String prenom, String rue, int copos, String ville, String adresseMessagerie) {
        super(id, titre, nom, prenom, rue, copos, ville, adresseMessagerie);
    }
    
    
}
