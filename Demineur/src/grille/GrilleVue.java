/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grille;

import divers.MyException;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author alexis
 */
public class GrilleVue extends JPanel{
    private GridLayout _layout;
    private CaseVue[][] _buttons;
    private Grille _grille;

    public GrilleVue(Grille grille){
        _grille = grille;
        _layout = new GridLayout(_grille.get_nbLignes(),_grille.get_nbColonnes());
        _buttons = new CaseVue[_grille.get_nbLignes()][_grille.get_nbColonnes()];

        this.setLayout(_layout);

        for(int i=0;i<_grille.get_nbLignes();i++){
            for(int j=0;j<_grille.get_nbColonnes();j++){
                CaseVue b = new CaseVue(i,j);
                b.addMouseListener(new GrilleCtrl(_grille,this,i,j));
                //System.out.println(i+" / "+j);
                _buttons[i][j] = b;
                this.add(_buttons[i][j]);
            }
        }
    }

    public void decouvrirCase(int x, int y){
        _grille.get_case(x, y).decouvrir();
        if(_grille.get_case(x, y).get_mine())
            _buttons[x][y].setText("M");
        else _buttons[x][y].setText(".");
        /*        if(_grille.get_case(x, y).get_mine())
            _buttons[x][y].setText("X");
        else _buttons[x][y].setText(".");
  */  }

    public void poserDrapeau(int x, int y){
        if(_grille.get_case(x, y).get_drapeau() == false){
            _grille.get_case(x, y).set_drapeau(true);
            _buttons[x][y].setText("!");
        }
        else{
            _buttons[x][y].setText(" ");
            _grille.get_case(x, y).set_drapeau(false);
        }
    }

    public static void main(String args[]){
        /*JFrame frame = new JFrame();
        Grille g = new Grille(3,3,3);
        GrilleVue gv = new GrilleVue(g);

        frame.add(gv);
        frame.show();*/

        Grille g = new Grille(3,3,3);
        boolean b = g.get_case(0,1).get_mine();
        System.out.println(b);
    }
}
