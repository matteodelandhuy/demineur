package demineur;

import demineur.tools.MyException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author alexis
 */
public class Partie{
    private Demineur _demineur;
    private ArrayList<Score> scores = null;

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

    public void gagne(){
        _gagne = true;
    }

    public void addScore(String nom){
        Score player = new Score(nom,_temps);
        if(scores.size() <= 10 && player.compareTo(scores.get(scores.size())) >= 1)
            scores.add(player);
        else
            scores.add(player);

        Collections.sort(scores);
    }

    public ArrayList<Score> getScores(){
        return scores;
    }


    public void sauverScores()throws MyException{
        if(scores != null){
            FileOutputStream f_out = null;
            try{f_out = new FileOutputStream("./scores");}
            catch(FileNotFoundException fnf){fnf.printStackTrace();}

            try{ObjectOutputStream obj_out = new ObjectOutputStream(f_out);
                obj_out.writeObject(scores);
                obj_out.flush();
                obj_out.close();
            }catch(IOException ioe){ioe.printStackTrace();}
        }
    }

    public void lireScores() throws MyException{
        FileInputStream f_in = null;

        try{f_in = new FileInputStream("./scores");}
        catch(FileNotFoundException fnf){fnf.printStackTrace();}

        try{ObjectInputStream obj_in = new ObjectInputStream(f_in);
            ArrayList<Score> tmp_scores = (ArrayList<Score>)obj_in.readObject();
            scores = tmp_scores;
        }
        catch(IOException ioe){ioe.printStackTrace();}
        catch(ClassNotFoundException cnf){cnf.printStackTrace();}
    }
}
