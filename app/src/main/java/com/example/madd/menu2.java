package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class menu2 extends AppCompatActivity {

    private RecyclerView myRecyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);


        myRecyclerview =(RecyclerView)findViewById(R.id.contactlist);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        myRecyclerview.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView


        ArrayList<com.example.madd.contac> mContact=new ArrayList<>();

        mContact.add(new com.example.madd.contac("Ivory Cushioned Set",R.drawable.l1));
        mContact.add(new com.example.madd.contac("Charcoal Sofa Set",R.drawable.l2));
        mContact.add(new com.example.madd.contac("Babepink Sofa Set",R.drawable.l3));
        mContact.add(new com.example.madd.contac("slategray Sofa Set",R.drawable.l4));
        mContact.add(new com.example.madd.contac("Ivory Recliner",R.drawable.l5));
        mContact.add(new com.example.madd.contac("Mocha Sofa Set",R.drawable.l6));
        mContact.add(new com.example.madd.contac("Mist Rose love seat",R.drawable.l7));
        mContact.add(new com.example.madd.contac("Cream LoveSofa",R.drawable.l8));
        mContact.add(new com.example.madd.contac("oval Snowwhite seat",R.drawable.l9));
        RecyclerViewAdapter adapter=new RecyclerViewAdapter( mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}
