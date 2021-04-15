package com.nurayim.recycler_view_four_lesson;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter  extends RecyclerView.Adapter<MainViewHolder> {


    ArrayList<ItemModel> data;

    public MainAdapter(ArrayList<ItemModel> list) {
        data = list;
        notifyDataSetChanged();
    }


    public  void addText(ArrayList<ItemModel> list){
        data = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
         holder.onBind(data.get(position));
    }


    @Override
    public int getItemCount() {
        return  data.size();
    }
}
