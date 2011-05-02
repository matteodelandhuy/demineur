package grille;

/**
 * 
 * @author Maxime GASTON
 */
public class Case
{

    /**
     * Booléen permettant de savoir si un drapeau a été posé sur la case.
     */
    private boolean _drapeau = false;
    /**
     * Booléen permettant de savoir si la case est découverte.
     */
    private boolean _decouvert = false;
    /**
     * Booléen permettant de savoir si la case est minée.
     */
    private boolean _mine;


    public Case(boolean mine)
    {
        this._decouvert = false;
        this._drapeau = false;
        this._mine = mine;
    }

    /**
     * Getter pour l'attribut _decouvert.
     * @return true si la case est découverte false sinon.
     */
    public boolean get_decouvert()
    {
        return this._decouvert;
    }

    /**
     * Méthode permettant de découvrir la case s'il n'y a pas de drapeau dessus.
     */
    public void decouvrir()
    {
        if (this.get_drapeau() == false)
        {
            this._decouvert = true;
        }
    }

    /**
     * Getter pour l'attribut _drapeau.
     * @return true si un drapeau a été mis sur la case, false sinon.
     */
    public boolean get_drapeau()
    {
        return this._drapeau;
    }

    /**
     * Méthode permettant de mettre ou d'enlever un drapeau sur une case non découverte.
     * @param _drapeau
     */
    public void setDrapeau()
    {
        if (this.get_decouvert() == false)
        {
            this._drapeau = !this._drapeau;
        }
    }
    /**
     * Getter pour l'attribut _mine.
     * @return true si la case est minée, false sinon.
     */
    public boolean get_mine()
    {
        return this._mine;
    }

    @Override
    public String toString()
    {
        if (this.get_mine() == true)
            return "CASE MINÉE";
        else
            return "CASE   OK ";
    }

}