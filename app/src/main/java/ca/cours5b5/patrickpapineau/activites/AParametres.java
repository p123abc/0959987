package ca.cours5b5.patrickpapineau.activites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ca.cours5b5.patrickpapineau.R;

public class AParametres extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametres);
        //Log.d("MonEtiquette",this.getResources().getString(R.string.IDENTIFIANT)+" "+this.getResources().getString(R.string.ORIENTATION));

    }
}
