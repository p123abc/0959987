package ca.cours5b5.patrickpapineau.vues;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import ca.cours5b5.patrickpapineau.R;
import ca.cours5b5.patrickpapineau.activites.AParametres;

public class VMenuPrincipal extends ConstraintLayout {

    public VMenuPrincipal(Context context) {
        super(context);
    }

    public VMenuPrincipal(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public VMenuPrincipal(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onFinishInflate(){
        super.onFinishInflate();

        Button buttonParametres = this.findViewById(R.id.button_AParametres);

        buttonParametres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                 Intent monIntention = new Intent(this, AParametres.class);
                 this.startActivity(monIntention);
            }
        });

    }



}
