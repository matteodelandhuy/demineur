package demineur;
/**
 * Classe principale contenant le main.
 * @author Maxime GASTON, Alexis DEBERG
 */
public class DemineurApp
{
    public static void main(String [] args)
    {
        DemineurModele modele = new DemineurModele();
        DemineurVue vue = new DemineurVue(modele.getGrille());
    }
}
