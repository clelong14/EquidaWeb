package model;

import java.time.LocalDate;

public class Cheval {

    private int id;
    private String nom;
    private LocalDate dateNaissance;
    private String sire;
    private String taille;
    private String poids;

    private Race race;
    private Robe robe;

    public Cheval() {
    }

    public Cheval(int id) {
        this.id = id;
    }

    public Cheval(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance, String sire) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.sire = sire;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance, String sire, String taille) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.sire = sire;
        this.taille = taille;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance, String sire, String taille, String poids) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.sire = sire;
        this.taille = taille;
        this.poids = poids;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance, String sire, String taille, String poids, Race race) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.sire = sire;
        this.taille = taille;
        this.poids = poids;
        this.race = race;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance, String sire, String taille, String poids, Race race, Robe robe) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.sire = sire;
        this.taille = taille;
        this.poids = poids;
        this.race = race;
        this.robe = robe;
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

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public Robe getRobe() {
        return robe;
    }

    public void setRobe(Robe robe) {
        this.robe = robe;
    }
    
}
