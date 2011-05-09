/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grille;

import divers.MyException;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author alexis
 */
public class CaseVue extends JButton {
    public final int WIDTH_CASE = 55;
    public final int HEIGHT_CASE = 55;
    private int _posX;
    private int _posY;

    public CaseVue(int posX,int posY){
        super(" ");
        _posX = posX;
        _posY = posY;
        this.setPreferredSize(new Dimension(this.WIDTH_CASE,this.HEIGHT_CASE));
    }
}
