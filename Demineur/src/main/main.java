package main;

import demineur.txt.DemineurTxt;
import demineur.gui.DemineurGui;

/**
 *
 * @author alexis
 */
public class main {
    public static void main(String args[]){
        if(args.length < 1){
            System.out.println("usage: Demineur -mode\n");
            System.out.println("The [mode] argument can be one of the followings:");
            System.out.println(" gui    Graphical user interface");
            System.out.println(" txt    Textual interface");
        }
        else if(args[0].equalsIgnoreCase("-gui")){
            DemineurGui d = new DemineurGui();
        }
        else if(args[0].equalsIgnoreCase("-txt")){
            DemineurTxt d = new DemineurTxt();
        }
    }
}
