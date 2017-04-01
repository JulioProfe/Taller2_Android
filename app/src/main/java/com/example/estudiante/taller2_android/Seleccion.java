package com.example.estudiante.taller2_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Seleccion extends AppCompatActivity {

    public ImageButton botin, botindos, botintres;
    private static String GROUP;
    private boolean estado, estadodos, estadotres, cambio;

    public void yay(){
        botin = (ImageButton) findViewById(R.id.botin);
        botindos = (ImageButton) findViewById(R.id.botindos);
        botintres = (ImageButton) findViewById(R.id.botintres);
        GROUP = Comunicacion.getInstance().getGROUP_ADDRESS();

        botin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                estado = false;


                Comunicacion.getInstance().enviar(new Personaje(1, 100, 100), GROUP);
            }

        });

        botindos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                estadodos = false;
                Comunicacion.getInstance().enviar(new Personaje(2, 100, 100), GROUP);
            }
        });

        botintres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                estadotres = false;
                Comunicacion.getInstance().enviar(new Personaje(3, 100, 100), GROUP);
            }
        });

        if (estado == false && estadodos == false && estadotres == false)
            cambio = true;

        if (cambio == true){
            Intent intentico = new Intent(Seleccion.this, Control.class);
            startActivity(intentico);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_seleccion);

        yay();
    }
}
