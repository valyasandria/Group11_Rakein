package com.example.rakein;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.intellij.lang.annotations.JdkConstants;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class CatalogueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);

        Button addProduct = findViewById(R.id.button6);
        Button checkout = findViewById(R.id.button8);
        ListView listview = findViewById(R.id.listview1);
        TextView items = findViewById(R.id.textView27);
        final ArrayList<MyData> arrayList = new ArrayList<>();

        arrayList.add(new MyData("Buku Tulis", "12", "Rp12.000"));
        arrayList.add(new MyData("Pulpen Joyko", "15", "Rp5.000"));
        arrayList.add(new MyData("Penggaris", "5", "Rp5.000"));
        arrayList.add(new MyData("Penghapus", "23", "Rp2.000"));
        arrayList.add(new MyData("Stabilo", "11", "Rp9.000"));
        arrayList.add(new MyData("Spidol Permanen", "9", "Rp12.000"));
        ProductAdapter productAdapter = new ProductAdapter(this, arrayList);

        // create the instance of the ListView to set the numbersViewAdapter

        // set the numbersViewAdapter for ListView
        listview.setAdapter(productAdapter);

        Intent intent = getIntent();
        // receive the value by getStringExtra() method and
        // key must be same which is send by first activity
        String str = intent.getStringExtra("message_key");
        // display the string into textView
        items.setText(str);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
                Intent intent = new Intent(CatalogueActivity.this, ProductDetailActivity.class);
                startActivity(intent);
            }
        });

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