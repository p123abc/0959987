package ca.cours5b5.patrickpapineau.vues;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import ca.cours5b5.patrickpapineau.R;

public class VParametres extends ConstraintLayout{

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

        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this.getContext(), R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<Integer> adapterPG = new ArrayAdapter<>(this.getContext(), R.layout.support_simple_spinner_dropdown_item);

        spinnerHauteur.setAdapter(adapter);
        spinnerLargeur.setAdapter(adapter);
        spinnerPourGagnier.setAdapter(adapterPG);

        for (int i = 4; i<11; i++){
            adapter.add(i);
        }

        adapterPG.add(3);
        adapterPG.add(4);

        spinnerHauteur.setSelection(2);
        spinnerLargeur.setSelection(3);
        spinnerPourGagnier.setSelection(1);



    }
}
