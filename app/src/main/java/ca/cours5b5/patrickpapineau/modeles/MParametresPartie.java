package ca.cours5b5.patrickpapineau.modeles;

import ca.cours5b5.patrickpapineau.serialisation.AttributSerialisable;

public class MParametresPartie extends Modele{

    @AttributSerialisable
    public Integer hauteur;
    protected final String __hauteur = "hauteur";

    @AttributSerialisable
    public Integer largeur;
    protected final String __largeur = "largeur";

    @AttributSerialisable
    public Integer pourGagner;
    protected final String __pourGagner = "pourGagner";

    public static MParametresPartie aPartirMParametres(MParametres mParametres){

    }

    public MParametresPartie cloner(){

    }

    
}
