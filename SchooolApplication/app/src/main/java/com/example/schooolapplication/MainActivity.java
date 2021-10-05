package com.example.schooolapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // inisialisasi recycle view, adapter, array list
    private RecyclerView recyclerView;
    private SchoolAdapter schoolAdapter;
    private ArrayList<School> schoolArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // memanggil method addData untuk menambahkan data pada list
        addData();
        // akses recycle view
        recyclerView = findViewById(R.id.recycle_view);
        // menggabungkan tampilan school item dengan main view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        // menambah list pada adapter
        schoolAdapter = new SchoolAdapter(schoolArrayList);
        recyclerView.setAdapter(schoolAdapter);
    }
    // function untuk menambah data pada list
    private void addData() {
        schoolArrayList = new ArrayList<>();
        schoolArrayList.add(new School("SMPN 1 Karang Rejo", "Karang Rejo", "21-12-2012", R.mipmap.sekolah1));
        schoolArrayList.add(new School("SMPN 2 Gending", "Gending", "21-12-2012", R.mipmap.sekolah2));
        schoolArrayList.add(new School("SMPN 1 Jember", "Jember", "21-12-2012", R.mipmap.sekolah3));
        schoolArrayList.add(new School("SMPN 3 Jakarta Selatan", "Jakarta Selatan", "21-12-2012", R.mipmap.sekolah4));
    }
}