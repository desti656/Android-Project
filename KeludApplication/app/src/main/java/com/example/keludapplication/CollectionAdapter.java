package com.example.keludapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CollectionAdapter extends RecyclerView.Adapter<CollectionAdapter.CollectionViewHolder> {
    private ArrayList<Collection> collections;

    public CollectionAdapter(ArrayList<Collection> collections) {
        this.collections = collections;
    }

    @NonNull
    @Override
    public CollectionAdapter.CollectionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.collection_item, parent, false);
        return new CollectionViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull CollectionAdapter.CollectionViewHolder holder, int position) {
        holder.txt_collection_name.setText(collections.get(position).getCollection_name());
        holder.txt_restaurant_count.setText(String.valueOf(collections.get(position).getRestaurant_count()) + " Restaurant");
        holder.img_collection_image.setImageResource(collections.get(position).getRestaurant_image());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, DetailCollectionActivity.class);
                intent.putExtra("collection_name", collections.get(position).getCollection_name());
                intent.putExtra("collection_image", collections.get(position).getRestaurant_image());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (collections != null) ? collections.size() : 0;
    }

    public static class CollectionViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_restaurant_count, txt_collection_name;
        private ImageView img_collection_image;

        public CollectionViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_collection_name = itemView.findViewById(R.id.txt_collection_name);
            txt_restaurant_count = itemView.findViewById(R.id.txt_restaurant_count);
            img_collection_image = itemView.findViewById(R.id.img_collection_image);
        }
    }
}
