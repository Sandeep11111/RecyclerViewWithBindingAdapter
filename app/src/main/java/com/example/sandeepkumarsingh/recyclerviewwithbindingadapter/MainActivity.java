package com.example.sandeepkumarsingh.recyclerviewwithbindingadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new RecyclerViewAdapter(this, getData()));
    }

    private ArrayList<SportViewModel> getData() {
        ArrayList<SportViewModel> data = new ArrayList<>();
        SportViewModel model = new SportViewModel();
        model.sportName = "Football";
        model.imgSrcId.set(R.drawable.ic_launcher_foreground);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "Cricket";
        model.imgSrcId.set(R.drawable.ic_launcher_foreground);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "Hockey";
        model.imgSrcId.set(R.drawable.ic_launcher_foreground);
        data.add(model);

        model = new SportViewModel();
        model.sportName = "Badminton";
        model.imgSrcId.set(R.drawable.ic_launcher_foreground);
        data.add(model);

        return data;
    }
}
