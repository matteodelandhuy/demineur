package grille;

import java.util.Vector;


/**
 *
 * @author Maxime GASTON
 */
public class Grille
{
    /**
     * Tableau de Case à deux dimensions constituant le principal composant du jeu.
     */
    private Vector<Case>[][] _grille;
    /**
     * Nombre de lignes de la grille.
     */
    private int _nbLignes;
    /**
     * Nombre de colonnes de la grille.
     */
    private int _nbColonnes;
    /**
     * Nombre de mines de la grille.
     */
    private int _nbMines;
}
