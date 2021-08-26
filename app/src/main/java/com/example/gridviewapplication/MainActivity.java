package com.example.gridviewapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Kenya");
        arrayList.add("Uganda");
        arrayList.add("Tanzania");
        arrayList.add("Rwanda");
        arrayList.add("Burundi");
        arrayList.add("South Sudan");

        arrayList.add("Kenya");
        arrayList.add("Uganda");
        arrayList.add("Tanzania");
        arrayList.add("Rwanda");
        arrayList.add("Burundi");
        arrayList.add("South Sudan");

        ArrayAdapter arrayAdapter= new ArrayAdapter(Context this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
