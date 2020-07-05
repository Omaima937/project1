package com.example.madd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DecoratorsRecycleView extends RecyclerView.Adapter<DecoratorsRecycleView.MyViewHolder>
{
    private Context mContext;
    private List<Decoraters> mData;
    private static RecyclerViewClickListener listener;

    public DecoratorsRecycleView(Context mContext, List<Decoraters> mData, RecyclerViewClickListener listener) {
        this.mContext = mContext;
        this.mData = mData;
        this.listener=listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.activity_decoraters,parent,false);
        DecoratorsRecycleView.MyViewHolder vHolder=new DecoratorsRecycleView.MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        holder.imagena.setText(mData.get(position).getImagename());
        holder.imagenu.setImageResource(mData.get(position).getImageno());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private LinearLayout itemdecorators;
        private TextView imagena;
        private ImageView imagenu;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            itemdecorators=(LinearLayout)itemView.findViewById(R.id.decorators);
            imagena=(TextView)itemView.findViewById(R.id.imagename);
            imagenu=(ImageView)itemView.findViewById(R.id.img1);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {

            //listener.onClick(itemView,getAdapterPosition());
            int position=getAdapterPosition();
            Toast.makeText(mContext,"Position"+position ,Toast.LENGTH_SHORT).show();
            if(position==0)
            {
                Intent intent1=new Intent(mContext,joanaganies.class);
                mContext.startActivity(intent1);
            }
            else if(position==1)
            {
                Intent intent2=new Intent(mContext,Profile.class);
                mContext.startActivity(intent2);
            }

        }
    }
}
