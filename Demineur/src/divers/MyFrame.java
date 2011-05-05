package divers;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public abstract class MyFrame extends JFrame
{

    public MyFrame(String nom)
    {
        super(nom);
    }

    protected void setProperties()
    {
        this.setResizable(false);
        this.setVisible(true);
        this.pack();
        this.centrer();
    }

    protected void centrer()
    {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int w = getSize().width;
        int h = getSize().height;
        int x = (d.width - w) / 2;
        int y = (d.height - h) / 2;
        setLocation(x, y);
    }
}
