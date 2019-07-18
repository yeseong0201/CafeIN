package com.example.cafein;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class CaffeineDrinkFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Caffeine_Item> DrinkItem = new ArrayList<>();


    public CaffeineDrinkFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_caffeine__item, container, false);

        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;


            // recyclerView.scrollToPosition(0);
            recyclerView.setHasFixedSize(true);

            layoutManager = new LinearLayoutManager(context);
            recyclerView.setLayoutManager(layoutManager);

//            recyclerView = new RecyclerView(context);
//            recyclerView = view.findViewById(android.R.id.list);


          //  DrinkItem = new ArrayList<>();

//            DrinkItem.add(new Caffeine_Item(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background), "adsf", "asd", "asd"));
//            DrinkItem.add(new Caffeine_Item(ContextCompat.getDrawable(getActivity(), R.drawable.ic_launcher_background), "adsf", "asd", "asd"));

            adapter = new Adapter(DrinkItem);
            recyclerView.setAdapter(adapter);

        }
        return view;

    }


}
