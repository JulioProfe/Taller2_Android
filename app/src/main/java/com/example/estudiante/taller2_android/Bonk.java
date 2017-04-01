package com.example.estudiante.taller2_android;

import java.io.Serializable;

/**
 * Created by estudiante on 01/04/17.
 */

public class Bonk implements Serializable {
    private int x, y, id;

    public Bonk(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

}
