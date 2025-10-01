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
public class Lot {
    private int id;
    private float prixDepart;
    
    private Vente vente;
    private Cheval cheval;
    
    public Lot() {
    }

    public Lot(int id) {
        this.id = id;
    }

    public Lot(int id, float prixDepart) {
        this.id = id;
        this.prixDepart = prixDepart;
    }

    public Lot(int id, float prixDepart, Vente vente) {
        this.id = id;
        this.prixDepart = prixDepart;
        this.vente = vente;
    }

    public Lot(int id, float prixDepart, Vente vente, Cheval cheval) {
        this.id = id;
        this.prixDepart = prixDepart;
        this.vente = vente;
        this.cheval = cheval;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(float prixDepart) {
        this.prixDepart = prixDepart;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    public Cheval getCheval() {
        return cheval;
    }

    public void setCheval(Cheval cheval) {
        this.cheval = cheval;
    }
}
