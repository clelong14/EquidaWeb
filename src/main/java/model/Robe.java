/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sio2
 */
public class Robe {
    
    private int id;
    private String libelle;
    private String description;
    
    private ArrayList<Cheval> lesChevaux;

    
    public Robe() {
    }
    
    public Robe(int id) {
        this.id = id;
    }

    public Robe(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Robe(int id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }

    public Robe(int id, String libelle, String description, ArrayList<Cheval> lesChevaux) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.lesChevaux = lesChevaux;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Cheval> getLesChevaux() {
        return lesChevaux;
    }

    public void setLesChevaux(ArrayList<Cheval> lesChevaux) {
        this.lesChevaux = lesChevaux;
    }
    
    public void addCheval(Cheval unCheval){
        if (lesChevaux ==null ){
            lesChevaux = new ArrayList<Cheval>();
        }
        lesChevaux.add(unCheval);
    }
}
