package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class menu3 extends AppCompatActivity {

    private RecyclerView myRecyclerview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);


        myRecyclerview =(RecyclerView)findViewById(R.id.contactlist);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        myRecyclerview.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView

        //Create List
        ArrayList<contac> mContact=new ArrayList<>();

        mContact.add(new com.example.madd.contac("golddust mirror frames"
                ,R.drawable.ha1));
        mContact.add(new com.example.madd.contac("silver decor shimmer",R.drawable.k2));
        mContact.add(new com.example.madd.contac("visibla book shelf",R.drawable.ha3));
        mContact.add(new com.example.madd.contac("white book stand",R.drawable.ha4));
        mContact.add(new com.example.madd.contac("white sofa dining table",R.drawable.ha5));
        mContact.add(new com.example.madd.contac("Snow dinner set",R.drawable.ha6));
        mContact.add(new com.example.madd.contac("Signature snow vases",R.drawable.ha7));
        mContact.add(new com.example.madd.contac("paris mirror and slab",R.drawable.k8));
        mContact.add(new com.example.madd.contac("smoke style lamp",R.drawable.ha10));

        RecyclerViewAdapter adapter=new RecyclerViewAdapter( mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
