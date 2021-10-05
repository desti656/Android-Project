package com.example.e41200036_task_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Membuat data list mahasiswa
    String[] data_mahasiswa = {"Desti", "Jhon", "Miracle", "Thariks", "Andi", "Putri", "Lemonia", "Sugandi"};
//    Membuat komponen list view
    ListView listView;

//    Membuat data buah buahan
    String[] data_buah = {"Apple", "Mango", "Pinnaple", "Banana", "Chery"};
//    Membuat komponen spinner
    Spinner spinner;

//    Membuat data artis KPOP
    String[] data_artis = {"Lisa Blackbird", "Jeni Blackcurrent", "Jim Samsudin", "Kim Jong Unch"};
//  Membuat komponen autocomplete
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // List View
        listView = findViewById(R.id.list_data_mahasiswa);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, data_mahasiswa);

        // Spinner
        spinner = findViewById(R.id.spinner_data_buah);
        ArrayAdapter adapterSpinner = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, data_buah);

        // AutocompletetextView
        autoCompleteTextView = findViewById(R.id.autoComplete_artis_kpop);
        ArrayAdapter adapterAutoComplete = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, data_artis);

        // set adapter list view
        listView.setAdapter(adapter);
        // set adapter spinnner
        spinner.setAdapter(adapterSpinner);
        // set AutoComplete
        autoCompleteTextView.setAdapter(adapterAutoComplete);

        // menambahkan event click pada list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Kamu menekan data: " + adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });
        // menambah event selected pada spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Kamu memilih: " + adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        // menambah event click pada auto complete text view
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Artis ini: " + adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}