package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    public void goPrimeira(View view){
        Intent messageIntent = new Intent(this, MainActivity.class);
        startActivity(messageIntent);
    }

    public void goTerceira(View view){
        Intent messageIntent = new Intent(this, Terceira.class);
        startActivity(messageIntent);
    }
}
