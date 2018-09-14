package ca.cours5b5.patrickpapineau.activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import ca.cours5b5.patrickpapineau.R;

public class AMenuPrincipal extends Activite {

    /*static {
        Class metaDonnees = AMenuPrincipal.class;
        Log.d(metaDonnees.class.getSimpleName());
    }*/
    // comment pour test si j suis sa branche temps


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenuprincipal);
        Log.d("MonEtiquette",this.getResources().getString(R.string.IDENTIFIANT)+" "+this.getResources().getString(R.string.ORIENTATION));
        Log.d("testActivite", "testCreate");
        // ICI EST-CE QUE LA VUE EST CRÉÉE??

    }


    @Override
    protected void onResume() {
        super.onResume();

        // ICI LA VUE EXISTE

        Log.d("testActivite", "testResume");

        Button buttonParametres = this.findViewById(R.id.button_AParametres);

        buttonParametres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                transitionVersParametres();
            }

        });

    }

    private void transitionVersParametres() {
        Intent monIntention = new Intent(this, AParametres.class);
        this.startActivity(monIntention);
    }

}
