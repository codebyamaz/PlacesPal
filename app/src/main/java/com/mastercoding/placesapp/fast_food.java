package com.mastercoding.placesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class fast_food extends AppCompatActivity {
    private ArrayList<FF_Data_Source> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);

        ListView fastFood_lv = findViewById(R.id.fastFood_lv);

        dataModels = new ArrayList<>();

        dataModels.add(new FF_Data_Source("KFC", "4.0⭐", R.drawable.kfc));
        dataModels.add(new FF_Data_Source("McDonald's", "4.2⭐", R.drawable.mc));
        dataModels.add(new FF_Data_Source("Johnny & Jugnu", "4.4⭐", R.drawable.jn));
        dataModels.add(new FF_Data_Source("Optp", "4.1⭐", R.drawable.optp));
        dataModels.add(new FF_Data_Source("Burger King", "3.2⭐", R.drawable.bk));
        dataModels.add(new FF_Data_Source("Subway", "4.2⭐", R.drawable.sw));
        dataModels.add(new FF_Data_Source("Cheezious", "4.6⭐", R.drawable.ch));
        dataModels.add(new FF_Data_Source("Texas", "4.0⭐", R.drawable.texas));
        dataModels.add(new FF_Data_Source("Timmy's", "3.5⭐", R.drawable.timmy));
        dataModels.add(new FF_Data_Source("Mighty Burger", "4.1⭐", R.drawable.mighty));
        dataModels.add(new FF_Data_Source("CP Five Star", "4.1⭐", R.drawable.cp));
        dataModels.add(new FF_Data_Source("Forks n Knives", "4.4⭐", R.drawable.fk));
        dataModels.add(new FF_Data_Source("Cafe Gazebo", "4.5⭐", R.drawable.cg));
        dataModels.add(new FF_Data_Source("Twice da Spice", "4.5⭐", R.drawable.twice));
        dataModels.add(new FF_Data_Source("Pizza Online", "4.4⭐", R.drawable.pi));
        dataModels.add(new FF_Data_Source("Burger Lab", "4.1⭐", R.drawable.bl));
        dataModels.add(new FF_Data_Source("QD's", "4.3⭐", R.drawable.qd));
        dataModels.add(new FF_Data_Source("Pizza Junction", "4.2⭐", R.drawable.pizza));
        dataModels.add(new FF_Data_Source("Juicy Chuck", "3.7⭐", R.drawable.jc));
        dataModels.add(new FF_Data_Source("Ranchers", "4.3⭐", R.drawable.ranchers));
        dataModels.add(new FF_Data_Source("Papa Johns", "4.3⭐", R.drawable.papajohns));
        dataModels.add(new FF_Data_Source("Dajaj Broast", "4.1⭐", R.drawable.dijaj));
        dataModels.add(new FF_Data_Source("Stone Ove", "4.2⭐", R.drawable.stoneover));
        dataModels.add(new FF_Data_Source("Domino's", "4.0⭐", R.drawable.dominos));
        dataModels.add(new FF_Data_Source("Smash", "4.0⭐", R.drawable.smash));
        dataModels.add(new FF_Data_Source("Mario's", "4.2⭐", R.drawable.mario));

        FF_Adapter adapter = new FF_Adapter(dataModels, getApplicationContext());

        fastFood_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name =  adapter.getItem(i).getRestaurantName();
                if ( adapter.getItem(i).getRestaurantName() == "KFC" ) {
                    changeIntent("https://maps.google.com/?cid=13335448541280031645&entry=gps");
                } else if ( adapter.getItem(i).getRestaurantName() == "McDonald's" ) {
                    changeIntent("https://maps.app.goo.gl/TEi7WqXUJGwiJPzC9");
                } else if ( adapter.getItem(i).getRestaurantName() == "Johnny & Jugnu" ) {
                    changeIntent("https://maps.google.com/?cid=2823825442637107201&entry=gps");
                } else if ( adapter.getItem(i).getRestaurantName() == "Optp" ) {
                    changeIntent("https://maps.app.goo.gl/8WirbX9hsxVWY1RH7");
                } else if ( adapter.getItem(i).getRestaurantName() == "Burger King" ) {
                    changeIntent("https://maps.app.goo.gl/gv1Nhqf9R94nAySj9");
                } else if ( name == "Subway" ) {
                    changeIntent("https://maps.app.goo.gl/hmeCWx4f9Vd4jgz49");
                } else if ( name == "Cheezious" ) {
                    changeIntent("https://maps.app.goo.gl/yA6DnTKYHgC88xQn9");
                } else if ( name == "Texas" ) {
                    changeIntent("https://maps.app.goo.gl/1sUEovaq4pREwgWB9");
                } else if ( name == "Timmy's" ) {
                    changeIntent("https://maps.app.goo.gl/iKvuqwgb1JyZERWu5");
                } else if ( name == "Mighty Burger" ) {
                    changeIntent("https://maps.app.goo.gl/UwU4FajjvBnTZzsj8");
                } else if ( name == "CP Five Star" ) {
                    changeIntent("https://maps.app.goo.gl/T6KReEKefTMXmCnk6");
                } else if ( name == "Forks n Knives" ) {
                    changeIntent("https://maps.app.goo.gl/hUUzp1fGgj1UBats7");
                } else if ( name == "Cafe Gazebo" ) {
                    changeIntent("https://maps.google.com/?cid=12236428965679785347&entry=gps");
                } else if ( name == "Twice da Spice" ) {
                    changeIntent("https://maps.app.goo.gl/g1AdsGoAQXob2uGfA");
                } else if ( name == "Pizza Online" ) {
                    changeIntent("https://maps.app.goo.gl/XJjbNXQzPGTaqeG99");
                } else if (  name == "Burger Lab") {
                    changeIntent("https://maps.app.goo.gl/nFww5WDnJA9r3Zs88");
                } else if ( name == "QD's" ) {
                    changeIntent("https://maps.app.goo.gl/PbgCZFY6PRDrpg4C6");
                } else if ( name == "Pizza Junction" ) {
                    changeIntent("https://maps.app.goo.gl/prkciUeSajYt6URKA");
                } else if ( name == "Juicy Chuck" ) {
                    changeIntent("https://maps.app.goo.gl/FDMDVFaX7dZfK8GQ7");
                } else if ( name == "Ranchers" ) {
                    changeIntent("https://maps.app.goo.gl/4bvXZdq9kTg1gwHj7");
                } else if ( name == "Papa Johns" ) {
                       changeIntent("https://maps.app.goo.gl/RXMfNJZCCSh77p4L9");
                } else if ( name == "Dajaj Broast" ) {
                    changeIntent("https://maps.app.goo.gl/zFvqGXy5WzhGJJg79");
                } else if ( name == "Stone Ove" ) {
                    changeIntent("https://maps.app.goo.gl/w3wxSjRijmyWG2ug8");
                } else if ( name == "Domino's" ) {
                    changeIntent("https://maps.app.goo.gl/g87ECEUNLZzGaopf9");
                } else if ( name == "Smash" ) {
                    changeIntent("https://maps.app.goo.gl/iLG1SuMRBQVWRBi2A");
                } else if ( name == "Mario's" ) {
                    changeIntent("https://maps.app.goo.gl/BLaHe3NgJZcWngwZ8");
                }
            }
        });

        fastFood_lv.setAdapter(adapter);
    }

    public void changeIntent ( String uri ) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

}