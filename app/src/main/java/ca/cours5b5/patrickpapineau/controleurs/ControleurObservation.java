package ca.cours5b5.patrickpapineau.controleurs;

import java.util.HashMap;
import java.util.Map;

import ca.cours5b5.patrickpapineau.controleurs.interfaces.ListenerObservateur;
import ca.cours5b5.patrickpapineau.modeles.MParametres;
import ca.cours5b5.patrickpapineau.modeles.MParametresPartie;
import ca.cours5b5.patrickpapineau.modeles.MPartie;
import ca.cours5b5.patrickpapineau.modeles.Modele;

public class ControleurObservation {

    private static Map<Modele, ListenerObservateur> observation;

    // l'attribut est private: la vue doit obtenir le modèle par l'observation
    private static MPartie partie;

    static {
        partie = new MPartie(MParametres.instance.getParametresPartie());
        observation = new HashMap<>();
    }

    public static void observerModele(String nomModele, final ListenerObservateur listenerObservateur){

        if(nomModele.equals(MPartie.class.getSimpleName())){



            observation.put(partie,listenerObservateur);

            listenerObservateur.reagirNouveauModele(partie);


        }else if(nomModele.equals(MParametres.class.getSimpleName())){



            observation.put(MParametres.instance,listenerObservateur);

            listenerObservateur.reagirNouveauModele(MParametres.instance);


        }

    }

}
