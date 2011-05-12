package demineur;

import grille.Grille;

/**
 *
 * @author alexis
 */
public class DemineurModele {
    Grille _grille;

    public DemineurModele(){
        Grille grille = new Grille(Grille.DEF_NB_LIGNES_FACILE,Grille.DEF_NB_COLONNES_FACILE,Grille.DEF_NB_MINES_FACILE);
        grille.initialiser();
        _grille = grille;
    }

    public Grille getGrille(){
        return _grille;
    }
}
