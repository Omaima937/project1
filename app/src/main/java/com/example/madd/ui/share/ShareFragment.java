package com.example.madd.ui.share;

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

public class ShareFragment extends Fragment {

    private ShareViewModel shareViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_share,
                container, false);
        View view1 = inflater.inflate(R.layout.fragment_share,
                container, false);
        Button button = (Button) view.findViewById(R.id.oe1);
        Button button3 = (Button) view.findViewById(R.id.oe2);
        Button button2 = (Button) view.findViewById(R.id.oe3);
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
                Intent i3 = new Intent(getContext(), menu.class);
                startActivity(i3);
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getContext(), menu.class);
                startActivity(i3);
            }


        });


        return view;
    }
}