# TP4 MAVEN
cibles mvn commande : 
- `mvn --version` : Afficher la version courant de maven
- `mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart` : creer un projet maven
- `mvn archetype:generate -DgroupId=fr.univ_orleans.iut45.mud -DartifactId=mud -DinteractiveMode=false` : Initialisation maven avec un package précis
- `mvn clean`` : supprime tous les ficher temporaire ex `<target>`
- `mvn compile` : compile tous les ficher java
- `mvn test`  : lance le projet et le test (en le compilant)
- `mvn package` : compile tous les fichier java + App.java en un fichier executable jar (compil --> test --> jar)
- `mvn exec:java`: même commande mais exec le jar en plus`


# Note : 
Ne pas oublier de rajoueter les ligne package java, ex : `package fr.univ_orleans.iut45.mud;` 

# Dependence : 
Ne pas oublier les dépendences pour les lib + les propriétes apres: 

