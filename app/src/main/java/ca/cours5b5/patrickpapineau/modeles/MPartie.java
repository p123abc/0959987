package ca.cours5b5.patrickpapineau.modeles;

import java.util.Map;

import ca.cours5b5.patrickpapineau.exceptions.ErreurSerialisation;
import ca.cours5b5.patrickpapineau.serialisation.AttributSerialisable;

public class MPartie extends Modele{

    @AttributSerialisable
    public MParametresPartie parametres;
    private final String __parametres = "parametres";

    //TODO
    public MPartie(MParametresPartie parametres){

    }

    public MParametresPartie getParametres({
        return parametres;
    }

    @Override
    public void aPartirObjectJson(Map<String, Object> objectJson)throws ErreurSerialisation{
        //Inutilisé pour l'intant
    }

    @Override
    public Map<String, Object> enObjectJson()throws ErreurSerialisation{
        //Inutilisé pour l'intant
    }
}
