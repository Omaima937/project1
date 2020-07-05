package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class menu6 extends AppCompatActivity {
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

        mContact.add(new com.example.madd.contac("smokey seattableset"
               ,R.drawable.croom1));
        mContact.add(new com.example.madd.contac("bonjour desk-set",R.drawable.croom2));
        mContact.add(new com.example.madd.contac("thyme beige office set",R.drawable.croom3));
        mContact.add(new com.example.madd.contac("mahagony desk",R.drawable.croom4));
        mContact.add(new com.example.madd.contac("mahagony desk",R.drawable.croom5));
        mContact.add(new com.example.madd.contac("belgium conference table",R.drawable.croom6));
        mContact.add(new com.example.madd.contac("lineage seats",R.drawable.croom7));
        mContact.add(new com.example.madd.contac("slate luxury seats",R.drawable.croom8));
        mContact.add(new com.example.madd.contac("laposh table+seats",R.drawable.croom9));
        mContact.add(new com.example.madd.contac("indian wood desk",R.drawable.croom10));

        RecyclerViewAdapter adapter=new RecyclerViewAdapter( mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
