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
