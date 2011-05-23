/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demineur.txt;

import demineur.Grille;
import demineur.tools.MyException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// TODO Implémenter InterfaceChoixGrille et InterfaceDemineurMenu
/**
 *
 * @author alexis
 */
public class UserInteraction {
    private DemineurTxt _parent;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public UserInteraction(DemineurTxt d){
        _parent = d;
    }

    public void menu(){
        boolean ok = false;
        System.out.println("" +
                "1: Decouvrir une case   2: Poser/Retirer un drapeau\n" +
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
                                "9: nouvelle partie (personnalisée)\n" +
                                "10: Aide\n" +
                                "11: A propos\n"
                        );
                        ok = false; break;
                    case 5: 
                        _parent.quitter();
                        break;
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
                    case 9:
                        int[] dim = inputDimensions();
                        try{ _parent.nouvellePartie(dim[0], dim[1], dim[2]); }
                        catch(MyException me){ ok = false; System.out.println(me.get_messageErreur()); }
                        break;
                    case 10:

                        break;
                    case 11:
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

    private int[] inputCase(){
        boolean ok = false;
        int[] caseChoisie = new int[2];
        int ligne = -1,colonne = -1;

        while(!ok){
            ok = true;
            try{
                System.out.print("Ligne: ");
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

    private int[] inputDimensions(){
        boolean ok = false;
        int[] dim = new int[3];
        int lig = -1, col = -1, mines = -1;
        while(!ok){
            try{
                System.out.print("Nombre de lignes: ");
                lig = Integer.parseInt(br.readLine());
                System.out.print("Nombre de colonnes: ");
                col = Integer.parseInt(br.readLine());
                System.out.print("Nombre de mines: ");
                mines = Integer.parseInt(br.readLine());
                if(verificationTaille(lig,col,mines))
                    ok = true;
                else
                    System.out.println("Dimensions incorrectes");
            }
            catch(IOException ioe){ ok = false; System.out.println("Erreur de saisie");}
            catch(Exception e){ ok = false; System.out.println(e.getMessage()); }
        }
        dim[0] = lig;
        dim[1] = col;
        dim[2] = mines;
        return dim;
    }

    private boolean verificationTaille(int lig,int col,int mines){
        if(
                lig > 0 &&
                lig < Grille.NB_MAX_LIGNES &&
                col > 0 &&
                col < Grille.NB_MAX_COLONNES &&
                mines > 0 &&
                mines < Grille.NB_MAX_MINES
        )
            return true;
        return false;
    }

    public boolean rejouer(String msg){
        System.out.print("Vous avez " + msg +"\nRejouer ? (O/N)");
        boolean rejouer = false;
        try{ rejouer = br.readLine().equalsIgnoreCase("O"); }
        catch(IOException ioe){ System.out.println("Erreur de saisie"); }
        return rejouer;
    }
}
