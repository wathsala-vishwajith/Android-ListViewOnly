package com.sala.listviewonly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] arr = {"University of Colombo",
            "Eastern University",
            "University of Jaffna",
            "University of Kelaniya",
            "University of Moratuwa",
            "Open University",
            "University of Peradeniya",
            "Rajarata University",
            "University of Ruhuna",
            "Sabaragamuwa University",
            "South Eastern University",
            "University of Sri Jayewardenepura",
            "Uva Wellassa University",
            "University of the Visual and Performing Arts",
            "Wayamba University",
            "Gampaha Wickramarachchi University",
            "University of Vavuniya"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listview);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.list_item,arr);

        listView.setAdapter(arrayAdapter);

    }
}