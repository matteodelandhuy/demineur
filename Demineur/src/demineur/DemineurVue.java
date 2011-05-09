package demineur;

import demineur.menu.DemineurMenu;
import divers.MyFrame;
import java.awt.BorderLayout;
import javax.swing.JFrame;


import javax.swing.JPanel;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 * @see DemineurMenu
 * @see MyFrame
 */
public class DemineurVue extends MyFrame
{
    /**
     * Constante correspondant au nom de la fenêtre.
     */
    private static final String NOM_FENETRE = "Démineur";
    /**
     * Constructeur de la fenêtre principale de l'application.
     */
    public DemineurVue()
    {
        super(DemineurVue.NOM_FENETRE);
        JPanel panel = new JPanel();
        this.add(panel);
        BorderLayout border = new BorderLayout();
        this.setLayout(border);
        DemineurMenu menu = new DemineurMenu();
        this.add(menu, BorderLayout.PAGE_START);
        this.setProprietes();
    }
    /**
     * Méthode permettant de définir les propriétés de la fenêtre.
     * @see MyFrame
     */
    private void setProprietes()
    {
        super.setProperties();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
