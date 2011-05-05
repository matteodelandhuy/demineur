package demineur.menu;

import divers.MyException;
import grille.Grille;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import partie.Partie;

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
    public static final int  NIVEAU_FACILE = 1;
    public static final int  NIVEAU_MOYEN = 2;
    public static final int  NIVEAU_DIFFICILE = 3;

    private JMenuItem _nouvellePartie;
    private JRadioButtonMenuItem _partieFacile;
    private JRadioButtonMenuItem _partieMoyen;
    private JRadioButtonMenuItem _partieDifficile;
    private JMenuItem _quitter;

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
     * @return nouvelle partie.
     */
    public Partie nouvellePartie(Grille g)
    {
        return new Partie(g);
    }

    /**
     * Méthode permettant de choisir un nveau de difficulté.
     * @param difficulté choisie : 0 = personalisée, 1 = facile, 2 = moyen, 3 = difficile
     * @return  grille correspondant au niveau choisi.
     * @throws erreur de type MyException si le niveau n'est pas 1, 2 ou 3.
     */
    public Grille choixNiveau(int niveau) throws MyException
    {
        switch (niveau)
        {
            case DemineurMenu.NIVEAU_FACILE:
                return new Grille(Grille.DEF_NB_LIGNES_FACILE, Grille.DEF_NB_COLONNES_FACILE, Grille.DEF_NB_MINES_FACILE);
            case DemineurMenu.NIVEAU_MOYEN:
                return new Grille(Grille.DEF_NB_LIGNES_MOYEN, Grille.DEF_NB_COLONNES_MOYEN, Grille.DEF_NB_MINES_MOYEN);
            case DemineurMenu.NIVEAU_DIFFICILE:
                return new Grille(Grille.DEF_NB_LIGNES_DIFFICILE, Grille.DEF_NB_COLONNES_DIFFICILE, Grille.DEF_NB_MINES_DIFFICILE);
            default:
                throw new MyException("Ce mode de difficulté n'existe pas.");
        }
    }

    /**
     * Méthode permettant d'appeler la fenêtre de choix des dimensions de la Grille (pour un partie personalisée).
     * @return  grille correspondant au niveau choisi.
     */
    public Grille choisirDimensions()
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
