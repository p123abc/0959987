package ca.cours5b5.patrickpapineau.vues;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import ca.cours5b5.patrickpapineau.R;
import ca.cours5b5.patrickpapineau.global.GConstantes;

public class VParametres extends Vue{

    public VParametres(Context context) {
        super(context);
    }

    public VParametres(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VParametres(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onFinishInflate(){
        super.onFinishInflate();

        Spinner spinnerHauteur = this.findViewById(R.id.spinnerHauteur);
        Spinner spinnerLargeur = this.findViewById(R.id.spinnerLargeur);
        Spinner spinnerPourGagnier = this.findViewById(R.id.spinnerPourGagnier);

        ArrayAdapter<Integer> adapterHauteur = new ArrayAdapter<>(this.getContext(), R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<Integer> adapterLargeur = new ArrayAdapter<>(this.getContext(), R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<Integer> adapterPG = new ArrayAdapter<>(this.getContext(), R.layout.support_simple_spinner_dropdown_item);

        spinnerHauteur.setAdapter(adapterHauteur);
        spinnerLargeur.setAdapter(adapterLargeur);
        spinnerPourGagnier.setAdapter(adapterPG);

        for (int i = GConstantes.HMIN; i<=GConstantes.HMAX; i++){
            adapterHauteur.add(i);
        }

        for (int i = GConstantes.LMIN; i<=GConstantes.LMAX; i++){
            adapterLargeur.add(i);
        }

        for (int i = GConstantes.PGMIN; i<=GConstantes.PGMAX; i++){
            adapterPG.add(i);
        }

        spinnerHauteur.setSelection(GConstantes.HD);
        spinnerLargeur.setSelection(GConstantes.LD);
        spinnerPourGagnier.setSelection(GConstantes.PGD);



    }
}
