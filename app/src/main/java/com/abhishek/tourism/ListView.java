package com.abhishek.tourism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {
    RecyclerView.Adapter madapter;
    RecyclerView.LayoutManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        RecyclerView rcView=findViewById(R.id.recylerview);
        rcView.setHasFixedSize(true);
        Intent i=getIntent();
        Bundle args=i.getBundleExtra("places1");
        ArrayList<Place> places=(ArrayList<Place>)args.getSerializable("places");
        ArrayList<Place> p1s=new ArrayList<>();
        Place p1=new Place("Niagara",100,R.drawable.niagara);
        Place p2=new Place("CN Tower",30,R.drawable.cntower);
        Place p3=new Place("The Butchart Gardens",30,R.drawable.btchartgardens);
        p1s.add(p1);
        p1s.add(p2);
        p1s.add(p3);
        manager=new LinearLayoutManager(this);
        madapter=new PlaceAdapter(places);
        rcView.setLayoutManager(manager);
        rcView.setAdapter(madapter);


    }
}