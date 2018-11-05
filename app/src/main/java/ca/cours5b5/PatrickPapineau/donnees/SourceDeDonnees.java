package ca.cours5b5.PatrickPapineau.donnees;

import java.util.Map;


public abstract class SourceDeDonnees {

    public abstract Map<String, Object> chargerModele(final String cheminSauvegarde);

    public abstract void sauvegarderModele(final String cheminSauvegarde, final Map<String, Object> objetJson);

    protected String getNomModele(String cheminSauvegarde){
        /*
        pour un chemin de sauvegarde de la forme nomModele

        retourner le nomModele

         */
    }

}
