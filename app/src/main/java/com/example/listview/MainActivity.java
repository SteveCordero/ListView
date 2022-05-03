package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView lvMonth;
    String[] months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SteveQueue names = new SteveQueue();
        names.addToBack("Steve");
        names.addToBack("Rey");
        names.addToBack("Bob");
        names.addToBack("Emiliano Melendrez de Nochistlan Zacatecas");
        names.addToBack("Marc");
        names.addToBack("James");
        names.addToBack("John");
        names.addToBack("Susan");
        names.addToBack("Glenn");
        names.addToBack("George");
        names.addToBack("Thomas");
        names.addToBack("Adam");
        names.addToBack("Hamilton");
        names.addToBack("Lincoln");
        names.addToBack("Jackson");
        names.addToBack("Theodore");
        names.addToBack("April");
        names.addToBack("May");
        names.addToBack("Carl");
        names.addToBack("Smith");
        names.addToBack("Peter");
        names.addToBack("Josh");
        names.addToBack("Anthony");
        names.addToBack("Steven");

        String[] QToArray =  names.toArray();

        lvMonth = findViewById(R.id.lvMonth);

        //ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, R.layout.list_item, QToArray);

        lvMonth.setAdapter(monthAdapter);
        lvMonth.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //String month = adapterView.getItemAtPosition(i).toString();
        //String month = months[i];
        //String month = ((TextView)view).getText().toString();
        String month =lvMonth.getItemAtPosition(i).toString();

        Toast.makeText(getApplicationContext(), "Clicked: " + month, Toast.LENGTH_SHORT).show();
    }
//left off at 11 36 of the video
}