package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class menu7 extends AppCompatActivity {

    private RecyclerView myRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);


        myRecyclerview =(RecyclerView)findViewById(R.id.contactlist);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        myRecyclerview.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView

        //Create List
        ArrayList<contac> mContact=new ArrayList<>();

        mContact.add(new com.example.madd.contac("pumpkin couches",R.drawable.ofl1));
        mContact.add(new com.example.madd.contac("mint sofas",R.drawable.ofl2));
        mContact.add(new com.example.madd.contac("criebe lounge set",R.drawable.ofl3));
        mContact.add(new com.example.madd.contac("tonic love couches",R.drawable.ofl4));
        mContact.add(new com.example.madd.contac("porsh posh sofa",R.drawable.ofl5));
        mContact.add(new com.example.madd.contac("Mocha Sofa Set",R.drawable.ofl6));
        mContact.add(new com.example.madd.contac("vouge backless",R.drawable.ofl7));
        mContact.add(new com.example.madd.contac("moon disguise sofa",R.drawable.ofl8));
        mContact.add(new com.example.madd.contac("semi seats and rock beige",R.drawable.ofl9));
        mContact.add(new com.example.madd.contac("beetle nest set",R.drawable.ofl10));

        RecyclerViewAdapter adapter=new RecyclerViewAdapter( mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}
