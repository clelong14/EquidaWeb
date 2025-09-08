/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sio2
 */
public class Vente {
    
    private int id;
    private String nom;
    private String dateDebutVente;
    
    private CategVente categVente;
    private Lieu lieu;

    public Vente() {
        
    }

    public Vente(int id) {
        this.id = id;
    }

    public Vente(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Vente(int id, String nom, String dateDebutVente) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
    }

    public Vente(int id, String nom, String dateDebutVente, CategVente categVente) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
        this.categVente = categVente;
    }

    public Vente(int id, String nom, String dateDebutVente, CategVente categVente, Lieu lieu) {
        this.id = id;
        this.nom = nom;
        this.dateDebutVente = dateDebutVente;
        this.categVente = categVente;
        this.lieu = lieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateDebutVente() {
        return dateDebutVente;
    }

    public void setDateDebutVente(String dateDebutVente) {
        this.dateDebutVente = dateDebutVente;
    }

    public CategVente getCategVente() {
        return categVente;
    }

    public void setCategVente(CategVente categVente) {
        this.categVente = categVente;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }
}