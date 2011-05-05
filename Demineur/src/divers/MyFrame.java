package divers;

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
        this.setVisible(true);
        this.pack();
    }
}
