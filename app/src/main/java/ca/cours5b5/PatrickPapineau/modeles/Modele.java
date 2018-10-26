package ca.cours5b5.PatrickPapineau.modeles;

import java.util.Map;

import ca.cours5b5.PatrickPapineau.exceptions.ErreurSerialisation;


public abstract class Modele {

    public abstract void aPartirObjetJson(Map<String, Object> objetJson) throws ErreurSerialisation;

    public abstract Map<String, Object> enObjetJson() throws ErreurSerialisation;

}
