/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.gui;

import demineur.Partie;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author alexis
 */
public class PartieVue extends JPanel implements ActionListener{
    private Partie _partie;
    private JLabel _tempsAffiche;
    private Timer _timer;

    public PartieVue(Partie p){
        _partie = p;
        _tempsAffiche = new JLabel(""+0);
        add(_tempsAffiche);

        _timer = new Timer(_partie.DELAY,this);
    }

    public void demarrer(){
        _timer.start();
    }

    public void majAffichage(){
        _tempsAffiche.setText(""+_partie.get_temps());
    }

    public void stop(){
        _timer.stop();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == _timer){
            _partie.majTemps();
            this.majAffichage();
        }
    }
}
