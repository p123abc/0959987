package ca.cours5b5.patrickpapineau.activites;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import ca.cours5b5.patrickpapineau.R;

public class AMenuPrincipal extends Activite {

    static{
        Log.d("Atelier04", AMenuPrincipal.class.getSimpleName() + "::static");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // FIXME: c'est temporaire, ça va dans une action (MVC)
        Button bouton = this.findViewById(R.id.button);
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transitionParametres();
            }
        });
        Button bouton2 = this.findViewById(R.id.button2);
        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transitionPartie();
            }
        });
    }

    private void transitionParametres(){
        Intent intentionParametres = new Intent(this, AParametres.class);
        startActivity(intentionParametres);
    }

    private void transitionPartie(){
        Intent intentionPartie = new Intent(this, APartie.class);
        startActivity(intentionPartie);
    }

}
