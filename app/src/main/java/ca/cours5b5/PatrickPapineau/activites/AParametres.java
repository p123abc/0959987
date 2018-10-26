package ca.cours5b5.PatrickPapineau.activites;

import android.os.Bundle;

import ca.cours5b5.PatrickPapineau.R;
import ca.cours5b5.PatrickPapineau.controleurs.ControleurModeles;
import ca.cours5b5.PatrickPapineau.controleurs.interfaces.Fournisseur;
import ca.cours5b5.PatrickPapineau.modeles.MParametres;

public class AParametres extends Activite implements Fournisseur{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametres);

    }

    @Override
    protected void onPause() {
        super.onPause();

        ControleurModeles.sauvegarderModele(MParametres.class.getSimpleName());

    }

}
