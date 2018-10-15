package ca.cours5b5.patrickpapineau.controleurs;

import java.util.Map;

import ca.cours5b5.patrickpapineau.controleurs.interfaces.ListenerObservateur;
import ca.cours5b5.patrickpapineau.modeles.MPartie;
import ca.cours5b5.patrickpapineau.modeles.Modele;

public class ControleurObservation {

    private static Map<Modele, ListenerObservateur> observation;

    // l'attribut est private: la vue doit obtenir le modèle par l'observation
    private static MPartie partie;

    static {

    }

    public static void observerModele(String nomModele, final ListenerObservateur listenerObservateur){



    }

}
