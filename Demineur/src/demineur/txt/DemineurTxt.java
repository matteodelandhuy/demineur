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
    UserInteraction input;

    public DemineurTxt(){
        super();
        jouer();
    }

    private void jouer(){
        input = new UserInteraction(this);
        int[] caseChoisie = new int[2];
        int choixMenu;

        while(!_partie.get_resultat()){
            System.out.println(_grille);
            input.menu();
        }
    }

    public void nouvellePartie() {
        super.initialiser();
        _partie = new Partie(this);
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
        _grille.decouvrirCase(x, y);
    }

    public void majDrapeau(int x, int y) {
        _grille.majDrapeau(x, y);
    }

    public void perdu() {
        _grille.partiePerdue();
    }

    public void gagne() {
        _grille.gagne();
    }

}
