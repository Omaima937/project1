package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Decoraters extends AppCompatActivity {

    private String imagename;
    private int imageno;

    //Constructor

    public Decoraters(String imagename, int imageno) {
        this.imagename = imagename;
        this.imageno = imageno;
    }

    //Getter


    public String getImagename() {
        return imagename;
    }

    public int getImageno() {
        return imageno;
    }


    //Setter


    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public void setImageno(int imageno) {
        this.imageno = imageno;
    }
}
