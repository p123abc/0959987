package ca.cours5b5.PatrickPapineau.donnees;

import java.util.Map;

public final class Serveur {

    /*
    Serveur est un singleton
     */

    private Serveur() {

    }

    private static final Serveur instance;

    public static Serveur getInstance(){
        return  null;
    }

    @Override
    public void sauvegarderModele(String cheminSauvegarde, Map<String, Object> objectJson){
        /*

        Sauvegarder sur le server

        Utiliser FirebaseDatabase et DatabaseReference

         */
    }

    @Override
    public Map<String, Object> chargerModele(String cheminSauvegarde){
        /*

        Bonus : est-ce possible d'implanter cette méthode avec cette signature

         */
    }

    @Override
    public void detruireSauvegarde(String cheminSauvegarde){

    }
}
