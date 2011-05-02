package divers;

/**
 *
 * @author Maxime GASTON, Alexis DEBERG
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
        return _messageErreur;
    }

}
