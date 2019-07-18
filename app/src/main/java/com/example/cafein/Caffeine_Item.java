package com.example.cafein;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class Caffeine_Item extends AppCompatActivity {

    private Drawable Image;
    private String name;
    private String mg;
    private String kcal;


//    public void setImage(Drawable _image) {
//        this.Image = _image;
//    }
//
//    public void setName(String _name) {
//        this.name = _name;
//    }
//
//    public void setMg(String _mg) {
//        this.mg = _mg;
//    }
//
//    public void setKcal(String _kcal) {
//        this.kcal = _kcal;
//    }

    public Drawable getImage() {
        return Image;
    }

    public String getName() {
        return name;
    }

    public String getMg() {
        return mg;
    }

    public String getKcal() {
        return kcal;
    }


    public Caffeine_Item(Drawable _Image, String _name, String _mg, String _kcal) {
        Image = _Image;
        name = _name;
        mg = _mg;
        kcal = _kcal;

    }

    public static ArrayList<Caffeine_Item> caffeine_itemArrayList(int num) {
        ArrayList<Caffeine_Item> contacts = new ArrayList<Caffeine_Item>();

        for (int i = 0; i <= num; i++) {
            contacts.add(new Caffeine_Item(ContextCompat.getDrawable(null, R.drawable.ic_launcher_background), "adf", "asdf", "adsf"));

        }

        return contacts;
    }

}
