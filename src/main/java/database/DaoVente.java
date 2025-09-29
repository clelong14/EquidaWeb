/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cheval;
import model.Lieu;
import model.Lot;
import model.Vente;

/**
 *
 * @author sio2
 */
public class DaoVente {
    Connection cnx;
    static PreparedStatement requeteSql = null;
    static ResultSet resultatRequete = null;
    
    /**
     * Récupère tous les chevaux présents dans la base de données avec leurs races associées
     * @param cnx La connexion active à la base de données
     * @return ArrayList<Vente> La liste de tous les chevaux trouvés
     */
    public static ArrayList<Vente> getLesVentes(Connection cnx) {
        ArrayList<Vente> lesVentes = new ArrayList<Vente>();
        try {
            requeteSql = cnx.prepareStatement(
                "SELECT v.id as v_id, v.nom as v_nom, " +
                "l.id as l_id, l.ville as l_ville, l.nbBoxes as l_nbBoxes, l.commentaires as l_commentaires " +
                "FROM vente v " +
                "INNER JOIN lieu l ON v.lieu_id = l.id"
            );
            resultatRequete = requeteSql.executeQuery();
            while (resultatRequete.next()) {
                Vente v = new Vente();
                v.setId(resultatRequete.getInt("v_id"));
                v.setNom(resultatRequete.getString("v_nom"));
                Lieu l = new Lieu();
                l.setId(resultatRequete.getInt("l_id"));
                l.setVille(resultatRequete.getString("l_ville"));
                l.setNbBoxes(resultatRequete.getInt("l_nbBoxes"));
                l.setCommentaires(resultatRequete.getString("l_commentaires"));
                v.setLieu(l);
                lesVentes.add(v);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getLesVentes a généré une exception SQL");
        }
        return lesVentes;
    }
        /**
     * Récupère un vente spécifique par son identifiant
     * @param cnx La connexion active à la base de données
     * @param id L'identifiant du vente recherché
     * @return Vente Le vente trouvé ou null si non trouvé
     */
    public static Vente getUneVente(Connection cnx, int idVente) {
        Vente vente = null;
        try {
            requeteSql = cnx.prepareStatement(
                "SELECT v.id AS v_id, v.nom AS v_nom, v.dateDebutVente AS v_dateDebutVente, " +
                "lieu.id AS lieu_id, lieu.ville AS lieu_ville, " +
                "l.id AS l_id, l.prixDepart AS l_prixDepart, " +
                "c.id AS cheval_id, c.nom AS cheval_nom " +
                "FROM vente v " +
                "INNER JOIN lieu lieu ON v.lieu_id = lieu.id " +
                "INNER JOIN lot l ON l.vente_id = v.id " +
                "INNER JOIN cheval c ON c.lot_id = l.id " +
                "WHERE v.id = ?"
            );
            requeteSql.setInt(1, idVente);
            resultatRequete = requeteSql.executeQuery();
            if (resultatRequete.next()) {
                vente = new Vente();
                vente.setId(resultatRequete.getInt("v_id"));
                vente.setNom(resultatRequete.getString("v_nom"));
                java.sql.Date sqlDate = resultatRequete.getDate("v_dateDebutVente");
                vente.setDateDebutVente(sqlDate != null ? sqlDate.toLocalDate() : null);
                
                Lieu lieu = new Lieu();
                lieu.setId(resultatRequete.getInt("lieu_id"));
                lieu.setVille(resultatRequete.getString("lieu_ville"));
                vente.setLieu(lieu);
                
                Lot lot = new Lot();
                lot.setId(resultatRequete.getInt("l_id"));
                lot.setPrixDepart(resultatRequete.getInt("l_prixDepart"));
                vente.getLesLots();
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getUneVente a généré une exception SQL");
        }
        return vente;
    }
    
}
