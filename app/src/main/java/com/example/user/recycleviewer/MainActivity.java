package com.example.user.recycleviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<Data> listData = new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(listData);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        listData.add(new Data(R.drawable.java,"JAVA"));
        listData.add(new Data(R.drawable.kot,"KOTLIN"));
        listData.add(new Data(R.drawable.py,"PYTHON"));
        listData.add(new Data(R.drawable.html,"HTML"));
        listData.add(new Data(R.drawable.ass,"ANDROID STUDIO"));
        listData.add(new Data(R.drawable.google,"GOOGLE"));
    }
}
