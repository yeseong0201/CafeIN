package com.example.cafein;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context;
    private ArrayList<Caffeine_Item> DrinkItem;

    public Adapter(ArrayList<Caffeine_Item> DrinkItem) {
        this.DrinkItem = DrinkItem;

    }


//    public Adapter(ArrayList<Caffeine_Item> item, Context _context) {
//        this.DrinkItem = item;
//        this.context = _context;
//    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_caffeine__item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.image.setImageDrawable(DrinkItem.get(i).getImage());
        viewHolder.name.setText(DrinkItem.get(i).getName());
        viewHolder.kcal.setText(DrinkItem.get(i).getKcal());
        viewHolder.mg.setText(DrinkItem.get(i).getMg());
    }

    @Override
    public int getItemCount() {
        return DrinkItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView image;
        public final TextView name;
        public final TextView mg;
        public final TextView kcal;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.drink_name);
            mg = itemView.findViewById(R.id.mg);
            kcal = itemView.findViewById(R.id.kcal);
        }
    }


//    @Override
//    public int getCount() {
//        //return (null != DrinkItem ? DrinkItem.size() : 0);
//        return DrinkItem.size();
//    }
/*
    @Override
    public Object getItem(int position) {
        return DrinkItem.get(position).getName();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }*/


//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        final Context context = parent.getContext();
//        if (convertView == null) {
//
//            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = inflater.inflate(R.layout.activity_caffeine__item, parent, false);
//        }
//
//
//        ImageView image = convertView.findViewById(R.id.image);
//        TextView name = convertView.findViewById(R.id.drink_name);
//        TextView kcal = convertView.findViewById(R.id.kcal);
//        TextView mg = convertView.findViewById(R.id.mg);
//
//        Caffeine_Item caffeine_item = DrinkItem.get(position);
//
//        image.setImageDrawable(caffeine_item.getImage());
//        name.setText(caffeine_item.getName());
//        kcal.setText(caffeine_item.getKcal());
//        mg.setText(caffeine_item.getMg());
//
//        return convertView;
//    }


}
