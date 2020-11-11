package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static int VALOR_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null){
            int contador = extras.getInt("contador");

            TextView view = findViewById(R.id.textViewMain);
            view.setText(""+contador);
        }
    }

    public void goSegunda(View view){

        Intent intent = new Intent(this, Segunda.class);

        Bundle extras = new Bundle();
        extras.putInt("contador", 1);

        intent.putExtras(extras);

        startActivity(intent);
    }

    public void goTerceira(View view){

        Intent messageIntent = new Intent(this, Terceira.class);
        startActivityForResult(messageIntent, VALOR_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == VALOR_REQUEST){
            if(resultCode == RESULT_OK){
               Bundle extras = data.getExtras();
                String valor = extras.getString("contador");

                TextView view = findViewById(R.id.textViewMain);
                view.setText("" + valor);
            }
        }
    }
}
