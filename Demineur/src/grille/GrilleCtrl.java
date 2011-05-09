/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grille;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author alexis
 */
public class GrilleCtrl implements MouseListener {
    private Grille _grille;
    private GrilleVue _grilleVue;
    private int _posX;
    private int _posY;

    public GrilleCtrl(Grille g, GrilleVue gv, int posX, int posY){
        _grille = g;
        _grilleVue = gv;
        _posX = posX;
        _posY = posY;
    }
/*
    public void actionPerformed(ActionEvent e) {
        _grilleVue.decouvrirCase(_posX, _posY);
    }
*/
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == e.BUTTON1)
            _grilleVue.decouvrirCase(_posX, _posY);
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
}
