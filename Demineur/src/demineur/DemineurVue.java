package demineur;

import demineur.menu.DemineurMenu;
import java.awt.BorderLayout;
import javax.swing.JFrame;


import javax.swing.JPanel;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public class DemineurVue extends JFrame
{
    public DemineurVue()
    {
        JPanel panel = new JPanel(); this.add(panel);
        BorderLayout border = new BorderLayout(); this.setLayout(border);
        DemineurMenu menu = new DemineurMenu(); this.add(menu, BorderLayout.PAGE_START);
        this.setProprietes();
    }

    private void setProprietes()
    {
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
