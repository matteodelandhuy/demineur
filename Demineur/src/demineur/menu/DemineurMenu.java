package demineur.menu;

import grille.Grille;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

/**
 * Classe correspondant à la barre de menus du démineur.
 * @author Maxime GASTON, Alexis DEBERG
 * @see JMenuBar
 * @see JMenu
 * @see JMenuItem
 * @see JRadioButtonMenuItem
 */
public class DemineurMenu extends JMenuBar implements interfaceDemineurMenu
{
    private JMenuItem nouvellePartie;

    /**
     * Constructeur de la barre de menu.
     */
    public DemineurMenu()
    {
        // Ajout des menus
        super();
        JMenu menuPartie = new JMenu("Partie");
        JMenu menuAide = new JMenu("?");
        this.add(menuPartie);
        this.add(menuAide);

        //Ajout des items du menu "Partie"

        //Ajout des items du menu "?"

    }

    /**
     * Méthode permettant de lancer une nouvelle Partie avec la Grille choisie.
     * @param grille choisie (par défaut en facile)
     */
    public void nouvellePartie(Grille g)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Méthode permettant de choisir un nveau de difficulté.
     * @param difficulté choisie : 0 = personalisée, 1 = facile, 2 = moyen, 3 = difficile
     */
    public void choixNiveau(int niveau)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Méthode permettant d'appeler la fenêtre de choix des dimensions de la Grille (pour un partie personalisée).
     */
    public void choisirDimensions()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Méthode permettant de quitter l'application.
     */
    public void quitter()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
