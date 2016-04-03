nom des binômes :
AMRI Sara
CHARLES GNANESWARAN Gabriel 
GHANEMI Mehdi

La commande pour lancer le Tetris est "mvn clean install && java -jar *.jar"
Pour ce projet, nous avons décidé de faire un modèle Modèle Vue Controlleur.
Chaque Class permet de faire une chose. Nous avons une classe qui permet des pièces, une classe qui permet de contruire la grille et contenir les pièces.
Ces deux classes réunies forment notre Modèles.
Une classe Affichage qui sera notre fonction Vue, une classe pour l les fonctions events et une class main nous servirons de contrôleur (fera tourner le jeu). 
Le programme est codé de manière a ce que les parties principales soit indépendantes. Par exemple la Partie Affichage attends une grille quelquonque en int [][] pour afficher son contenu ou même suprimer la class affichage pour en faire une en partie graphique. Les Classes sont extensibles. La taille du tableau et donc du Tetris et d'autre paramètres son définie en haut pour pouvoir modifier facilement le code sans tout recommencer. 
Pour jouer à noter Tetris, il faut