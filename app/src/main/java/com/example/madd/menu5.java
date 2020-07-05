
package com.example.madd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class menu5 extends AppCompatActivity {
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

        mContact.add(new com.example.madd.contac("pimpkin white set" ,R.drawable.cf1));
        mContact.add(new com.example.madd.contac("feather coffe bar",R.drawable.cf2));
        mContact.add(new com.example.madd.contac("stansill chair bar",R.drawable.cf3));
        mContact.add(new com.example.madd.contac("office aesthitic",R.drawable.cf4));
        mContact.add(new com.example.madd.contac("coffe tea set",R.drawable.cf5));
        mContact.add(new com.example.madd.contac("painter backdrop",R.drawable.cf6));
        mContact.add(new com.example.madd.contac("coffe bar sitting",R.drawable.cf7));
        mContact.add(new com.example.madd.contac("motivation in coffee",R.drawable.cf8));
        mContact.add(new com.example.madd.contac("bar staples",R.drawable.cf9));
        mContact.add(new com.example.madd.contac("earth high couches",R.drawable.cf10));
        RecyclerViewAdapter adapter=new RecyclerViewAdapter( mContact);
        myRecyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
