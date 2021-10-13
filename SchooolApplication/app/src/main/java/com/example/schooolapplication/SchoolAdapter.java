package com.example.schooolapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.SchoolViewHolder> {

    // List untuk menampung data yang dikirim
    private ArrayList<School> schoolArrayList;

    public SchoolAdapter(ArrayList<School> schoolArrayList) {
        this.schoolArrayList = schoolArrayList;
    }

    @NonNull
    @Override
    public SchoolAdapter.SchoolViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // menempel layout adapter dengan template item
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.school_item, parent, false);
        return new SchoolViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolAdapter.SchoolViewHolder holder, int position) {
        // menempel variable adapter dengan template item
        holder.txt_school_name.setText(schoolArrayList.get(position).getTxt_school_name());
        holder.txt_location.setText(schoolArrayList.get(position).getTxt_location());
        holder.txt_date_created.setText(schoolArrayList.get(position).getTxt_date_created());
        holder.profile_image.setImageResource(schoolArrayList.get(position).getProfile_image());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "This is school: " + schoolArrayList.get(position).getTxt_school_name(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        // melakukan perulangan pada item
        return (schoolArrayList != null) ? schoolArrayList.size() : 0;
    }

    public class SchoolViewHolder extends RecyclerView.ViewHolder {
        // Variabel untuk menampung nilai yang dikirim dari model
        private TextView txt_school_name, txt_location, txt_date_created;
        private ImageView profile_image;

        public SchoolViewHolder(@NonNull View itemView) {
            super(itemView);
            // set nilai yang dikirim dari model ke variable adapter
            txt_school_name = itemView.findViewById(R.id.txt_school_name);
            txt_location = itemView.findViewById(R.id.txt_location);
            txt_date_created = itemView.findViewById(R.id.txt_date_created);
            profile_image = itemView.findViewById(R.id.profile_image);
        }
    }
}
