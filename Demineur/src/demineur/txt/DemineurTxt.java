/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.txt;

import demineur.Demineur;
import demineur.Partie;
import demineur.tools.MyException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author alexis
 */
public class DemineurTxt extends Demineur implements ActionListener{
    private UserInteraction input;
    private boolean jouer = true;
    private boolean mine = false;
    private Timer _timer;

    public DemineurTxt(){
        super();
        _timer = new Timer(Partie.DELAY,this);
        jouer();
    }

    private void jouer(){
        jouer = true; mine = false;
        input = new UserInteraction(this);
        int[] caseChoisie = new int[2];
        int choixMenu; boolean rejouer = false;
        _timer.start();
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

            if(_grille.get_nbCasesDecouvertes() == _grille.nbCases()-_grille.get_nbMines())
                gagne();
        }
    }

    public void majDrapeau(int x, int y) {
        _grille.majDrapeau(x, y);
    }

    public void perdu() {
        mine = true;
        _timer.stop();
        _grille.partiePerdue();
    }

    public void gagne() {
        _partie.gagne();
        _grille.gagne();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == _timer)
            _partie.majTemps();
            System.out.println(_partie.get_temps());
    }

}
