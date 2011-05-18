/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demineur.gui;

import demineur.Partie;

/**
 *
 * @author alexis
 */
public class PartieCtrl {
    Partie _partie;
    PartieVue _vue;

    PartieCtrl(Partie p, PartieVue v){
        _partie = p;
        _vue = v;
    }

    
}
