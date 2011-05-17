/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.gui;

import demineur.Partie;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alexis
 */
public class PartieVue extends JPanel implements Runnable{
    private Partie _partie;
    private Thread _timer;
    private JLabel _tempsAffiche;

    public PartieVue(Partie p){
        _partie = p;
        _timer = new Thread(this);
        _tempsAffiche = new JLabel(""+0);
        add(_tempsAffiche);
    }

    public void demarrerPartie(){
        _timer.start();
    }

    public void run() {
        while(true){
            _partie.majTemps();
            majAffichage();
            try{ Thread.sleep(1000); } catch(InterruptedException e){}
        }
    }

    private void majAffichage(){
        _tempsAffiche.setText(""+_partie.get_temps());
    }

    public void stop(){
//        _timer.interrupt();
    }
}
