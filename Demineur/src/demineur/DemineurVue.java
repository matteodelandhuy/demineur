package demineur;

import demineur.menu.DemineurMenu;
import divers.MyFrame;
import java.awt.BorderLayout;
import javax.swing.JFrame;

import grille.Grille;
import grille.GrilleVue;

/**
 * Vue de l'application démineur en interface graphique.
 * Cette vue n'est que la fenêtre principale de l'application contenant les autres vues : barre de menu et grille.
 * @author Maxime GASTON, Alexis DEBERG
 * @see DemineurMenu
 * @see GrilleVue
 * @see MyFrame
 */
public class DemineurVue extends MyFrame
{
    /**
     * Attribut constant correspondant au nom de la fenêtre.
     */
    private static final String NOM_FENETRE = "Démineur";
    /**
     * Attribut correspondant à la grille choisie pour la partie.
     */
    private Grille _grille;

    /**
     * Constructeur de la vue principale.
     * Le constructeur créé une fenêtre avec barre de menus et grille facile par défaut.
     * Il est possible de changer la grille via les items de la barre de menus.
     */
    public DemineurVue()
    {
        super(DemineurVue.NOM_FENETRE);
        Grille grille = new Grille();
        GrilleVue panel = new GrilleVue(grille);

        this.add(panel);
        
        DemineurMenu menu = new DemineurMenu();
        this.add(menu, BorderLayout.PAGE_START);
        this.setProprietes();
    }

    /**
     * Méthode permettant d'affecter la grille choisie ou personalisée.
     * @param g grille choisie.
     */
    public void setGrille(Grille g)
    {
        this._grille = g;
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
