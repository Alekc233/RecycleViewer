package com.example.user.recycleviewer;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class RecyclerViewHolder extends RecyclerView.ViewHolder{
    public ImageView imageView;
    public TextView txtDescription;

    public RecyclerViewHolder(View itemView){
        super(itemView);
        imageView = (ImageView)itemView.findViewById(R.id.imageView);
        txtDescription = (TextView)itemView.findViewById(R.id.txtDescription);
    }
}

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Data> listData = new ArrayList<Data>();

    public RecyclerViewAdapter(List<Data> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.item,viewGroup,false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder recyclerViewHolder, int i) {
           recyclerViewHolder.imageView.setImageResource(listData.get(i).getImageID());
           recyclerViewHolder.txtDescription.setText(listData.get(i).getDescription());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
