package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class menu8 extends AppCompatActivity {

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

        mContact.add(new com.example.madd.contac("office luxure",R.drawable.oaa1));
        mContact.add(new com.example.madd.contac("Ldesk purge",R.drawable.oaa2));
        mContact.add(new com.example.madd.contac("reception desk",R.drawable.oaa3));
        mContact.add(new com.example.madd.contac("stationery holder",R.drawable.oaa4));
        mContact.add(new com.example.madd.contac("cabinet divider",R.drawable.oaa5));
        mContact.add(new com.example.madd.contac("cabinetdesk",R.drawable.oaa6));
        mContact.add(new com.example.madd.contac(" ovaldesk holder",R.drawable.oaa7));
        mContact.add(new com.example.madd.contac("beige roller",R.drawable.oaa8));
        mContact.add(new com.example.madd.contac("black shelfes",R.drawable.oaa9));
        mContact.add(new com.example.madd.contac("snowy library",R.drawable.oaa10));
        RecyclerViewAdapter adapter=new RecyclerViewAdapter( mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
