package demineur;

/**
 *
 * @author alexis
 */
public class Partie{
    private Demineur _demineur;

    private int _temps = 0;
    private boolean _gagne = false;
    public final static int DELAY = 1000;

    public Partie(Demineur d){
        _demineur = d;
    }

    public int get_temps(){
        return _temps;
    }

    public void majTemps(){
        _temps++;
    }

    public boolean get_resultat(){
        return _gagne;
    }
}
