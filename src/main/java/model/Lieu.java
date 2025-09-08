/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sio2
 */
public class Lieu {
    
    private int id;
    private String ville;
    private int nbBoxes;
    private String commentaires;
    
    private Vente vente;

    public Lieu() {
    }

    public Lieu(int id) {
        this.id = id;
    }

    public Lieu(int id, String ville) {
        this.id = id;
        this.ville = ville;
    }

    public Lieu(int id, String ville, int nbBoxes) {
        this.id = id;
        this.ville = ville;
        this.nbBoxes = nbBoxes;
    }

    public Lieu(int id, String ville, int nbBoxes, String commentaires) {
        this.id = id;
        this.ville = ville;
        this.nbBoxes = nbBoxes;
        this.commentaires = commentaires;
    }

    public Lieu(int id, String ville, int nbBoxes, String commentaires, Vente vente) {
        this.id = id;
        this.ville = ville;
        this.nbBoxes = nbBoxes;
        this.commentaires = commentaires;
        this.vente = vente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getNbBoxes() {
        return nbBoxes;
    }

    public void setNbBoxes(int nbBoxes) {
        this.nbBoxes = nbBoxes;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }
    
}
