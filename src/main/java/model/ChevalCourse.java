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
public class ChevalCourse {
    private int position;
    private String temps;
    
    private Course course;

    public ChevalCourse() {
    }

    public ChevalCourse(int position) {
        this.position = position;
    }

    public ChevalCourse(int position, String temps) {
        this.position = position;
        this.temps = temps;
    }

    public ChevalCourse(int position, String temps, Course course) {
        this.position = position;
        this.temps = temps;
        this.course = course;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}