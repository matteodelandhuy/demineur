package grille;

import divers.MyException;
import divers.MyFrame;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public class PersonaliserGrilleVue extends MyFrame implements InterfaceChoixGrille
{

    public static final int NB_MAX_LIGNES = 25;
    public static final int NB_MAX_COLONNES = 25;
    public static final int NB_MAX_MINES = 200;
    private static final String NOM_FENETRE = "Personaliser la grille";
    private static final String LBL_LIGNES = "Nombre de lignes : ";
    private static final String LBL_COLONNES = "Nombre de colonnes : ";
    private static final String LBL_MINES = "Nombre de mines : ";
    private JTextField _nbLignes;
    private JTextField _nbColonnes;
    private JTextField _nbMines;
    private JButton _btnOk;
    private JButton _btnAnnuler;

    public PersonaliserGrilleVue()
    {
        super(PersonaliserGrilleVue.NOM_FENETRE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(15, 20, 20, 20));
        this.add(panel);
        panel.setLayout(new GridLayout(4, 2));

        // Zone de saisie
        JLabel lblLignes = new JLabel(PersonaliserGrilleVue.LBL_LIGNES);
        panel.add(lblLignes);
        this._nbLignes = new JTextField(3);
        panel.add(this._nbLignes);

        JLabel lblColonnes = new JLabel(PersonaliserGrilleVue.LBL_COLONNES);
        panel.add(lblColonnes);
        this._nbColonnes = new JTextField(3);
        panel.add(this._nbColonnes);

        JLabel lblMines = new JLabel(PersonaliserGrilleVue.LBL_MINES);
        panel.add(lblMines);
        this._nbMines = new JTextField(3);
        panel.add(this._nbMines);


        // Zone des boutons
        this._btnOk = new JButton("Ok");
        panel.add(this._btnOk);
        this._btnAnnuler = new JButton("Annuler");
        panel.add(this._btnAnnuler);

        this.setProprietes();
    }

    private void setProprietes()
    {
        super.setProperties();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void verificationTaille() throws MyException
    {
        if ((Integer.parseInt(this._nbLignes.getText()) > PersonaliserGrilleVue.NB_MAX_LIGNES) || (Integer.parseInt(this._nbLignes.getText()) <= 0)
                || (Integer.parseInt(this._nbColonnes.getText()) > PersonaliserGrilleVue.NB_MAX_COLONNES) || (Integer.parseInt(this._nbColonnes.getText()) <= 0)
                || (Integer.parseInt(this._nbMines.getText()) > PersonaliserGrilleVue.NB_MAX_MINES) || (Integer.parseInt(this._nbMines.getText()) <= 0))
        {
            throw new MyException("Dimensions incorrectes");
        }
    }

    public void verificationNbMines() throws MyException
    {
        if (Integer.parseInt(this._nbMines.getText()) > (Integer.parseInt(this._nbLignes.getText())) * (Integer.parseInt(this._nbColonnes.getText())))
        {
            throw new MyException("Plus de mines que de cases? VRAIMENT!??!");
        }
    }

    public Grille valider() throws MyException
    {
        try
        {
            verificationTaille();
            verificationNbMines();
        } catch (MyException e)
        {
            throw e;
        }
        return new Grille(Integer.parseInt(this._nbLignes.getText()),Integer.parseInt(this._nbColonnes.getText()),Integer.parseInt(this._nbMines.getText()));

    }

    public void annuler()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String[] args)
    {
        PersonaliserGrilleVue g = new PersonaliserGrilleVue();
    }
}
