package grille;

import divers.MyException;
import java.awt.Point;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 * @see Case
 */
public class Grille
{

    /**
     * Constante : nombre de lignes d'une partie facile
     */
    public static final int DEF_NB_LIGNES_FACILE = 5;
    /**
     * Constante : nombre de colonnes d'une partie facile
     */
    public static final int DEF_NB_COLONNES_FACILE = 5;
    /**
     * Constante : nombre de mines d'une partie facile
     */
    public static final int DEF_NB_MINES_FACILE = 10;
    /**
     * Constante : nombre de lignes d'une partie moyenne
     */
    public static final int DEF_NB_LIGNES_MOYEN = 10;
    /**
     * Constante : nombre de colonnes d'une partie moyen
     */
    public static final int DEF_NB_COLONNES_MOYEN = 10;
    /**
     * Constante : nombre de mines d'une partie moyen
     */
    public static final int DEF_NB_MINES_MOYEN = 25;
    /**
     * Constante : nombre de lignes d'une partie difficile
     */
    public static final int DEF_NB_LIGNES_DIFFICILE = 20;
    /**
     * Constante : nombre de colonnes d'une partie difficile
     */
    public static final int DEF_NB_COLONNES_DIFFICILE = 20;
    /**
     * Constante : nombre de mines d'une partie facile
     */
    public static final int DEF_NB_MINES_DIFFICILE = 150;
    /**
     * Tableau de Case constituant le principal composant du jeu.
     */
    private Case[][] _grille;
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
    /**
     * Nombre de drapeaux posés sur la grille.
     */
    private int _nbDrapeaux = 0;

    /**
     * Constructeur avec paramètres.
     * @param nombre de lignes
     * @param nombre de colonnes
     * @param nombre de mines
     */
    public Grille(int nbLignes, int nbColonnes, int nbMines)
    {
        try
        {
            if (nbLignes <= 0)
            {
                throw new MyException("Erreur : nombre de lignes négatif ou nul.");
            } else
            {
                this._nbColonnes = nbColonnes;
            }
            if (nbColonnes <= 0)
            {
                throw new MyException("Erreur : nombre de colonnes négatif ou nul.");
            } else
            {
                this._nbLignes = nbLignes;
            }
            if (nbMines <= 0)
            {
                throw new MyException("Erreur : nombre de mines négatif ou nul.");
            } else if (nbMines > nbLignes * nbColonnes)
            {
                throw new MyException("Erreur : plus de mines que de cases.");
            }
            this._nbMines = nbMines;
            this._grille = new Case[_nbLignes][_nbColonnes];
        } catch (MyException e)
        {
            e.show_erreur("Création d'une grille normale.");
            this._nbLignes = Grille.DEF_NB_LIGNES_FACILE;
            this._nbColonnes = Grille.DEF_NB_COLONNES_FACILE;
            this._nbMines = Grille.DEF_NB_MINES_FACILE;
            this._grille = new Case[_nbColonnes][_nbLignes];
        }
    }

    /**
     * Méthode permettant de remplir la grille de cases en plaçant aléatoirement les n mines.
     */
    public void initialiser()
    {
        Random r = new Random();
        Vector<Point> indexMines = new Vector<Point>();
        int x, y;
        // tirage aléatoire sans remise de _nbMines chiffres qui seront les index des cases minées
        for (int i = 0; i < this._nbMines; i++)
        {
            Point pt;
            do
            {
                pt = new Point(r.nextInt(this._nbLignes) , r.nextInt(this._nbColonnes) );
            } while (indexMines.indexOf(pt) != -1);
            indexMines.addElement(pt);
            //System.out.println(indexMines.get(i));
        }
        //initialisation des cases
        for (int i = 0; i < this._nbLignes; i++)
        {
            for (int j = 0; j < this._nbColonnes; j++)
            if (indexMines.indexOf(new Point(i, j)) != -1) // si l'indice est dans indiceMines
            {
                this._grille[i][j] = new Case(true); // ajout d'une case minée
            } else
            {
                this._grille[i][j] = new Case(false); // ajout d' une case autre.
            }
        }
    }

    /**
     * Méthode permettant de connaitre le nombre de cases de la grille
     * @return nombre de cases de la grille (lignes * colonnes)
     */
    public int nbCases()
    {
        return (this._nbLignes * this._nbColonnes);
    }

    /**
     * Méthode de connaitre le nombre de drapeaux posées sur la grille.
     * @return
     */
    public int get_nbDrapeaux()
    {
        return this._nbDrapeaux;
    }

    public void addDrapeau(int x, int y)
    {
        if (this._grille[x][y].get_drapeau() == true)
        {
            this._grille[x][y].set_drapeau(false);
            this._nbDrapeaux--;
        } else
        {
            this._grille[x][y].set_drapeau(true);
            this._nbDrapeaux++;
        }
    }

    /**
     * Méthode permettant l'affichage formaté dans un terminal.
     * @return chaine de caractère formatée décrivant la grille.
     */
    @Override
    public String toString()
    {
        String grille = "";
        for (int i = 0; i < this._nbLignes; i++)
        {
            for (int j = 0; j < this._nbColonnes; j++)
                grille += "" + this._grille[i][j] + "\t";
            grille += "\n";
        }
        
        return grille;
    }

    public static void main(String[] args)
    {
        Grille g = new Grille(3, 3, 3);
        g.initialiser();

        // test des exceptions.
//        Grille g2 = new Grille(0, 3, 3);
//        Grille g3 = new Grille(3, 0, 3);
//        Grille g4 = new Grille(3, 3, 10);
//        Grille g5 = new Grille(3, 3, 0);
        System.out.println(g);
    }
}
