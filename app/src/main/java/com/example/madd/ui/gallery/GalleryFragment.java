package com.example.madd.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.madd.R;
import com.example.madd.menu;
import com.example.madd.menu2;
import com.example.madd.menu3;
import com.example.madd.menu4;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery,
                container, false);
        View view1 = inflater.inflate(R.layout.fragment_gallery,
                container, false);
        Button button = (Button) view.findViewById(R.id.button);
        Button button3 = (Button) view.findViewById(R.id.button1);
        Button button2 = (Button) view.findViewById(R.id.button2);
        Button button4 = (Button) view.findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getContext(), menu.class);
                startActivity(i2);
            }


        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getContext(), menu2.class);
                startActivity(i3);
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getContext(), menu4.class);
                startActivity(i3);
            }


        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getContext(), menu3.class);
                startActivity(i3);
            }


        });
        return view;
    }
}