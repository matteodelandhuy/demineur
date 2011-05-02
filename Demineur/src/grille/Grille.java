package grille;

import divers.MyException;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Maxime GASTON
 */
public class Grille
{

    /**
     * Tableau de Case constituant le principal composant du jeu.
     */
    private Vector<Case> _grille;
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

    //
    //
    //  Vérifier que _nbMines < _nbLignes* _nbColonnes
    //  Vérifier positivité
    //
    //
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
            this._grille = new Vector(0, _nbLignes * _nbColonnes);
            this.initialiser();
        } catch (MyException e)
        {
            System.out.println(e.get_messageErreur());
        }
    }

    private void initialiser()
    {
        Random r = new Random();
        Vector<Integer> indexMines = new Vector<Integer>();
        int nb;
        // tirage aléatoire sans remise de _nbMines chiffres qui seront les indexs des cases minées
        for (int i = 0; i < _nbMines; i++)
        {
            do
            {
                nb = r.nextInt(this.length()) + 1;
            } while (indexMines.indexOf(nb) != -1);
            indexMines.addElement(nb);
            //System.out.println(indexMines.get(i));
        }
        //initialisation des cases
        for (int i = 1; i <= this.length(); i++)
        {
            if (indexMines.indexOf(i) != -1) // si l'indice est dans indiceMines
            {
                _grille.addElement(new Case(true)); // ajout d'une case minée
            } else
            {
                _grille.addElement(new Case(false)); // ajout d' une case autre.
            }
        }
    }

    public int length()
    {
        return (_nbLignes * _nbColonnes);
    }

    @Override
    public String toString()
    {
        String grille = "";
        for (int i = 0; i < this.length(); i++)
        {
            if (i % _nbColonnes == 0)
            {
                grille += "\n";
            }
            grille += "" + _grille.get(i) + "\t";
        }
        return grille;
    }

    public static void main(String[] args)
    {
        Grille g = new Grille(3, 3, 3);
        System.out.println(g);
        Grille g2 = new Grille(0, 3, 3);
        Grille g3 = new Grille(3, 0, 3);
        Grille g4 = new Grille(3, 3, 10);
        Grille g5 = new Grille(3, 3, 0);
    }
}
