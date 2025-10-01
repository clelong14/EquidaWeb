/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import static database.DaoCheval.resultatRequete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ChevalCourse;
import model.Course;

/**
 *
 * @author sio2
 */
public class DaoChevalCourse {
    Connection cnx;
    static PreparedStatement requeteSql = null;
    static ResultSet resultatRequete = null;

    /**
     * Récupère tous les chevaux présents dans la base de données avec leuresultatRequete races associées
     * @param cnx La connexion active à la base de données
     * @return ArrayList<ChevalCourse> La liste de tous les chevaux trouvés
     */
    public static ArrayList<ChevalCourse> getLesCoursesByCheval(Connection cnx, int idCheval) {
        ArrayList<ChevalCourse> lesCoursesCheval = new ArrayList<>();
            try {
                requeteSql = cnx.prepareStatement(
                    "SELECT c.nom as c_nom," +
                    "cc.position AS cc_position, cc.temps AS cc_temps " +
                    "FROM cheval_course cc " +
                    "INNER JOIN cheval c ON cc.cheval_id = c.id " +
                    "INNER JOIN course course ON cc.course_id = course.id " +
                    "WHERE c.id = ?; "
                );
                
                requeteSql.setInt(1, idCheval);
                resultatRequete = requeteSql.executeQuery();
                
                while (resultatRequete.next()) {
                    
                    ChevalCourse cc = new ChevalCourse();
                    cc.setPosition(resultatRequete.getInt("cc_position"));
                    cc.setTemps(resultatRequete.getString("cc_temps"));
                    lesCoursesCheval.add(cc);
                    
                    Course c = new Course();
                    c.setId(resultatRequete.getInt("c_id"));
                    c.setNom(resultatRequete.getString("c_nom"));
                    c.setVille(resultatRequete.getString("c_ville"));
                    cc.setCourse(c);
                }
                
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("La requête de getLeCheval a généré une exception SQL");
            }
            return lesCoursesCheval;
        }

    
}
