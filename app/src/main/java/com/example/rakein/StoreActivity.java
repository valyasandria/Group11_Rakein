package com.example.rakein;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Button registerStr = findViewById(R.id.button5);
        Button catalogue = findViewById(R.id.button7);
        String[] store = {"Toko ATK UPI CELL"};
        ListView listView = findViewById(R.id.listview1);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview2, R.id.textView3, store);
        listView.setAdapter(arrayAdapter);


        registerStr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StoreActivity.this, RegStoreActivity.class);
                startActivity(intent);
            }
        });

        catalogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StoreActivity.this, CatalogueActivity.class);
                startActivity(intent);
            }
        });


    }
}