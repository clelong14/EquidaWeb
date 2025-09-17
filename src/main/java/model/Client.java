/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sio2
 */
public class Client {
    private int id;
    private String titre;
    private String nom;
    private String prenom;
    private String rue;
    private int copos;
    private String ville;
    private String adresseMessagerie;

    public Client() {
    }

    public Client(int id) {
        this.id = id;
    }

    public Client(int id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public Client(int id, String titre, String nom) {
        this.id = id;
        this.titre = titre;
        this.nom = nom;
    }

    public Client(int id, String titre, String nom, String prenom, String rue) {
        this.id = id;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
    }

    public Client(int id, String titre, String nom, String prenom, String rue, int copos) {
        this.id = id;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.copos = copos;
    }

    public Client(int id, String titre, String nom, String prenom, String rue, int copos, String ville) {
        this.id = id;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.copos = copos;
        this.ville = ville;
    }

    public Client(int id, String titre, String nom, String prenom, String rue, int copos, String ville, String adresseMessagerie) {
        this.id = id;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.copos = copos;
        this.ville = ville;
        this.adresseMessagerie = adresseMessagerie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCopos() {
        return copos;
    }

    public void setCopos(int copos) {
        this.copos = copos;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresseMessagerie() {
        return adresseMessagerie;
    }

    public void setAdresseMessagerie(String adresseMessagerie) {
        this.adresseMessagerie = adresseMessagerie;
    }
}
