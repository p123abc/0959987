package ca.cours5b5.patrickpapineau.vues;

import android.content.Context;
import android.util.AttributeSet;

import ca.cours5b5.patrickpapineau.modeles.MPartie;

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
    //TODO
    @Override
    protected void onFinishInflate(){
        super.onFinishInflate();


    }
    //TODO
    private void observerPartie(){

    }
    //TODO
    private MPartie getPartie(){

        return null;
    }

    //TODO
    private void initialiserGrille(MPartie partie){

    }
}
