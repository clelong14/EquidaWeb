package model;

import java.time.LocalDate;

public class Cheval {

    private int id;
    private String nom;
    private LocalDate dateNaissance;

    private Race race;
    private Cheval chevalPere;
    private Cheval chevalMere;

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

    public Cheval(int id, String nom, LocalDate dateNaissance, Race race) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.race = race;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance, Race race, Cheval chevalPere) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.race = race;
        this.chevalPere = chevalPere;
    }

    public Cheval(int id, String nom, LocalDate dateNaissance, Race race, Cheval chevalPere, Cheval chevalMere) {
        this.id = id;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.race = race;
        this.chevalPere = chevalPere;
        this.chevalMere = chevalMere;
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

    public Cheval getChevalPere() {
        return chevalPere;
    }

    public void setChevalPere(Cheval chevalPere) {
        this.chevalPere = chevalPere;
    }

    public Cheval getChevalMere() {
        return chevalMere;
    }

    public void setChevalMere(Cheval chevalMere) {
        this.chevalMere = chevalMere;
    }
}
