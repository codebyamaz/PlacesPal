package com.mastercoding.placesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class desi_food extends AppCompatActivity {

    private ArrayList<DF_Data_Source> dataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desi_food);

        ListView desiFood_lv = findViewById(R.id.desiFood_lv);

        dataModels = new ArrayList<>();

        dataModels.add(new DF_Data_Source("Spice Bazaar", "4.3⭐", R.drawable.spice));
        dataModels.add(new DF_Data_Source("Cooco's Den", "3.9⭐", R.drawable.co));
        dataModels.add(new DF_Data_Source("E Cafe", "4.3⭐", R.drawable.e));
        dataModels.add(new DF_Data_Source("Yasir Broast", "3.9⭐", R.drawable.y));
        dataModels.add(new DF_Data_Source("Saadi di Sajji", "4.8⭐", R.drawable.sj));
        dataModels.add(new DF_Data_Source("Shinwari Fort", "4.5⭐", R.drawable.sh));
        dataModels.add(new DF_Data_Source("Dera", "4.0⭐", R.drawable.dera));
        dataModels.add(new DF_Data_Source("Khalifa Balochi Sajji", "4.1⭐", R.drawable.kh));
        dataModels.add(new DF_Data_Source("Khan Shinwari", "4.3⭐", R.drawable.khansahab));
        dataModels.add(new DF_Data_Source("Charsi Tikka", "3.8⭐", R.drawable.charsi));
        dataModels.add(new DF_Data_Source("Namak", "4.1⭐", R.drawable.namak));
        dataModels.add(new DF_Data_Source("Malwari Paratha", "4.1⭐", R.drawable.mii));
        dataModels.add(new DF_Data_Source("Butt Karahi", "4.1⭐", R.drawable.butt));
        dataModels.add(new DF_Data_Source("Ali Shan", "4.1⭐", R.drawable.ali));
        dataModels.add(new DF_Data_Source("Bubbly Sajji", "3.9⭐", R.drawable.bubb));
        dataModels.add(new DF_Data_Source("Ronaq Mela", "4.3⭐", R.drawable.rr));
        dataModels.add(new DF_Data_Source("Jawa Karahi", "4.2⭐", R.drawable.jj));
        dataModels.add(new DF_Data_Source("Nisa Sultan", "4.0⭐", R.drawable.nisa));
        dataModels.add(new DF_Data_Source("The Lost Tribe", "4.3⭐", R.drawable.losttribe));

        DF_Adapter adapter = new DF_Adapter(dataModels, getApplicationContext());

        desiFood_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = adapter.getItem(i).getRestaurantName();
                if ( name == "Spice Bazaar" ) {
                    changeIntent("https://maps.app.goo.gl/BZvBgcCdRNsqtR14A");
                } else if ( name == "Cooco's Den" ) {
                    changeIntent("https://maps.app.goo.gl/7HsTRER3pWzrVcAS6");
                } else if ( name == "E Cafe" ) {
                    changeIntent("https://maps.app.goo.gl/rECKvPX4Xrh9YrQJ9");
                } else if (  name == "Yasir Broast" ) {
                    changeIntent("https://maps.app.goo.gl/WjcseMmW2ddksUR4A");
                } else if ( name == "Saadi di Sajji" ) {
                    changeIntent("https://maps.app.goo.gl/912vJHnWEjQnjaEb6");
                } else if ( name == "Shinwari Fort" ) {
                    changeIntent("https://maps.app.goo.gl/5oV7mdAHCgodLbuj8");
                } else if ( name == "Dera" ) {
                    changeIntent("https://maps.app.goo.gl/GAga3t87GB3jxqJ86");
                } else if ( name == "Khalifa Balochi Sajji" ) {
                    changeIntent("https://maps.app.goo.gl/MzWEupvpCCt8ttFFA");
                } else if (  name == "Khan Shinwari" ) {
                    changeIntent("https://maps.app.goo.gl/5yeZ4UkbUywc2dkZ6");
                } else if ( name == "Charsi Tikka" ) {
                    changeIntent("https://maps.app.goo.gl/ZGKk8b23zvGicUBk7");
                } else if ( name == "Namak" ) {
                    changeIntent("https://maps.app.goo.gl/baTd6Mb9UxiPj49v6");
                } else if ( name == "Malwari Paratha" ) {
                    changeIntent("https://maps.app.goo.gl/ayFGP5Z4vL7wMuyP6");
                } else if ( name == "Butt Karahi" ) {
                    changeIntent("https://maps.app.goo.gl/qpdFHE2qVzSGTqCy8");
                } else if ( name == "Ali Shan" ) {
                    changeIntent("https://maps.app.goo.gl/s4JTg4iDWj5YaEQT6");
                } else if ( name == "Bubbly Sajji" ) {
                    changeIntent("https://maps.app.goo.gl/R1Fc5t4v6iAfStB79");
                } else if ( name == "Ronaq Mela" ) {
                    changeIntent("https://maps.app.goo.gl/CEzaPZCNxZ4Q7JYn8");
                } else if ( name == "Jawa Karahi" ) {
                    changeIntent("https://maps.app.goo.gl/jxnaitynVzQgZwyU8");
                } else if ( name == "Nisa Sultan" ) {
                    changeIntent("https://maps.app.goo.gl/Kdaxr3cyeKf7svAu7");
                } else if ( name == "The Lost Tribe" ) {
                    changeIntent("https://maps.app.goo.gl/brptVU8gzFef1T7d6");
                }

            }
        });

        desiFood_lv.setAdapter(adapter);

    }

    public void changeIntent ( String uri ) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);
    }

}