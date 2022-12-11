package com.example.rakein;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Button registerStr = findViewById(R.id.button5);
        ListView listView = findViewById(R.id.listview1);
        final ArrayList<MyData> arrayList = new ArrayList<>();

        arrayList.add(new MyData("UPI CELL", "ATK"));
        arrayList.add(new MyData("MAKNYUS", "F & B"));
        MyAdapter numbersArrayAdapter = new MyAdapter(this, arrayList);

        // create the instance of the ListView to set the numbersViewAdapter

        // set the numbersViewAdapter for ListView
        listView.setAdapter(numbersArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                if (position == 0) { //first store
                    Intent intent = new Intent(view.getContext(), CatalogueActivity.class);
                    startActivity(intent);
                }

                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), StoreActivity.class);
                    startActivity(intent);
                }
            }
        });

        registerStr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StoreActivity.this, RegStoreActivity.class);
                startActivity(intent);
            }
        });
    }
}