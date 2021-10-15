package com.example.keludapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewCollection;
    private CollectionAdapter collectionAdapter;
    private ArrayList<Collection> collections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addItemCollection();
        recyclerViewCollection = findViewById(R.id.recycler_view_collection);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCollection.setLayoutManager(layoutManager);
        collectionAdapter = new CollectionAdapter(collections);
        recyclerViewCollection.setAdapter(collectionAdapter);

        TextView txt_author = findViewById(R.id.txt_author);
        txt_author.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cafe_kelud_jember/"));
                startActivity(intent);
            }
        });
    }

    private void addItemCollection() {
        collections = new ArrayList<>();
        collections.add(new Collection("Dinner", 25, R.mipmap.food1));
        collections.add(new Collection("Sneak Time", 10, R.mipmap.food2));
        collections.add(new Collection("Breakfast", 12, R.mipmap.food3));
    }
}