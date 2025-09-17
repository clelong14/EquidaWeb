/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sio2
 */
public class Acheteur extends Client {
    private String formation;

    public Acheteur() {
    }

    public Acheteur(int id) {
        super(id);
    }

    public Acheteur(int id, String titre) {
        super(id, titre);
    }

    public Acheteur(int id, String titre, String nom) {
        super(id, titre, nom);
    }

    public Acheteur(int id, String titre, String nom, String prenom, String rue) {
        super(id, titre, nom, prenom, rue);
    }

    public Acheteur(int id, String titre, String nom, String prenom, String rue, int copos) {
        super(id, titre, nom, prenom, rue, copos);
    }

    public Acheteur(int id, String titre, String nom, String prenom, String rue, int copos, String ville) {
        super(id, titre, nom, prenom, rue, copos, ville);
    }

    public Acheteur(int id, String titre, String nom, String prenom, String rue, int copos, String ville, String adresseMessagerie) {
        super(id, titre, nom, prenom, rue, copos, ville, adresseMessagerie);
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }
}
