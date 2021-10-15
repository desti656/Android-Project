package com.example.keludapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailCollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_collection);

        ImageView imageView = findViewById(R.id.btn_back);
        ImageView img_detail_collection_image = findViewById(R.id.img_detail_collection_image);
        TextView txt_detail_collection_name = findViewById(R.id.txt_detail_collection_name);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            txt_detail_collection_name.setText(bundle.getString("collection_name"));
            img_detail_collection_image.setImageResource(bundle.getInt("collection_image"));
        }

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
    }

    private void back() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}