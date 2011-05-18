/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.gui.menu;

import demineur.*;
import demineur.gui.DemineurGui;
import demineur.tools.MyException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alexis
 */
public class DemineurMenuCtrl implements ActionListener {
    DemineurGui _demineur;
    String _action;

    public DemineurMenuCtrl(DemineurGui d, String a){
        _demineur = d;
        _action = a;
    }

    public void actionPerformed(ActionEvent e) {
        try{
            if(_action == "Aide")
                JOptionPane.showMessageDialog(new JFrame("Aide"), "Pouetpouet","Aide",JOptionPane.PLAIN_MESSAGE);
            else if(_action == DemineurMenu.QUITTER)
                System.exit(0);
            else if(_action == DemineurMenu.NOUVELLE_PARTIE)
                _demineur.nouvellePartie();
            else if(_action == DemineurMenu.FACILE)
                _demineur.nouvellePartie(Demineur.NIVEAU_FACILE);
            else if(_action == DemineurMenu.MOYEN)
                _demineur.nouvellePartie(Demineur.NIVEAU_MOYEN);
            else if(_action == DemineurMenu.DIFFICILE)
                _demineur.nouvellePartie(Demineur.NIVEAU_DIFFICILE);
        }
        catch(MyException me){
            me.show_erreur();
        }

    }
}
