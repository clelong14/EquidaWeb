package database;

import model.Cheval;
import model.Race;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Lot;

public class DaoCheval {
    Connection cnx;
    static PreparedStatement requeteSql = null;
    static ResultSet resultatRequete = null;

    /**
     * Récupère tous les chevaux présents dans la base de données avec leuresultatRequete races associées
     * @param cnx La connexion active à la base de données
     * @return ArrayList<Cheval> La liste de tous les chevaux trouvés
     */
    public static ArrayList<Cheval> getLesChevaux(Connection cnx) {
        ArrayList<Cheval> lesChevaux = new ArrayList<Cheval>();
        try {
            requeteSql = cnx.prepareStatement(
                "SELECT c.id as c_id, c.nom as c_nom," +
                "r.id as r_id, r.nom as r_nom " +
                "FROM cheval c " +
                "INNER JOIN race r ON c.race_id = r.id"
            );
            resultatRequete = requeteSql.executeQuery();
            while (resultatRequete.next()) {
                Cheval c = new Cheval();
                c.setId(resultatRequete.getInt("c_id"));
                c.setNom(resultatRequete.getString("c_nom"));
                Race r = new Race();
                r.setId(resultatRequete.getInt("r_id"));
                r.setNom(resultatRequete.getString("r_nom"));
                c.setRace(r);
                lesChevaux.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getLesChevaux a généré une exception SQL");
        }
        return lesChevaux;
    }

    /**
     * Récupère un cheval spécifique par son identifiant
     * @param cnx La connexion active à la base de données
     * @param id L'identifiant du cheval recherché
     * @return Cheval Le cheval trouvé ou null si non trouvé
     */
    public static Cheval getLeCheval(Connection cnx, int idCheval) {
    Cheval cheval = null;
    try {
        requeteSql = cnx.prepareStatement(
               
            "SELECT c.id as c_id, c.nom as c_nom, c.date_naissance as c_dateNaissance, c.code_sire as c_codeSire, c.taille as c_taille, c.poids as c_poids, " +
                "r.id as r_id, r.nom as r_nom, " +
                "p.id AS p_id, p.nom AS p_nom, " +
                "m.id AS m_id, m.nom AS m_nom " +
                "FROM cheval c " +
                "INNER JOIN race r ON c.race_id = r.id " +
                "LEFT JOIN cheval p ON c.pere_id = p.id " +
                "LEFT JOIN cheval m ON c.mere_id = m.id " +
                "WHERE c.id = ?;"
        );
        requeteSql.setInt(1, idCheval);
        resultatRequete = requeteSql.executeQuery();
        
        if (resultatRequete.next()) {
            cheval = new Cheval();
            cheval.setId(resultatRequete.getInt("c_id"));
            cheval.setNom(resultatRequete.getString("c_nom"));
            java.sql.Date sqlDate = resultatRequete.getDate("c_dateNaissance");
            cheval.setDateNaissance(sqlDate != null ? sqlDate.toLocalDate() : null);
            cheval.setCodeSire(resultatRequete.getString("c_codeSire"));
            cheval.setTaille(resultatRequete.getInt("c_taille"));
            cheval.setPoids(resultatRequete.getFloat("c_poids"));
            
            // Père
            int idPere = resultatRequete.getInt("p_id");
            if (idPere != 0) {
                Cheval p = new Cheval();
                p.setId(idPere);
                p.setNom(resultatRequete.getString("p_nom"));
                cheval.setPere(p);
            }

            // Mère
            int idMere = resultatRequete.getInt("m_id");
            if (idMere != 0) {
                Cheval m = new Cheval();
                m.setId(idMere);
                m.setNom(resultatRequete.getString("m_nom"));
                cheval.setMere(m);
            }
            
            Race race = new Race();
            race.setId(resultatRequete.getInt("r_id"));
            race.setNom(resultatRequete.getString("r_nom"));
            cheval.setRace(race);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("La requête de getLeCheval a généré une exception SQL");
    }
    return cheval;
}

    /**
     * Ajoute un nouveau cheval dans la base de données
     * @param cnx La connexion active à la base de données
     * @param cheval Le cheval à ajouter
     * @return boolean true si l'ajout a réussi, false sinon
     */
    public static boolean ajouterCheval(Connection cnx, Cheval cheval) {
        try {
            requeteSql = cnx.prepareStatement(
                "INSERT INTO cheval (nom, date_naissance, race_id) VALUES (?, ?, ?)",
                PreparedStatement.RETURN_GENERATED_KEYS
            );
            requeteSql.setString(1, cheval.getNom());

            // Gestion de la date de naissance
            if (cheval.getDateNaissance() != null) {
                requeteSql.setDate(2, java.sql.Date.valueOf(cheval.getDateNaissance()));
            } else {
                requeteSql.setNull(2, java.sql.Types.DATE);
            }

            requeteSql.setInt(3, cheval.getRace().getId());

            int result = requeteSql.executeUpdate();

            if (result == 1) {
                // Récupération de l'id auto-généré
                ResultSet resultatRequete = requeteSql.getGeneratedKeys();
                if (resultatRequete.next()) {
                    cheval.setId(resultatRequete.getInt(1));
                }
                return true;
            }
            return false;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de l'ajout du cheval");
            return false;
        }
    }
        
//    public static Cheval getChevalParents(Connection cnx, int idCheval) {
//        Cheval cheval = null;
//        try {
//            requeteSql = cnx.prepareStatement(
//                "SELECT c.id AS c_id, c.nom AS c_nom, " +
//                "p.id AS p_id, p.nom AS p_nom, " +
//                "m.id AS m_id, m.nom AS m_nom, " +
//                "FROM cheval c " +
//                "LEFT JOIN cheval p ON c.pere_id = p.id " +
//                "LEFT JOIN cheval m ON c.mere_id = m.id " +
//                "WHERE c.id = ?;"
//            );
//            requeteSql.setInt(1, idCheval);
//            resultatRequete = requeteSql.executeQuery();
//            if (resultatRequete.next()) {
//                cheval = new Cheval();
//                cheval.setId(resultatRequete.getInt("c_id"));
//                cheval.setNom(resultatRequete.getString("c_nom"));
//
//                // Père
//                int idPere = resultatRequete.getInt("p_id");
//                if (idPere != 0) {
//                    Cheval p = new Cheval();
//                    p.setId(idPere);
//                    p.setNom(resultatRequete.getString("p_nom"));
//                    cheval.setPere(p);
//                }
//
//                // Mère
//                int idMere = resultatRequete.getInt("m_id");
//                if (idMere != 0) {
//                    Cheval m = new Cheval();
//                    m.setId(idMere);
//                    m.setNom(resultatRequete.getString("m_nom"));
//                    cheval.setPere(m);
//                }
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("La requête de getLeChevalAvecParents a généré une exception SQL");
//        }
//        return cheval;
//    }


}