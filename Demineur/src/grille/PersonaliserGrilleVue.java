package grille;

import divers.MyException;
import divers.MyFrame;
import java.awt.GridLayout;
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
        this.add(panel);
        panel.setLayout(new GridLayout(4,2));

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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void verificationNbMines() throws MyException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Grille valider()
    {
        throw new UnsupportedOperationException("Not supported yet.");
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
