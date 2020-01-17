package com.example.rendu170120;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    //Déclaration des constantes
    private static int NBMAXCAR = 20;
    //déclaration des variables
    private TextView mBonjourText;
    private EditText mEntrerNom;
    private Button mBoutonEntrer;
    private int nbCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //On initialise nos variables
        mBonjourText = (TextView) findViewById(R.id.mainActivity_bonjour_tv);
        mEntrerNom = (EditText) findViewById(R.id.mainActivity_entrerNom_et);
        mBoutonEntrer = (Button) findViewById(R.id.mainActivity_entrer_btn);

        mBoutonEntrer.setEnabled(false);

        //Appel une fonction interragissant avec la zone editable de mEntrerNom
        mEntrerNom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Permet de check si l'EditText est remplis d'au moins 1 caractere. Si c'est le cas, on active le bouton, sinon on le désactive
                mBoutonEntrer.setEnabled(s.toString().length() != 0);

                //change le message et actualise le nb car restant
                nbCar = NBMAXCAR-CharSequence.toString().length();
                mBonjourText.setText("Bonjour! Il vous reste" + nbCar + "lettres.");

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Appel une fonction récupérance le click du bouton
        mBoutonEntrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //L'utilisateur a cliqué sur le bouton

            }
        });

    }





}
