/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.txt;

import demineur.tools.MyException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alexis
 */
public class UserInteraction {
    DemineurTxt _parent;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public UserInteraction(DemineurTxt d){
        _parent = d;
    }

    public void menu(){
        boolean ok = false;
        System.out.println("" +
                "1: Decouvrir une case   2: Poser un drapeau\n" +
                "3: Nouvelle Partie     4: Autre   5: Quitter\n"
        );
        while(!ok){
            ok = true;  int[] caseChoisie;
            try{
                System.out.print("Choix: ");
                switch(Integer.parseInt(br.readLine())){
                    case 1:
                        caseChoisie = inputCase();
                        _parent.decouvreCase(caseChoisie[0], caseChoisie[1]);
                        break;
                    case 2:
                        caseChoisie = inputCase();
                        _parent.majDrapeau(caseChoisie[0], caseChoisie[1]);
                        break;
                    case 3:
                        _parent.nouvellePartie();
                        break;
                    case 4:
                        System.out.println("" +
                                "6: nouvelle partie (facile)\n" +
                                "7: nouvelle partie (moyen)\n" +
                                "8: nouvelle partie (difficile)\n" +
                                "9: Aide\n" +
                                "10: A propos\n"
                        );
                        ok = false; break;
                    case 5: _parent.quitter();
                    case 6:
                        try{_parent.nouvellePartie(_parent.NIVEAU_FACILE);}
                        catch(MyException me){ ok = false; System.out.println(me.get_messageErreur()); }
                        break;
                    case 7: 
                        try{_parent.nouvellePartie(_parent.NIVEAU_MOYEN);}
                        catch(MyException me){ ok = false; System.out.println(me.get_messageErreur()); }
                        break;
                    case 8:
                        try{_parent.nouvellePartie(_parent.NIVEAU_DIFFICILE);}
                        catch(MyException me){ ok = false; System.out.println(me.get_messageErreur()); }
                        break;
                    case 9: break;
                    case 10:
                        System.out.println("Demineur en Java\n\nProgramme & GUI par:\n\nDeberg Alexis et Maxime Gaston\nIUT Orsay\nTP APP-1");
                        ok = false; break;
                    default: throw new Exception("Choix invalide");
                }
            }
            catch(IOException ioe){
                ok = false;
                System.out.println("Erreur de saisie");
            }
            catch(Exception e){
                ok = false;
                System.out.println(e.getMessage());
            }
        }
    }

    public int[] inputCase(){
        boolean ok = false;
        int[] caseChoisie = new int[2];
        int ligne = -1,colonne = -1;

        while(!ok){
            ok = true;
            try{
                System.out.print("Ligne :");
                ligne = Integer.parseInt(br.readLine());
                System.out.print("Colonne: ");
                colonne = Integer.parseInt(br.readLine());

                if(ligne <= 0 || ligne > _parent.get_grille().get_nbLignes() || colonne <= 0 || colonne > _parent.get_grille().get_nbColonnes())
                    throw new Exception("Case invalide");
            }
            catch(IOException ioe){ ok = false; System.out.println("Erreur de saisie");}
            catch(Exception e){ ok = false; System.out.println(e.getMessage()); }
        }

        caseChoisie[0] = ligne-1;
        caseChoisie[1] = colonne-1;
        
        return caseChoisie;
    }
}
