package com.example.showroomrecyclerview_a187991;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.showroomrecyclerview_a187991.adapter.ShowroomRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyler_view);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        List<Showroom> allShowroomInfo = getAllShowroomInfo();

        ShowroomRecyclerViewAdapter showroomRecyclerViewAdapter = new ShowroomRecyclerViewAdapter(MainActivity.this, allShowroomInfo);
        recyclerView.setAdapter(showroomRecyclerViewAdapter);

    }

    private List<Showroom> getAllShowroomInfo()
    {
        List<Showroom> allShowroom = new ArrayList<Showroom>();

        allShowroom.add(new Showroom("Accord", R.drawable.accord));
        allShowroom.add(new Showroom("Civic", R.drawable.civic));
        allShowroom.add(new Showroom("CRV", R.drawable.crv));

        allShowroom.add(new Showroom("HRV", R.drawable.hrv));
        allShowroom.add(new Showroom("Jazz", R.drawable.jazz));
        allShowroom.add(new Showroom("Africa Twin", R.drawable.africa_twin));

        allShowroom.add(new Showroom("Benly", R.drawable.benly));
        allShowroom.add(new Showroom("Fireblade", R.drawable.fireblade));
        allShowroom.add(new Showroom("Gold Wing Tour", R.drawable.gold_wing_tour));

        allShowroom.add(new Showroom("Super Cub C125", R.drawable.super_cub_c125));
        allShowroom.add(new Showroom("X ADV", R.drawable.x_adv));

        return allShowroom;
    }
}