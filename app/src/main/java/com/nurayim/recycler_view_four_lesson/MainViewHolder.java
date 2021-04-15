package com.nurayim.recycler_view_four_lesson;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView item_count_text;
    TextView item_title;
    TextView item_description_text;
    TextView item_data_text;


    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        item_count_text = itemView.findViewById(R.id.item_count_text);
        item_title = itemView.findViewById(R.id.item_title);
        item_description_text = itemView.findViewById(R.id.item_description_text);
        item_data_text = itemView.findViewById(R.id.item_data_text);


    }

    public void onBind(ItemModel itemModel) {
        item_count_text.setText(itemModel.getNumber());
        item_title.setText(itemModel.getTitle());
        item_description_text.setText(itemModel.getDesc());
        item_data_text.setText(itemModel.getData());

    }
}
