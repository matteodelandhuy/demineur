package demineur.menu;

import divers.MyException;
import grille.Grille;
import partie.Partie;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public interface interfaceDemineurMenu
{
    /**
     * Méthode permettant de lancer une nouvelle Partie avec la Grille choisie.
     * @param grille choisie (par défaut en facile)
     * @return nouvelle partie
     */
    public Partie nouvellePartie(Grille g);
    /**
     * Méthode permettant de choisir un nveau de difficulté.
     * @param difficulté choisie : 1 = facile, 2 = moyen, 3 = difficile
     * @throws erreur de type MyException si le niveau n'est pas 1, 2 ou 3.
     */
    public Grille choixNiveau(int niveau) throws MyException;
    /**
     * Méthode permettant d'appeler la fenêtre de choix des dimensions de la Grille (pour un partie personalisée).
     * @return  grille correspondant au niveau choisi.
     */
    public Grille choisirDimensions();
    /**
     * Méthode permettant de quitter l'application.
     */
    public void quitter();
}
