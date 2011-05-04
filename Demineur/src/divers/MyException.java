package divers;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Classe basique d'exceptions permettant de donner un message d'erreur.
 * @author Maxime GASTON, Alexis DEBERG
 * @see Throwable
 */
public class MyException extends Throwable
{

    /**
     * Description de l'erreur par un bref message
     */
    private String _messageErreur;

    /**
     * Constructeur de l'erreur
     * @param message de l'erreur
     */
    public MyException(String messageErreur)
    {

        this._messageErreur = messageErreur;
    }

    /**
     * Accesseur pour le message.
     * @return message de l'erreur.
     */
    public String get_messageErreur()
    {
        return this._messageErreur;
    }
    /**
     * Affichage d'une boite de dialogue décrivant l'erreur.
     */
    public void show_erreur()
    {
        JOptionPane.showMessageDialog(new JFrame(), this._messageErreur, "Erreur!",JOptionPane.ERROR_MESSAGE);
    }
    /**
     * Affichage d'une boite de dialogue décrivante l'erreur.
     * @param message complémentaire pour des action effectuées en conséquence de l'erreur.
     */
    public void show_erreur(String message_complémentaire)
    {
        JOptionPane.showMessageDialog(new JFrame(), this._messageErreur+"\n"+message_complémentaire, "Erreur!",  JOptionPane.ERROR_MESSAGE);
    }
}
