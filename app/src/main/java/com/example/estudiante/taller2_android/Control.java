package com.example.estudiante.taller2_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

public class Control extends AppCompatActivity implements Observer{

    private static String GROUP;
    private ImageButton plaga, crack, planta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_control);
        plaga = (ImageButton) findViewById(R.id.plaga);
        planta = (ImageButton) findViewById(R.id.planta);
        crack = (ImageButton) findViewById(R.id.crack);

        Comunicacion.getInstance().addObserver(this);

        GROUP = Comunicacion.getInstance().getGROUP_ADDRESS();

        plaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Comunicacion.getInstance().enviar(new Plaga((int) Math.random()*10, (int) Math.random()*10, 2), GROUP);
            }
        });

        planta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Comunicacion.getInstance().enviar(new Weed((int) Math.random()*10, (int) Math.random()*10, 1), GROUP);
            }
        });
        crack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Comunicacion.getInstance().enviar(new Bonk((int) Math.random()*10, (int) Math.random()*10, 3), GROUP);
            }
        });
    }

    @Override
    public void update(Observable observable, Object o) {
        if (o instanceof Resultado){
            Resultado resultados = (Resultado) o;
            updateUI(resultados);
        }
    }

    public void updateUI(final Resultado change) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                TextView llego = (TextView) findViewById(R.id.llego);
                llego.setText(llego.getText().toString() + change + "\n");
            }
        });
    }
}
