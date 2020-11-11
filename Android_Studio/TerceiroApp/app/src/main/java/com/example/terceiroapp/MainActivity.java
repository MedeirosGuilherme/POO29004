package com.example.terceiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String sSharedPrefFile = "com.example.minhaspreferencias";

    private SharedPreferences mSharedPreferences;

    private int mContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mSharedPreferences = getSharedPreferences(sSharedPrefFile, MODE_PRIVATE);


        mContador = mSharedPreferences.getInt("contador",0); //default value = 0

        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);
    }

    public void decrementa(View view) {
        mContador --;

        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);
    }

    public void incrementa(View view) {
        mContador ++;

        TextView textView = findViewById(R.id.contador);
        textView.setText(""+mContador);
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor prefsEditor = mSharedPreferences.edit();

        prefsEditor.putInt("contador",mContador);

        prefsEditor.apply();
    }

    public void limpar(View view) {

        SharedPreferences.Editor prefsEditor = mSharedPreferences.edit();

        prefsEditor.clear();
        prefsEditor.apply();

        mContador = 0;

        TextView textView = findViewById(R.id.contador);
        textView.setText(""+ 0);
    }
}
