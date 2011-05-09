package divers;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 * @see JFrame
 */
public abstract class MyFrame extends JFrame
{
    /**
     * Constructeur de la fenêtre MyFrame.
     * @param nom de la fenêtre.
     */
    public MyFrame(String nom)
    {
        super(nom);
    }

    /**
     * Méthode permettant d'afficher ,dimensionner et centrer la fenêtre.
     */
    protected void setProperties()
    {
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        this.centrer();
    }
    /**
     * Méthode permettant de centrer la fenêtre.
     */
    private void centrer()
    {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = getSize().width;
        int h = getSize().height;
        int x = (d.width - w) / 2;
        int y = (d.height - h) / 2;
        setLocation(x, y);
    }
}
