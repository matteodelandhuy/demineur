/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.gui;

import demineur.gui.menu.DemineurMenu;
import demineur.Grille;
import demineur.Partie;
import demineur.tools.MyFrame;
import java.awt.BorderLayout;
import javax.swing.JFrame;
/**
 *
 * @author alexis
 */
public class DemineurGuiVue extends MyFrame{

    /**
     * Attribut constant correspondant au nom de la fenêtre.
     */
    private static final String NOM_FENETRE = "Démineur";

    DemineurGui _controlleur;

    DemineurMenu _menu;
    GrilleVue _grilleVue;
    PartieVue _partieVue;

    public DemineurGuiVue(DemineurGui ctrl,Grille grille,Partie p){
        super(NOM_FENETRE);
        _controlleur = ctrl;

        _menu = new DemineurMenu(ctrl);
        _grilleVue = new GrilleVue(this,grille);
        _partieVue = new PartieVue(p);

        add(_menu,BorderLayout.NORTH);
        add(_partieVue);
        add(_grilleVue,BorderLayout.SOUTH);
        setProperties();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public GrilleVue get_grilleVue(){
        return _grilleVue;
    }

    public void start(){
        _partieVue.demarrerPartie();
    }

    public void perdu(){
        _partieVue.stop();
        _controlleur.perdu();
    }
}
