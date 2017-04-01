package com.example.estudiante.taller2_android;

import java.io.Serializable;

/**
 * Created by estudiante on 01/04/17.
 */

public class MessageSerial implements Serializable {

    public int emisor, receptor;
    public String data;

    public MessageSerial(int emisor, int receptor, String data){
        this.emisor = emisor;
        this.receptor = receptor;
        this.data = data;
    }

    public int getEmisor() {
        return emisor;
    }

    public int getReceptor() {
        return receptor;
    }

    public String getData() {
        return data;
    }

    public void setEmisor(int emisor) {
        this.emisor = emisor;
    }

    public void setReceptor(int receptor) {
        this.receptor = receptor;
    }

    public void setData(String data) {
        this.data = data;
    }
}
