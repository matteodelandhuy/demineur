/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur;

import java.io.Serializable;

/**
 *
 * @author alexis
 */
public class Score implements Comparable<Score>,Serializable{
    private String nom;
    private int temps;

    public Score(String nom,int temps){
        this.nom = nom;
        this.temps = temps;
    }

    public String getNom(){
        return nom;
    }

    public int getTemps(){
        return temps;
    }

    public int compareTo(Score o) {
        if(temps < o.temps) return -1;
        else if(temps > o.temps) return 1;
        else return 0;
    }

    @Override
    public String toString(){
        return(""+nom+":"+temps);
    }
}
