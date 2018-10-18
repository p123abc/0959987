package ca.cours5b5.patrickpapineau.vues;

import android.content.Context;
import android.util.AttributeSet;

import ca.cours5b5.patrickpapineau.controleurs.ControleurObservation;
import ca.cours5b5.patrickpapineau.controleurs.interfaces.ListenerObservateur;
import ca.cours5b5.patrickpapineau.modeles.MPartie;
import ca.cours5b5.patrickpapineau.modeles.Modele;

public class VPartie extends Vue {

    private VGrille grille;

    public VPartie(Context context){
        super(context);
    }

    public VPartie (Context context, AttributeSet attrs){
        super(context, attrs);
    }

    public VPartie (Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate(){
        super.onFinishInflate();
    }

    private void observerPartie(){

        ControleurObservation.observerModele(MPartie.class.getSimpleName(), new ListenerObservateur() {
                    @Override
                    public void reagirChangementAuModele(Modele modele) {
                        initialiserGrille(getPartie(modele));
                    }
                });
    }

    private MPartie getPartie(Modele modele){
        return (MPartie) modele;
    }

    //TODO
    private void initialiserGrille(MPartie partie){

    }
}
