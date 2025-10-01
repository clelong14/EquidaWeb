-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3307
-- Généré le : mer. 01 oct. 2025 à 09:57
-- Version du serveur : 11.3.2-MariaDB
-- Version de PHP : 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `equida`
--

-- --------------------------------------------------------

--
-- Structure de la table `categvente`
--

DROP TABLE IF EXISTS `categvente`;
CREATE TABLE IF NOT EXISTS `categvente` (
  `code` varchar(10) NOT NULL,
  `libelle` varchar(100) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `categvente`
--

INSERT INTO `categvente` (`code`, `libelle`) VALUES
('C01', 'Vente aux enchères'),
('C02', 'Vente de gré à gré');

-- --------------------------------------------------------

--
-- Structure de la table `cheval`
--

DROP TABLE IF EXISTS `cheval`;
CREATE TABLE IF NOT EXISTS `cheval` (
  `id` int(11) NOT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `race_id` int(11) DEFAULT NULL,
  `code_sire` varchar(50) DEFAULT NULL,
  `taille` int(11) DEFAULT NULL,
  `poids` decimal(5,2) DEFAULT NULL,
  `robe_id` int(11) DEFAULT NULL,
  `pere_id` int(11) DEFAULT NULL,
  `mere_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_race` (`race_id`) USING BTREE,
  KEY `FK_robe` (`robe_id`),
  KEY `FK_pere` (`pere_id`),
  KEY `FK_mere` (`mere_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `cheval`
--

INSERT INTO `cheval` (`id`, `nom`, `date_naissance`, `race_id`, `code_sire`, `taille`, `poids`, `robe_id`, `pere_id`, `mere_id`) VALUES
(1, 'Eclipse', '2017-03-12', 4, '0808.001.001Z', 168, 520.00, 1, 5, 13),
(2, 'Aztec', '2019-07-04', 4, '0808.002.002Z', 170, 540.00, 4, 11, 14),
(3, 'Orion', '2015-05-23', 5, '0808.003.003Z', 165, 580.00, 5, 12, 10),
(4, 'Tempête de Feu', '2017-03-12', 1, '0808.004.004Z', 162, 510.00, 3, 8, 2),
(5, 'Éclair Noir', '2019-07-04', 2, '0808.005.005Z', 172, 530.00, 6, 12, 15),
(6, 'Vent du Nord', '2015-05-23', 3, '0808.006.006Z', 168, 560.00, 1, 6, 5),
(7, 'Comète', '2018-01-01', 4, '0808.007.007Z', 169, 590.00, 5, 9, 3),
(8, 'Silver Snow', '2020-11-17', 5, '0808.008.008Z', 167, 550.00, 5, 7, 12),
(9, 'Caramel', '2016-06-30', 6, '0808.009.009Z', 164, 500.00, 2, 8, 2),
(10, 'Storm', '2021-10-10', 1, '0808.010.010Z', 166, 505.00, 2, 1, 14),
(11, 'Mustang', '2014-08-03', 2, '0808.011.011Z', 174, 575.00, 4, 6, 9),
(12, 'Rising Sun', '2019-04-22', 3, '0808.012.012Z', 161, 515.00, 1, 7, 3),
(13, 'Phantom', '2016-12-05', 4, '0808.013.013Z', 173, 595.00, 6, 4, 13),
(14, 'Pompon', '2025-07-13', 2, '0808.014.014Z', 169, 525.00, 3, 4, 13),
(15, 'Fleur du désert', '2023-06-30', 6, '0808.015.015Z', 171, 585.00, 1, 1, 13);

-- --------------------------------------------------------

--
-- Structure de la table `cheval_course`
--

DROP TABLE IF EXISTS `cheval_course`;
CREATE TABLE IF NOT EXISTS `cheval_course` (
  `cheval_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `position` int(11) DEFAULT NULL,
  `temps` varchar(50) NOT NULL,
  PRIMARY KEY (`cheval_id`,`course_id`),
  UNIQUE KEY `fk_cheval` (`cheval_id`),
  KEY `fk_course` (`course_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `cheval_course`
--

INSERT INTO `cheval_course` (`cheval_id`, `course_id`, `position`, `temps`) VALUES
(1, 1, 2, '1:45.32'),
(2, 1, 1, '1:44.87'),
(3, 2, 3, '1:50.10'),
(4, 2, 2, '1:49.50'),
(5, 3, 1, '1:46.75'),
(6, 3, 2, '1:47.20'),
(7, 4, 1, '1:42.90'),
(8, 4, 3, '1:43.50'),
(9, 5, 2, '1:55.12'),
(10, 5, 1, '1:54.60');

-- --------------------------------------------------------

--
-- Structure de la table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  `ville` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `course`
--

INSERT INTO `course` (`id`, `nom`, `ville`) VALUES
(1, 'Grand Prix', 'Paris'),
(2, 'Derby', 'Lyon'),
(3, 'Prix de l\'Étoile', 'Marseille'),
(4, 'Coupe des Champions', 'Nice'),
(5, 'Trophée du Vent', 'Bordeaux');

-- --------------------------------------------------------

--
-- Structure de la table `lieu`
--

DROP TABLE IF EXISTS `lieu`;
CREATE TABLE IF NOT EXISTS `lieu` (
  `id` int(11) NOT NULL,
  `ville` varchar(100) NOT NULL,
  `nbBoxes` int(11) DEFAULT NULL,
  `commentaires` text DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `lieu`
--

INSERT INTO `lieu` (`id`, `ville`, `nbBoxes`, `commentaires`) VALUES
(1, 'Deauville', 120, 'Haras réputé, installations modernes'),
(2, 'Chantilly', 80, 'Centre d’entraînement historique');

-- --------------------------------------------------------

--
-- Structure de la table `lot`
--

DROP TABLE IF EXISTS `lot`;
CREATE TABLE IF NOT EXISTS `lot` (
  `id` int(11) NOT NULL,
  `prixDepart` decimal(12,2) NOT NULL,
  `vente_id` int(11) NOT NULL,
  `cheval_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_cheval` (`cheval_id`) USING BTREE,
  KEY `fk_vente` (`vente_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `lot`
--

INSERT INTO `lot` (`id`, `prixDepart`, `vente_id`, `cheval_id`) VALUES
(1001, 25000.00, 1, 1),
(1002, 18000.00, 1, 2),
(1003, 30000.00, 2, 3);

-- --------------------------------------------------------

--
-- Structure de la table `race`
--

DROP TABLE IF EXISTS `race`;
CREATE TABLE IF NOT EXISTS `race` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `race`
--

INSERT INTO `race` (`id`, `nom`) VALUES
(1, 'Pur-sang anglais'),
(2, 'Quarter Horse'),
(3, 'Frison'),
(4, 'Andalou'),
(5, 'Lipizzan'),
(6, 'Mustang');

-- --------------------------------------------------------

--
-- Structure de la table `robe`
--

DROP TABLE IF EXISTS `robe`;
CREATE TABLE IF NOT EXISTS `robe` (
  `id` int(11) NOT NULL,
  `libelle` varchar(50) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `robe`
--

INSERT INTO `robe` (`id`, `libelle`, `description`) VALUES
(1, 'Alezan', 'poil roux, crins souvent de la même teinte'),
(2, 'Bai', 'corps brun avec crins, extrémités et bout du nez noirs'),
(3, 'Noir', 'entièrement noir'),
(4, 'Gris', 'mélange de poils blancs et foncés, s’éclaircissant avec l’âge'),
(5, 'Isabelle', 'poil jaune/sable, crins noirs'),
(6, 'Pie', 'grandes taches blanches et colorées');

-- --------------------------------------------------------

--
-- Structure de la table `vente`
--

DROP TABLE IF EXISTS `vente`;
CREATE TABLE IF NOT EXISTS `vente` (
  `id` int(11) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `dateDebutVente` date NOT NULL,
  `categ_code` varchar(10) NOT NULL,
  `lieu_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `categ_code` (`categ_code`),
  KEY `lieu_id` (`lieu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Déchargement des données de la table `vente`
--

INSERT INTO `vente` (`id`, `nom`, `dateDebutVente`, `categ_code`, `lieu_id`) VALUES
(1, 'Vente de poulinières printemps', '2024-05-25', 'C01', 1),
(2, 'Vente de yearlings été', '2024-06-15', 'C02', 2);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `cheval`
--
ALTER TABLE `cheval`
  ADD CONSTRAINT `FK_mere` FOREIGN KEY (`mere_id`) REFERENCES `cheval` (`id`),
  ADD CONSTRAINT `FK_pere` FOREIGN KEY (`pere_id`) REFERENCES `cheval` (`id`),
  ADD CONSTRAINT `FK_robe` FOREIGN KEY (`robe_id`) REFERENCES `robe` (`id`),
  ADD CONSTRAINT `fk_race` FOREIGN KEY (`race_id`) REFERENCES `race` (`id`);

--
-- Contraintes pour la table `cheval_course`
--
ALTER TABLE `cheval_course`
  ADD CONSTRAINT `fk_cheval_course` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
  ADD CONSTRAINT `fk_course` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`),
  ADD CONSTRAINT `fk_course_cheval` FOREIGN KEY (`cheval_id`) REFERENCES `cheval` (`id`);

--
-- Contraintes pour la table `lot`
--
ALTER TABLE `lot`
  ADD CONSTRAINT `lot_ibfk_1` FOREIGN KEY (`vente_id`) REFERENCES `vente` (`id`),
  ADD CONSTRAINT `lot_ibfk_2` FOREIGN KEY (`cheval_id`) REFERENCES `cheval` (`id`);

--
-- Contraintes pour la table `vente`
--
ALTER TABLE `vente`
  ADD CONSTRAINT `vente_ibfk_1` FOREIGN KEY (`categ_code`) REFERENCES `categvente` (`code`),
  ADD CONSTRAINT `vente_ibfk_2` FOREIGN KEY (`lieu_id`) REFERENCES `lieu` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
