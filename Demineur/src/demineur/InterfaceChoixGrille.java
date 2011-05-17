package demineur;

import demineur.tools.MyException;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public interface InterfaceChoixGrille
{
    public void verificationTaille() throws MyException;
    public void verificationNbMines() throws MyException;
    public void valider()throws MyException;
    public void annuler();
}
