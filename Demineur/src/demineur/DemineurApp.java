package demineur;
/**
 * Classe principale de l'application : cete classe sert à lancer l'interface utilisateur permettant de jouer au démineur.
 *
 * @author Maxime GASTON, Alexis DEBERG
 */
public class DemineurApp
{

    public static void main(String [] args)
    {
        DemineurModele modele = new DemineurModele();
        DemineurVue vue = new DemineurVue();
    }
}
