package ca.cours5b5.patrickpapineau;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Parametres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametres);
        Log.d("MonEtiquette",this.getResources().getString(R.string.IDENTIFIANT)+" "+this.getResources().getString(R.string.ORIENTATION));
    }
}
