# EquidaWeb

Application web Java pour la gestion équestre.

## Description

EquidaWeb est une application web développée en Java, conçue pour faciliter la gestion des activités équestres. Le projet utilise Maven comme gestionnaire de dépendances et suit une architecture Java EE moderne.

## Technologies utilisées

### Backend
- **Java** (99.7%)
- **HTML** (0.3%)
- Maven (gestionnaire de build)
- Java EE / Jakarta EE (présumé)
- NetBeans (IDE de développement)

## Structure du projet

```
EquidaWeb/
├── src/main/           # Code source principal
│   ├── java/          # Classes Java
│   └── webapp/        # Ressources web (HTML, CSS, JS)
├── pom.xml            # Configuration Maven
├── nb-configuration.xml   # Configuration NetBeans
└── .gitignore         # Fichiers exclus du versioning
```

## Installation

### Prérequis

- Java JDK 8 ou supérieur
- Maven 3.6+
- Apache Tomcat / WildFly / GlassFish (ou autre serveur d'applications Java EE)
- NetBeans IDE (recommandé) ou tout autre IDE Java

### Étapes d'installation

1. **Cloner le repository**
   ```bash
   git clone https://github.com/clelong14/EquidaWeb.git
   cd EquidaWeb
   ```

2. **Installer les dépendances Maven**
   ```bash
   mvn clean install
   ```

3. **Configurer la base de données**
   - Créer une base de données MySQL/PostgreSQL
   - Mettre à jour les paramètres de connexion dans le fichier de configuration

4. **Déployer l'application**
   
   Option 1 - Avec Maven :
   ```bash
   mvn package
   # Déployer le fichier .war généré dans le dossier target/
   ```
   
   Option 2 - Avec NetBeans :
   - Ouvrir le projet dans NetBeans
   - Clic droit sur le projet → Run
   - Le serveur se lancera automatiquement

## Configuration

### Base de données

Modifier le fichier de configuration pour adapter les paramètres de connexion :

```properties
# Exemple de configuration
db.url=jdbc:mysql://localhost:3306/equidaweb
db.username=your_username
db.password=your_password
```

### Serveur d'applications

L'application est compatible avec :
- Apache Tomcat 9+
- WildFly 20+
- GlassFish 5+
- Payara Server

## Utilisation

Une fois l'application déployée :

1. Accéder à l'application via `http://localhost:8080/EquidaWeb`
2. Se connecter avec les identifiants administrateur
3. Commencer à gérer les données équestres

## Build du projet

### Compilation
```bash
mvn compile
```

### Package (création du WAR)
```bash
mvn package
```

### Nettoyage
```bash
mvn clean
```

### Exécution des tests
```bash
mvn test
```

## Tests

Pour exécuter les tests unitaires :

```bash
mvn test
```

Pour exécuter les tests d'intégration :

```bash
mvn verify
```

## Déploiement

### Production

1. Créer le package de production :
   ```bash
   mvn clean package -Pprod
   ```

2. Déployer le fichier `target/EquidaWeb.war` sur votre serveur d'applications

### Avec Docker (optionnel)

```dockerfile
# Exemple de Dockerfile
FROM tomcat:9-jdk11
COPY target/EquidaWeb.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
```

## Contribution

Les contributions sont les bienvenues ! Pour contribuer :

1. Fork le projet
2. Créer une branche pour votre fonctionnalité (`git checkout -b feature/NouvelleFonctionnalite`)
3. Commit vos changements (`git commit -m 'Ajout de NouvelleFonctionnalite'`)
4. Push vers la branche (`git push origin feature/NouvelleFonctionnalite`)
5. Ouvrir une Pull Request

### Standards de code

- Suivre les conventions de nommage Java
- Commenter le code complexe
- Écrire des tests unitaires pour les nouvelles fonctionnalités
- Respecter l'architecture MVC du projet

## Documentation

La documentation complète du projet est disponible dans le dossier `/docs` (à créer si nécessaire).

## Signaler un bug

Si vous trouvez un bug, veuillez ouvrir une issue sur GitHub avec :
- Une description claire du problème
- Les étapes pour reproduire le bug
- Le comportement attendu vs observé
- Votre environnement (OS, version Java, serveur d'applications)

## Licence

Ce projet est sous licence [à définir].

## Auteurs

- **clelong14** - *Développeur principal* - [Profil GitHub](https://github.com/clelong14)

## Remerciements

- Merci à tous les contributeurs du projet
- Communauté Java EE / Jakarta EE

## Contact

Pour toute question ou suggestion :
- Ouvrir une issue sur GitHub
- Contacter via le profil GitHub

## Liens utiles

- [Documentation Java EE](https://jakarta.ee/)
- [Maven Documentation](https://maven.apache.org/guides/)
- [NetBeans IDE](https://netbeans.apache.org/)
- [Apache Tomcat](https://tomcat.apache.org/)

---

*Dernière mise à jour : Février 2026*
*16 commits - 1 star*
