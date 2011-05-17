/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.gui.menu;

import demineur.InterfaceDemineurMenu;
import demineur.Demineur;
import demineur.gui.DemineurGui;
import demineur.tools.MyException;
import demineur.Grille;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;

/**
 *
 * @author alexis
 */
public class DemineurMenu extends JMenuBar implements InterfaceDemineurMenu {
        /**
     * Constante : intitulé de l'item nouvelle partie.
     */
    private static final String NOUVELLE_PARTIE = "Nouvelle partie";
    /**
     * Constante : intitulé de l'item permettant de choisir une partie facile.
     */
    private static final String FACILE = "Facile";
    /**
     * Constante : intitulé de l'item permettant de choisir une partie moyenne.
     */
    private static final String MOYEN = "Moyen";
    /**
     * Constante : intitulé de l'item permettant de choisir une partie difficile.
     */
    private static final String DIFFICILE = "Difficile";
    /**
     * Constante : intitulé de l'item permettant de choisir les dimensions et le nombre de mines de la grille.
     */
    private static final String PERSONALISER = "Personaliser";
    /**
     * Constante : intitulé de l'item quitter.
     */
    private static final String QUITTER = "Quitter";
    /**
     * Element "Nouvelle Partie" du menu "Partie".
     */
    private JMenuItem _nouvellePartie;
    /**
     * RadioButton correspondant au choix du niveau facile.
     */
    private JRadioButtonMenuItem _partieFacile;
    /**
     * RadioButton correspondant au choix du niveau moyen.
     */
    private JRadioButtonMenuItem _partieMoyen;
    /**
     * RadioButton correspondant au choix du niveau difficile.
     */
    private JRadioButtonMenuItem _partieDifficile;
    /**
     * Element "Personaliser" du menu "Partie".
     */
    private JMenuItem _personaliser;
    /**
     * Element "Quitter" du menu "Partie".
     */
    private JMenuItem _quitter;


    DemineurGui _parent;

    public DemineurMenu(DemineurGui p){
       super();
       _parent = p;

        JMenu menuPartie = new JMenu("Partie");
        JMenu menuAide = new JMenu("?");
        this.add(menuPartie);
        this.add(menuAide);

        //Ajout des items du menu "Partie"
        this._nouvellePartie = new JMenuItem(DemineurMenu.NOUVELLE_PARTIE);
        menuPartie.add(this._nouvellePartie);
        menuPartie.add(new JSeparator());
        this._partieFacile = new JRadioButtonMenuItem(DemineurMenu.FACILE);
        this._partieFacile.setSelected(false);
        menuPartie.add(this._partieFacile);
        this._partieMoyen = new JRadioButtonMenuItem(DemineurMenu.MOYEN);
        this._partieMoyen.setSelected(false);
        menuPartie.add(this._partieMoyen);
        this._partieDifficile = new JRadioButtonMenuItem(DemineurMenu.DIFFICILE);
        menuPartie.add(this._partieDifficile);
        this._partieDifficile.setSelected(false);
        this._personaliser = new JMenuItem(DemineurMenu.PERSONALISER);
        menuPartie.add(this._personaliser);
        menuPartie.add(new JSeparator());
        this._quitter = new JMenuItem(DemineurMenu.QUITTER);
        menuPartie.add(this._quitter);

        //Ajout des items du menu "?"
        JMenuItem aide = new JMenuItem("Aide");
        menuAide.add(aide);
    }

    public void nouvellePartie() {
        _parent.nouvellePartie();
    }

    public Grille choixNiveau(int niveau) throws MyException {
        switch (niveau)
        {
            case Demineur.NIVEAU_FACILE:
                return new Grille(_parent,Grille.DEF_NB_LIGNES_FACILE, Grille.DEF_NB_COLONNES_FACILE, Grille.DEF_NB_MINES_FACILE);
            case Demineur.NIVEAU_MOYEN:
                return new Grille(_parent,Grille.DEF_NB_LIGNES_MOYEN, Grille.DEF_NB_COLONNES_MOYEN, Grille.DEF_NB_MINES_MOYEN);
            case Demineur.NIVEAU_DIFFICILE:
                return new Grille(_parent,Grille.DEF_NB_LIGNES_DIFFICILE, Grille.DEF_NB_COLONNES_DIFFICILE, Grille.DEF_NB_MINES_DIFFICILE);
            default:
                throw new MyException("Ce mode de difficulté n'existe pas.");
        }
    }

    public void choisirDimensions() {
        PersonaliserGrilleVue choixGrille = new PersonaliserGrilleVue();
    }

    public void quitter() {
        _parent.quitter();
    }

}
