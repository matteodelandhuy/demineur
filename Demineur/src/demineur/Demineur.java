/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur;

import demineur.tools.MyException;
/**
 *
 * @author alexis
 */
public abstract class Demineur implements Commandes {
     /**
     * Constante : nombre correspondant au niveau facile
     */
    public static final int NIVEAU_FACILE = 1;
    /**
     * Constante : nombre correspondant au niveau moyen
     */
    public static final int NIVEAU_MOYEN = 2;
    /**
     * Constante : nombre correspondant au niveau difficile
     */
    public static final int NIVEAU_DIFFICILE = 3;

    /**
     * Constante : nombre correspondant au niveau personnalisé
     */

    protected Grille _grille;
    protected DemineurApp _application;
    protected Partie _partie;

    public Demineur(int nbLignes, int nbColonnes, int nbMines)throws MyException{
        _grille = new Grille(this,nbLignes,nbColonnes,nbMines);
        _grille.initialiser();

        _partie = new Partie(this);
    }

    public Demineur(int niveau) throws MyException {
        int nbLignes,nbColonnes,nbMines;
        switch(niveau){
            case NIVEAU_MOYEN:
                nbLignes = Grille.DEF_NB_LIGNES_MOYEN;
                nbColonnes = Grille.DEF_NB_COLONNES_MOYEN;
                nbMines = Grille.DEF_NB_MINES_MOYEN;
                break;
            case NIVEAU_DIFFICILE:
                nbLignes = Grille.DEF_NB_LIGNES_DIFFICILE;
                nbColonnes = Grille.DEF_NB_COLONNES_DIFFICILE;
                nbMines = Grille.DEF_NB_MINES_DIFFICILE;
                break;
            default:
                nbLignes = Grille.DEF_NB_LIGNES_FACILE;
                nbColonnes = Grille.DEF_NB_COLONNES_FACILE;
                nbMines = Grille.DEF_NB_MINES_FACILE;
                break;
        }
        _grille = new Grille(this,nbLignes,nbColonnes,nbMines);
        _grille.initialiser();
        _partie = new Partie(this);
    }

    public Demineur(){
        _grille = new Grille(this);
        _grille.initialiser();
        _partie = new Partie(this);
    }

    public Grille get_grille(){
        return _grille;
    }

    public Partie get_partie(){
        return _partie;
    }

    public void quitter(){
        System.exit(0);
    }

    protected void initialiser(){
        _grille.initialiser();
        _partie = new Partie(this);
    }

    public abstract void nouvellePartie();
    public abstract void decouvreCase(int x,int y);
}
