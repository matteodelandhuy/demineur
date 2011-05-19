/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.plaf.ButtonUI;

/**
 *
 * @author alexis
 */
public class CaseVue extends JButton {
    public final int WIDTH_CASE = 25;
    public final int HEIGHT_CASE = 25;
    private int _posX;
    private int _posY;
    private Color _defaultColor;
    private final static Font _defaultFont = new Font("sansserif",Font.PLAIN,12);
    private final ImageIcon imgMine = new ImageIcon(getClass().getResource("images/mine.png"));
    private final ImageIcon imgFlag = new ImageIcon(getClass().getResource("images/flag.png"));

    public CaseVue(int posX,int posY){
        super("");
        _posX = posX;
        _posY = posY;
        setFont(_defaultFont);
        setMargin(new Insets(1,1,1,1));
        setPreferredSize(new Dimension(WIDTH_CASE,HEIGHT_CASE));
        _defaultColor = getBackground();
    }

    public void decouvrirVide(int num){
        setEnabled(false);
        setText(""+num);
    }

    public void decouvrirMine(){
        setIcon(imgMine);
    }

    public void poserDrapeau(){
        setIcon(imgFlag);
    }

    public void enleverDrapeau(){
        setIcon(null);
        setBackground(_defaultColor);
    }
}
