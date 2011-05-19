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
