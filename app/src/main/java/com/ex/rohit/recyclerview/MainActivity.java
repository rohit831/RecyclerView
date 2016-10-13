package com.ex.rohit.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    String[] project = {"India","Japan","Kazakhstan","Greece","Columbia","Canada","Austria","France","Jamaica","kenya","Libya","Kuwait","Jordan","Switzerland","Phillipines","Pakistan"};
    String[] member = {"New Delhi","Tokyo","Astana","Athens","bogota","Ottowa","Vienna","Paris","Kingston","Nairobi","Tripoli","Kuwait City","Amman","Bern","Manilla","Islamabad"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new RecyclerAdapter(project, member);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}