package com.example.contadorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int contador;

    private static final String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.contador = 0;

        if(savedInstanceState != null){
            this.contador = savedInstanceState.getInt("contador");
        }

        TextView mensagem = findViewById(R.id.telaContagem);
        mensagem.setText(this.contador+"");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("contador", this.contador);
    }

    @Override
    protected void onStart() {
        Log.d(tag, "On Start");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.d(tag, "On Stop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(tag, "On Destroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d(tag, "On Pause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d(tag, "On Resume");
        super.onResume();
    }

    public void decrementar(View view) {
        // Decrementar contador
        this.contador -= 1;
        // Colocando mensagem na tela de saida
        TextView mensagem = findViewById(R.id.telaContagem);
        mensagem.setText(this.contador+"");
    }

    public void incrementar(View view) {
        // Incrementar contador
        this.contador += 1;
        // Colocando mensagem na tela de saida
        TextView mensagem = findViewById(R.id.telaContagem);
        mensagem.setText(this.contador+"");
    }

    public void zerar(View view) {
        // Incrementar contador
        this.contador = 0;
        // Colocando mensagem na tela de saida
        TextView mensagem = findViewById(R.id.telaContagem);
        mensagem.setText(this.contador+"");
    }
}
