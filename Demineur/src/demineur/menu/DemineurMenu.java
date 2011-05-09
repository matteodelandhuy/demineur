package demineur.menu;

import divers.MyException;
import grille.PersonaliserGrilleVue;
import grille.Grille;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import partie.Partie;

/**
 * Classe correspondant à la barre de menus du démineur.
 * @author Maxime GASTON, Alexis DEBERG
 * @see JMenuBar
 * @see JMenu
 * @see JMenuItem
 * @see JRadioButtonMenuItem
 * @see interfaceDemineurMenu
 */
public class DemineurMenu extends JMenuBar implements interfaceDemineurMenu
{

    /**
     * Constante : nombre correspondant au niveau facile
     */
    public static final int NIVEAU_FACILE = 1;
    /**
     * Constante : nombre correspondant au niveau moyen
     */
    public static final int NIVEAU_MOYEN = 2;
    /**
     * Constante : nombre correspondant au niveau difficile
     */
    public static final int NIVEAU_DIFFICILE = 3;
    private static final String NOUVELLE_PARTIE = "Nouvelle partie";
    private static final String FACILE = "Facile";
    private static final String MOYEN = "Moyen";
    private static final String DIFFICILE = "Difficile";
    private static final String PERSONALISER = "Personaliser";
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
     */
    public void choisirDimensions()
    {
        PersonaliserGrilleVue choixGrille = new PersonaliserGrilleVue();
    }

    /**
     * Méthode permettant de quitter l'application.
     */
    public void quitter()
    {
        System.exit(0);
    }
}
