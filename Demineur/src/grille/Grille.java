package grille;

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
        this._nbColonnes = nbColonnes;
        this._nbLignes = nbLignes;
        this._nbMines = nbMines;
        this._grille = new Vector(0, _nbLignes * _nbColonnes);
        this.initialiser();
    }

    private void initialiser()
    {
        Random r = new Random();
        Vector<Integer> indexMines = new Vector<Integer>();
        int nb;
        // tirage aléatoire de _nbMines chiffres qui seront les indexs des cases minées
        for (int i = 0; i < _nbMines; i++)
        {
            do
            {
               // tirage sans remise
               nb =  r.nextInt(this.length())+1;
            }
            while (indexMines.indexOf(nb) != -1);
            indexMines.addElement(nb);
            System.out.println(indexMines.get(i));
        }

        //initialisation
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
        for (int i = 0; i < this.length();i++)
        {
            if (i % _nbColonnes == 0)
                grille += "\n";
            grille += ""+_grille.get(i)+"\t";
        }
        return grille;
    }

    public static void main(String [] args)
    {
        Grille g = new Grille(3, 3, 3);
        System.out.println(g);
    }
}
