package demineur.partie;

import grille.Grille;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 * @see Grille
 */
public class Partie
{

    /**
     * Le temps écoulé lors de la partie en cours.
     */
    private int _temps = 0;
    /**
     * Attribut permettant de savoir si la partie est gagnée.
     */
    private boolean _gagnee = false;
    /**
     * La grille choisie pour la partie en cours.
     */
    private Grille _grille;

    /**
     * Constructeur par défaut : il prend les valeurs par défaut et ne prends pas de grille.
     */
    public Partie()
    {
    }

    /**
     * Constructeur prenant une grille en paramètre.
     * @param grille choisie pour la partie.
     */
    public Partie(Grille grille)
    {
        this._grille = grille;
        this._gagnee = false;
        this._temps = 0;
    }

    /**
     * Méthode permettant de savoir si la partie est gagnée.
     * Cette méthode doit être éxecutée après chaque action de l'utilisateur sur la grille.
     * @return true si la partie est gagnée, false sinon.
     */
    public boolean partieGagnee()
    {
        if (_gagnee == true)
        {
            return true;
        } else
        {
            return false;
        }
    }

    /**
     * Méthode permettant de définir une grille pour cette partie.
     * @param grille de la partie.
     */
    public void set_grille(Grille g)
    {
        this._grille = g;
    }

    /**
     * Méthode permettant d'incrémenter le temps de la partie.
     * Méthode à éxecuter toute les secondes.
     */
    public void incrementerTemps()
    {
        this._temps++;
    }
}
