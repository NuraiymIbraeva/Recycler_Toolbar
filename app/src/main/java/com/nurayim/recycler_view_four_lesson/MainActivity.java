package com.nurayim.recycler_view_four_lesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    RecyclerView recyclerView;
    MainAdapter adapter;
    ArrayList<ItemModel> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.rv_first);


        list = new ArrayList<>();

        list.add(new ItemModel("1","ttitle","desc","2012"));
        list.add(new ItemModel("2","ttitle","desc","2013"));
        list.add(new ItemModel("3","ttitle","desc","2014"));
        list.add(new ItemModel("4","ttitle","desc","2015"));

//        adapter.addText(list);
        adapter = new MainAdapter(list);
        recyclerView.setAdapter(adapter);



       RecyclerView.LayoutManager l = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

       recyclerView.setLayoutManager(l);







    }
}