package demineur.menu;

import grille.Grille;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public interface interfaceDemineurMenu
{
    /**
     * Méthode permettant de lancer une nouvelle Partie avec la Grille choisie.
     * @param grille choisie (par défaut en facile)
     */
    public void nouvellePartie(Grille g);
    /**
     * Méthode permettant de choisir un nveau de difficulté.
     * @param difficulté choisie : 0 = personalisée, 1 = facile, 2 = moyen, 3 = difficile
     */
    public void choixNiveau(int niveau);
    /**
     * Méthode permettant d'appeler la fenêtre de choix des dimensions de la Grille (pour un partie personalisée).
     */
    public void choisirDimensions();
    /**
     * Méthode permettant de quitter l'application.
     */
    public void quitter();
}
