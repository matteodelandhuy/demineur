package grille;

import divers.MyException;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public interface InterfaceChoixGrille
{
    public void verificationTaille() throws MyException;
    public void verificationNbMines() throws MyException;
    public void valider();
    public void annuler();
}
