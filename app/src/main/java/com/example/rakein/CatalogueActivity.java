package com.example.rakein;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class CatalogueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);

        Button addProduct = findViewById(R.id.button6);
        Button checkout = findViewById(R.id.button8);
        ListView listview = findViewById(R.id.listview1);
        TextView quantity = findViewById(R.id.textView2);
        TextView harga = findViewById(R.id.textView);
        String[] product = {"Pensil 2B", "Penghapus", "Penggaris 20 cm", "Buku Gambar A4"};
        String[] stock = {"20", "30", "15", "24"};
        String[] price = {"2000", "1500", "5000", "12000"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView3, product);
        listview.setAdapter(arrayAdapter);


        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatalogueActivity.this, AddProductActivity.class);
                startActivity(intent);
            }
        });

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatalogueActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

    }
}