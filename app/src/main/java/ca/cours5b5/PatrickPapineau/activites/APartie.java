package ca.cours5b5.PatrickPapineau.activites;


import android.os.Bundle;

import ca.cours5b5.PatrickPapineau.R;
import ca.cours5b5.PatrickPapineau.controleurs.ControleurModeles;
import ca.cours5b5.PatrickPapineau.donnees.SauvegardeTemporaire;
import ca.cours5b5.PatrickPapineau.modeles.MParametres;
import ca.cours5b5.PatrickPapineau.modeles.MPartie;

public class APartie extends Activite {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_partie);

    }

    @Override
    protected void onPause() {
        super.onPause();

        ControleurModeles.sauvegarderModele(MPartie.class.getSimpleName());

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        ControleurModeles.sauvegarderModeleDansCetteSource(MPartie.class.getSimpleName(),
                new SauvegardeTemporaire(outState));

    }
}