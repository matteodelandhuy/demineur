/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.gui;

import java.awt.Color;
import java.awt.Dimension;
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
    private Color _defaultColor;

    public CaseVue(int posX,int posY){
        super(" ");
        _posX = posX;
        _posY = posY;
        this.setPreferredSize(new Dimension(this.WIDTH_CASE,this.HEIGHT_CASE));
        _defaultColor = this.getBackground();
    }

    public void decouvrirVide(int num){
        this.setText(""+num);
    }

    public void decouvrirMine(){
        this.setBackground(Color.red);
        this.setText("M");
    }

    public void poserDrapeau(){
        this.setBackground(Color.orange);
        this.setText("!");
    }

    public void enleverDrapeau(){
        this.setBackground(_defaultColor);
        this.setText(" ");
    }
}
