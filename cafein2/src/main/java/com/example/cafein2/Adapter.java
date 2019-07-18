package com.example.cafein2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.itemViewHolder> {
    private ArrayList<Item> item = new ArrayList<>();

    @NonNull
    @Override
    public Adapter.itemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.caffeine_item, viewGroup, false);
        return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.itemViewHolder viewHolder, int i) {
        viewHolder.onBind(item.get(i));
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    void addItem(Item _item) {
        item.add(_item);
    }

    class itemViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView name;
        private TextView kcal;
        private TextView mg;

        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.drink_name);
            kcal = itemView.findViewById(R.id.kcal);
            mg = itemView.findViewById(R.id.mg);
        }

        public void onBind(Item item) {
            imageView.setImageResource(item.getImage());
            name.setText(item.getName());
            kcal.setText(item.getKcal());
            mg.setText(item.getMg());
        }
    }

}
