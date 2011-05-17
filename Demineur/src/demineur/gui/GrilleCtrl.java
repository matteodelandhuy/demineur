/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.gui;

import demineur.Grille;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class GrilleCtrl implements MouseListener {
    private Grille _grille;
    private GrilleVue _grilleVue;
    private int _posX;
    private int _posY;
    private DemineurGuiVue _parentVue;

    private static boolean start = false;

    public GrilleCtrl(DemineurGuiVue p,Grille g, GrilleVue gv, int posX, int posY){
        _grille = g;
        _grilleVue = gv;
        _posX = posX;
        _posY = posY;
        _parentVue = p;
    }
/*
    public void actionPerformed(ActionEvent e) {
        _grilleVue.decouvrirCase(_posX, _posY);
    }
*/
    public void mouseClicked(MouseEvent e) {
        if(!start){
            _parentVue.start();
            start = true;
        }

        if(e.getButton() == e.BUTTON1){
            _grilleVue.decouvrirCase(_posX, _posY);
            if(_grille.get_case(_posX, _posY).get_mine())
                this.partiePerdue();
        }
        else if(e.getButton() == e.BUTTON3)
            _grilleVue.poserDrapeau(_posX, _posY);
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }

    public void partiePerdue(){
        JOptionPane.showMessageDialog(new JFrame(), "Vous avez perdu !");
        _parentVue.perdu();
    }
}
