package com.example.estudiante.taller2_android;

import java.io.Serializable;

/**
 * Created by estudiante on 01/04/17.
 */

public class Resultado implements Serializable {

    public int puntaje;

    public Resultado(int puntaje){
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
