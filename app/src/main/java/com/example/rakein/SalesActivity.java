package com.example.rakein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SalesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        Button home = findViewById(R.id.button10);
        ListView list = findViewById(R.id.listview1);
        TextView total = findViewById(R.id.textView14);

        final ArrayList<MyData> arrayList = new ArrayList<>();

        arrayList.add(new MyData("Buku Tulis", "x5", "Rp25.000"));
        arrayList.add(new MyData("Pulpen Joyko", "x1", "Rp5.000"));
        arrayList.add(new MyData("Penggaris", "x2", "Rp10.000"));
        ProductAdapter productAdapter = new ProductAdapter(this, arrayList);

        list.setAdapter(productAdapter);
        total.setText("Rp40.000,00");

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SalesActivity.this, CatalogueActivity.class);
                startActivity(intent);
            }
        });
    }

}
