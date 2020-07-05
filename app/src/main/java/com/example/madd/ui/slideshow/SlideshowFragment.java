package com.example.madd.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.madd.R;
import com.example.madd.menu;
import com.example.madd.menu5;
import com.example.madd.menu6;
import com.example.madd.menu7;
import com.example.madd.menu8;
import com.example.madd.ui.share.ShareViewModel;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slideshow,
                container, false);
        View view1 = inflater.inflate(R.layout.fragment_slideshow,
                container, false);
        Button button = (Button) view.findViewById(R.id.oe1);
        Button button3 = (Button) view.findViewById(R.id.oe2);
        Button button2 = (Button) view.findViewById(R.id.oe3);
        Button button4 = (Button) view.findViewById(R.id.oe4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getContext(), menu6.class);
                startActivity(i2);
            }


        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getContext(), menu7.class);
                startActivity(i3);
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(getContext(), menu5.class);
                startActivity(i4);
            }


        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(getContext(), menu8.class);
                startActivity(i5);
            }


        });


        return view;
    }
}