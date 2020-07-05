package com.example.madd.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.example.madd.MainActivity;
import com.example.madd.R;
import com.example.madd.menu;
import com.example.madd.signup;

public class loginactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        Button b5 = (Button) findViewById(R.id.button4);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(loginactivity.this, forgot.class);
                startActivity(i2);
            }
        });
        Button b6 = (Button) findViewById(R.id.button5);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(loginactivity.this, menu.class);
                startActivity(i3);
            }
        });
    }
}
