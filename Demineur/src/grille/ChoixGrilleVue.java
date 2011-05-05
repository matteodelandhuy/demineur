package grille;

import divers.MyException;
import divers.MyFrame;
import java.awt.BorderLayout;
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
public class ChoixGrilleVue extends MyFrame implements InterfaceChoixGrille
{
    private static final String NOM_FENETRE = "Personaliser la grille";
    public ChoixGrilleVue()
    {
        super(ChoixGrilleVue.NOM_FENETRE);

        JPanel panel = new JPanel(); this.add(panel);
        panel.setLayout(new BorderLayout());

        // Zone de saisie
        JPanel panelSaisie = new JPanel();
        GridLayout gridSaisie = new GridLayout(3, 2);
        panelSaisie.setLayout(gridSaisie);
        JLabel lblLignes = new JLabel(); panelSaisie.add(lblLignes);
        JTextField nbLignes = new JTextField();panelSaisie.add(nbLignes);
        JLabel lblColonnes = new JLabel();panelSaisie.add(lblColonnes);
        JTextField nbColonnes = new JTextField();panelSaisie.add(nbColonnes);
        JLabel lblMines = new JLabel();panelSaisie.add(lblMines);
        JTextField nbMines = new JTextField();panelSaisie.add(nbMines);
        panel.add(panelSaisie);

        // Zone des boutons
        JPanel panelBtns = new JPanel();
        GridLayout gridBtns = new GridLayout(1, 2);
        panelSaisie.setLayout(gridBtns);
        JButton btnOk = new JButton("Ok"); panelBtns.add(btnOk);
        JButton btnAnnuler = new JButton("Annuler"); panelBtns.add(btnAnnuler);
        panel.add(panelBtns, BorderLayout.PAGE_END);

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

    public void valider()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void annuler()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
