package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class menu4 extends AppCompatActivity {
    private RecyclerView myRecyclerview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);


        myRecyclerview =(RecyclerView)findViewById(R.id.contactlist);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        myRecyclerview.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView

        //Create List
        ArrayList<com.example.madd.contac> mContact=new ArrayList<>();

        mContact.add(new com.example.madd.contac("mocha kitchen cabinet" ,R.drawable.k1));
        mContact.add(new com.example.madd.contac("White kitchen cabinet",R.drawable.k2));
        mContact.add(new com.example.madd.contac("coca monochrome cabinet",R.drawable.k3));
        mContact.add(new com.example.madd.contac("pastel nudegreen cabinet",R.drawable.k4));
        mContact.add(new com.example.madd.contac("expresso bazel cabinet",R.drawable.k5));
        mContact.add(new com.example.madd.contac("italian lavish cabinet",R.drawable.k6));
        mContact.add(new com.example.madd.contac("italian lavish cabinet",R.drawable.k7));
        mContact.add(new com.example.madd.contac("white lavish cabinet",R.drawable.k8));
        mContact.add(new com.example.madd.contac("plum lurve cabinet",R.drawable.k9));
        mContact.add(new com.example.madd.contac("ombre nude cabinet set",R.drawable.k10));

        RecyclerViewAdapter adapter=new RecyclerViewAdapter( mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
