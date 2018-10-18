package ca.cours5b5.patrickpapineau.modeles;

import java.util.Map;

import ca.cours5b5.patrickpapineau.exceptions.ErreurSerialisation;
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
    //TODO
    public static MParametresPartie aPartirMParametres(MParametres mParametres){
        MParametresPartie mParametresPartie = mParametres.getParametresPartie().cloner();
        return  mParametresPartie;
    }
    //TODO
    public MParametresPartie cloner(){
        MParametresPartie clone = new MParametresPartie(this.getHauteur(),this.getLargeur(),this.getPourGagner());
        return clone;
    }

    public MParametresPartie(int hauteur, int largeur, int pourGagner) {
        this.setHauteur(hauteur);
        this.setLargeur(largeur);
        this.setPourGagner(pourGagner);
    }

    public Integer getHauteur(){
        return hauteur;
    }

    public Integer getLargeur(){
        return largeur;
    }

    public Integer getPourGagner(){
        return pourGagner;
    }

    public void setHauteur(int hauteur){
        this.hauteur = hauteur;
    }

    public void setLargeur(int largeur){
        this.largeur = largeur;
    }

    public void setPourGagner(int pourGagner){
        this.pourGagner = pourGagner;
    }

    @Override
    public void aPartirObjectJson(Map<String, Object> objectJson)throws ErreurSerialisation{

    }

    @Override
    public Map<String, Object> enObjetJson() throws ErreurSerialisation{

        return null;
    }

}
