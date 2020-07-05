package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class menu extends AppCompatActivity {



    private RecyclerView myRecyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        myRecyclerview =(RecyclerView)findViewById(R.id.contactlist);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        myRecyclerview.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView




        //Create List
        ArrayList<com.example.madd.contac> mContact=new ArrayList<>();



        mContact.add(new com.example.madd.contac("Mocha Bedset",R.drawable.m1));
        mContact.add(new com.example.madd.contac("Fairbon Bedset",R.drawable.m2));
        mContact.add(new com.example.madd.contac("Smokey Grey Bedset",R.drawable.m3));
        mContact.add(new com.example.madd.contac("Lush Navy Bedset",R.drawable.m4));
        mContact.add(new com.example.madd.contac("Smokey Black Bedset",R.drawable.m5));
        mContact.add(new com.example.madd.contac("Cream Italian Bedset",R.drawable.m6));
        mContact.add(new com.example.madd.contac("Blush Pink Bedset",R.drawable.m7));
        mContact.add(new com.example.madd.contac("Navy Bunk Bedset",R.drawable.m8));
        mContact.add(new com.example.madd.contac("Bique Bed Bedset",R.drawable.m9));
        mContact.add(new com.example.madd.contac("Coffee Shade Bedset",R.drawable.m10));

        RecyclerViewAdapter adapter=new RecyclerViewAdapter( mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
