package com.example.estudiante.taller2_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Instrucciones extends AppCompatActivity {

    public ImageButton jugarI;


    public void cambioI(){
        jugarI = (ImageButton) findViewById(R.id.jugarI);
        jugarI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jugarIn = new Intent(Instrucciones.this, Seleccion.class);
                startActivity(jugarIn);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_instrucciones);

        cambioI();
    }
}
