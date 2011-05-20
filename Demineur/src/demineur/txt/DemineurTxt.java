/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.txt;

import demineur.Demineur;
import demineur.Partie;
import demineur.tools.MyException;

/**
 *
 * @author alexis
 */
public class DemineurTxt extends Demineur {
    private UserInteraction input;
    private boolean jouer = true;
    private boolean mine = false;

    public DemineurTxt(){
        super();
        jouer();
    }

    private void jouer(){
        jouer = true; mine = false;
        input = new UserInteraction(this);
        int[] caseChoisie = new int[2];
        int choixMenu; boolean rejouer = false;

        while(jouer){
            System.out.println(_grille);

            if(!mine && !_partie.get_resultat()) input.menu();
            else{
                String msg = "perdu";
                if(!mine) msg = "gagné";
                if(!input.rejouer(msg)) quitter();
                else nouvellePartie();
            }
        }
    }

    public void nouvellePartie() {
         _partie = new Partie(this);
        super.initialiser();
        jouer();
    }

    public void nouvellePartie(int difficulte) throws MyException {
        _grille = setupGrille(difficulte);
        nouvellePartie();
        jouer();
    }

    public void nouvellePartie(int lignes, int colonnes, int mines) throws MyException {
        _grille = setupGrille(lignes,colonnes,mines);
        nouvellePartie();
        jouer();
    }

    public void decouvreCase(int x, int y) {
        if(!_grille.get_case(x, y).get_drapeau()){
            _grille.decouvrirCase(x, y);

            if(_grille.get_case(x, y).get_mine()){
                perdu();
            }
            else if(_grille.get_case(x,y).get_nbMinesProximite() == 0)
                _grille.decouvrirAutour(x, y);

            if(_grille.get_nbCasesDecouvertes() == _grille.nbCases())
                gagne();
        }
    }

    public void majDrapeau(int x, int y) {
        _grille.majDrapeau(x, y);
    }

    public void perdu() {
        mine = true;
        _partie.gagne();
        _grille.partiePerdue();
    }

    public void gagne() {
        _partie.gagne();
        _grille.gagne();
    }

}
