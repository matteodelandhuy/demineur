package demineur;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public class DemineurVue extends JFrame
{
    private JMenu _menuPartie = new JMenu("Partie");
    private JMenu _menuAide = new JMenu("?");

    public DemineurVue()
    {
        JPanel panel = new JPanel(); this.add(panel);
        BorderLayout border = new BorderLayout(); this.setLayout(border);
        JMenuBar menu = new JMenuBar(); this.add(menu, BorderLayout.PAGE_START);
        menu.add(_menuPartie); menu.add(_menuAide);
        this.setProprietes();
    }

    private void setProprietes()
    {
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String [] args)
    {

    }
}
