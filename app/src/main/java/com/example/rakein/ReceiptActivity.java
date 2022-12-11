package com.example.rakein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ReceiptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        TextView storeName = findViewById(R.id.textView7);
        TextView address = findViewById(R.id.textView8);
        TextView total = findViewById(R.id.textView10);
        TextView ID = findViewById(R.id.textView6);
        TextView time = findViewById(R.id.textView9);
        Button start = findViewById(R.id.button4);
        Button sales = findViewById(R.id.button2);
        ListView list = findViewById(R.id.receipt);

        storeName.setText("Toko ATK UPI CELL");
        address.setText("Jl. H. Amat I/35, Kukusan");
        total.setText("Rp40.000,00");
        ID.setText("0001");
        time.setText("12/12/2022");

        final ArrayList<MyData> arrayList = new ArrayList<>();

        arrayList.add(new MyData("Buku Tulis", "x5", "Rp25.000"));
        arrayList.add(new MyData("Pulpen Joyko", "x1", "Rp5.000"));
        arrayList.add(new MyData("Penggaris", "x2", "Rp10.000"));
        ProductAdapter productAdapter = new ProductAdapter(this, arrayList);

        list.setAdapter(productAdapter);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReceiptActivity.this, CatalogueActivity.class);
                startActivity(intent);
            }
        });

        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReceiptActivity.this, SalesActivity.class);
                startActivity(intent);
            }
        });
    }

}
