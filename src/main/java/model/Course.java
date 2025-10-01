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
public class Course {
    private int id;
    private String nom;
    private String ville;
    
    private ArrayList<ChevalCourse> lesCoursesCheval;

    public Course() {
    }

    public Course(int id) {
        this.id = id;
    }

    public Course(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Course(int id, String nom, String ville) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
    }

    public Course(int id, String nom, String ville, ArrayList<ChevalCourse> lesCoursesCheval) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.lesCoursesCheval = lesCoursesCheval;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    public ArrayList<ChevalCourse> getLesCoursesCheval() {
        return lesCoursesCheval;
    }

    public void setLesCoursesCheval(ArrayList<ChevalCourse> lesCoursesCheval) {
        this.lesCoursesCheval = lesCoursesCheval;
    }
}
