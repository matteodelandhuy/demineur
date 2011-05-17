/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur;

/**
 *
 * @author alexis
 */
public class Partie{
    private Demineur _demineur;
    private int _temps = 0;
    private boolean _gagne = false;


    public Partie(Demineur d){
        _demineur = d;
    }

    public void majTemps(){
        _temps++;
    }

    public int get_temps(){
        return _temps;
    }
}
