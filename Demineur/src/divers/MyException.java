package divers;

/**
 *
 * @author maxbook
 */
public class MyException extends Throwable
{


    private String _messageErreur;

    public MyException(String messageErreur)
    {

        this._messageErreur = messageErreur;
    }


    public String get_messageErreur()
    {
        return _messageErreur;
    }

}
