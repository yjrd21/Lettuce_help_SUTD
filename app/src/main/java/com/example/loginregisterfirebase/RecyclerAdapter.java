package com.example.loginregisterfirebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    //Context is required to inflate the layout
    Context context;

    //ArrayList Holds all the variables required to be displayed
    ArrayList<BoxStatusVariables> BSV;


    public RecyclerAdapter(Context context,ArrayList<BoxStatusVariables> BSV ) {
        this.context=context;
        this.BSV=BSV;
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //This is where we inflate the layout - meaning create a layout for our rows
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.box_status_items,parent,false);
        return new RecyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        //assigning values to the views we created in the recycler_view_row layout file based on the position of the recycler view
        //a.k.a change the data based on the position of the recycler view
        holder.RVA.setText(BSV.get(position).getRVBoxAddress());
        holder.RVPC.setText(BSV.get(position).getRVPostalCode());
        holder.RVBS.setText(BSV.get(position).getRVBoxStatus());
        holder.RVI.setImageResource(BSV.get(position).getRVImage());
    }

    @Override
    public int getItemCount() {
        // the recycler view just wants to know the number of items we want displayed
        return BSV.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //Grab the views  from our recycler_view_row layout file (box_status_items.xml)
        //and assign them variables
        //Similar to onCreate method
        ImageView RVI;
        TextView RVA,RVPC,RVBS;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            RVI = itemView.findViewById(R.id.RVImage);
            RVA= itemView.findViewById(R.id.RVBoxAddress);
            RVPC=itemView.findViewById(R.id.RVPostalCode);
            RVBS=itemView.findViewById(R.id.RVBoxStatus);
        }
    }
}