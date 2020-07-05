package com.example.madd.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.madd.R;
import com.example.madd.menu8;
import com.example.madd.signup;


public class HomeFragment extends Fragment {

    ViewPager viewPager;
    PagerAdapter Adapter;

    int images[] = {R.drawable.h111, R.drawable.h222, R.drawable.mh223};

    int currentPageCunter = 0;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home,
                container, false);

        viewPager = (ViewPager) view.findViewById(R.id.myviewpager);

        PagerAdapter Adapter = new CustomAdapter( images,getContext(),HomeFragment.class);
        viewPager.setAdapter(Adapter);
        Button button4 = (Button) view.findViewById(R.id.signin);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(getContext(), signup.class);
                startActivity(i5);
            }


        });


        return view;

    }

}
