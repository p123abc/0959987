package ca.cours5b5.patrickpapineau.vues;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

public class VGrille extends GridLayout {

    public VGrille(Context context){
        super(context);
    }


    public VGrille(Context context, AttributeSet attrs){
        super(context, attrs);
    }


    public VGrille(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
    }

    private int nombreRangees;

    private List<VEntete> entetes;



    // Ou avec des liste (voir l énoncé de l atelier 6 dans Classe VGrille)

    private class Colonne extends ArrayList<VCase>{ }
    private List<Colonne> colonnesDeCases;
    private VCase [][] lesCases;


    @Override
    protected void onFinishInflate(){
        super.onFinishInflate();
    }

    void creerGrille(int hauteur, int largeur){
        initialiserTableauDeCase(hauteur, largeur);
        ajouterEnTetes(largeur);
        ajouterCase(hauteur, largeur);
    }



    private void initialiserTableauDeCase(int hauteur, int largeur){
        lesCases = new VCase[hauteur][largeur];
    }

    // Ou avec des liste (voir l énoncé de l atelier 6 dans Classe VGrille)


    /** void initialiserColonnes (int largeur) {
        colonnesDeCases = new ArrayList<>();
        for (int i = 0; i < largeur; i++){
            colonnesDeCases.add(new Colonne());
        }
    }*/


    private void ajouterEnTetes(int largeur){

        entetes = new ArrayList<>();
        for(int i = 0; i < largeur; i++){
            VEntete entete = new VEntete(super.getContext(), i);
            entetes.add(entete);
            this.addView(entete,this.getMiseEnPageEntete(i));
        }
    }

    //TODO
    private GridLayout.LayoutParams getMiseEnPageEntete(int colonne){
        int rangee =0;
        float poidRangee = 3, poidColonne = 0;
        Spec specRangee = GridLayout.spec(rangee, poidRangee);
        Spec specColonne = GridLayout.spec(colonne, poidColonne);
        LayoutParams params = new LayoutParams(specRangee, specColonne);
        params.width = 0;
        params.height = 0;
        params.setGravity(Gravity.FILL);
        return params;
    }
    //TODO
    private void ajouterCase(int hauteur, int largeur){
        for(int col = 0; col < hauteur; col++){
            for(int ran = 0; ran < largeur; ran++){
                VCase vCase = new VCase(this.getContext(),col,ran);
                lesCases[col][ran] = vCase;
                this.addView(vCase,this.getMiseEnPageCase(hauteur - col - 1, ran));
            }
        }
    }
    //TODO
    private GridLayout.LayoutParams getMiseEnPageCase(int rangee, int colonne){

        float poidRangee = 1, poidColonne = 1;
        Spec specRangee = GridLayout.spec(rangee + 1, poidRangee);
        Spec specColonne = GridLayout.spec(colonne, poidColonne);
        LayoutParams params = new LayoutParams(specRangee, specColonne);
        params.width = 0;
        params.height = 0;
        params.setGravity(Gravity.FILL);
        return params;
    }
}
