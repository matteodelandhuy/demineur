package grille;

import divers.MyFrame;
import javax.swing.JFrame;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public class ChoixGrilleVue extends MyFrame
{

    public ChoixGrilleVue()
    {
        super();
        this.setProprietes();
    }

    private void setProprietes()
    {
        super.setProperties();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
