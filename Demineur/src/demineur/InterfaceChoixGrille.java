package demineur;

import demineur.tools.MyException;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public interface InterfaceChoixGrille
{
    public boolean verificationTaille();
    public boolean verificationNbMines();
    public boolean valider();
    public void annuler();
}
