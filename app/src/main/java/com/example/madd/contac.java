package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.ArrayList;
public class contac extends AppCompatActivity {


        private String cname;
        private int cimg;

        public contac(String name, int img) {
            this.cname = name;
            this.cimg = img;
        }

        //Getter

        public String getName()
        {
            return cname;
        }

        public int getImg()

        {
            return cimg;
        }

        //Setter

        public void setName(String name)

        {
            this.cname = name;
        }

        public void setImg(int img)
        {
            this.cimg = img;
        }
    }

