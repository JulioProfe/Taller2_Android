package com.example.estudiante.taller2_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity{

   public ImageButton instr;
    public ImageButton jugar;

    public void cambio(){
        instr = (ImageButton) findViewById(R.id.instr);
        jugar = (ImageButton) findViewById(R.id.jugar);


        instr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent instruccion = new Intent(MainActivity.this, Instrucciones.class);
                startActivity(instruccion);
            }
        });

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent juego = new Intent(MainActivity.this, Seleccion.class);
                startActivity(juego);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        cambio();

    }
}
