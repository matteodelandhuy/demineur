package demineur;

import demineur.menu.DemineurMenu;
import divers.MyFrame;
import java.awt.BorderLayout;
import javax.swing.JFrame;

import grille.Grille;
import grille.GrilleVue;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public class DemineurVue extends MyFrame
{
    private static final String NOM_FENETRE = "Démineur";
    private Grille _grille;

    public DemineurVue(Grille grille)
    {
        super(DemineurVue.NOM_FENETRE);
        _grille = grille;
        GrilleVue panel = new GrilleVue(_grille);

        this.add(panel);
        
        DemineurMenu menu = new DemineurMenu();
        this.add(menu, BorderLayout.PAGE_START);
        this.setProprietes();
    }

    private void setProprietes()
    {
        super.setProperties();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
