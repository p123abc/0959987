package ca.cours5b5.patrickpapineau.vues;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
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

    //private VCase[][] lesCases;

    // Ou avec des liste (voir l énoncé de l atelier 6 dans Classe VGrille)

    private class Colonne extends ArrayList<VCase>{ }
    private List<Colonne> colonnesDeCases;


    @Override
    protected void onFinishInflate(){
        super.onFinishInflate();
    }

    void creerGrille(int hauteur, int largeur){
        initialiserColonnes(largeur);
        ajouterEnTetes(largeur);
        ajouterCase(hauteur, largeur);
    }


    // private void initialiserTableauDeCase(int hauteur, int largeur){ }

    // Ou avec des liste (voir l énoncé de l atelier 6 dans Classe VGrille)


    private void initialiserColonnes (int largeur) {
        colonnesDeCases = new ArrayList<>();
        for (int i = 0; i < largeur; i++){
            colonnesDeCases.add(new Colonne());
        }
    }


    private void ajouterEnTetes(int largeur){
        VEntete entete = new VEntete(super.getContext());
        entetes = new ArrayList<>();
        for(int i = 0; i < largeur; i++){
            entetes.add(i, entete);

        }
    }

    //TODO
    private GridLayout.LayoutParams getMiseEnPageEntete(int colonne){

    }
    //TODO
    private void ajouterCase(int hauteur, int largeur){

    }
    //TODO
    private GridLayout.LayoutParams getMiseEnPageCase(int rangee, int colonne){

    }
}
