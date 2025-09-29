package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cheval {

    private int id;
    private String nom;
    private LocalDate dateNaissance;
    private String codeSire;
    private int taille;
    private float poids;
    
    private Race race;

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
    
    public Cheval(int id, String nom, LocalDate dateNaissanc, String codeSire) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.codeSire = codeSire;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance, String codeSire, int taille, float poids) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.codeSire = codeSire;
        this.taille = taille;
        this.poids = poids;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance, String codeSire, int taille, float poids, Race race) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.codeSire = codeSire;
        this.taille = taille;
        this.poids = poids;
        this.race = race;
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

    public String getCodeSire() {
        return codeSire;
    }

    public void setCodeSire(String codeSire) {
        this.codeSire = codeSire;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }
    
    @Override
    public String toString() {
        return id + " à comme nom " + nom;
    }
}