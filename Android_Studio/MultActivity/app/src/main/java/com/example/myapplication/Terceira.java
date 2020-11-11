package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Terceira extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
    }

   /* public void goPrimeira(View view){
        Intent retorno = new Intent(this, MainActivity.class);
        retorno.putExtra("contador", 1);

        setResult(RESULT_OK, retorno);
        finish();
    }*/

   /*
    public void goSegunda(View view){
        Intent retorno = new Intent(this, MainActivity.class);

        Bundle extras = new Bundle();
        extras.putInt("contador", 2);

        retorno.putExtras(extras);

        setResult(RESULT_OK, retorno);
        finish();
    }*/

    public void voltar(View view){
        Intent retorno = new Intent(this, MainActivity.class);

        Bundle extras = new Bundle();

        Button b = (Button) view;
        String rotulo = b.getText().toString();

        extras.putString("contador", rotulo);
        retorno.putExtras(extras);

        setResult(RESULT_OK, retorno);
        finish();
    }
}
