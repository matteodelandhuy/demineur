/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur;

/**
 *
 * @author alexis
 */
public interface Commandes {
    public void nouvellePartie();
    public void decouvreCase(int x, int y);
    public void majDrapeau(int x, int y);
    public void quitter();
}
