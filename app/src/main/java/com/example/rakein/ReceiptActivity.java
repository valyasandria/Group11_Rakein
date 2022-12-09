package com.example.rakein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        TextView storeName = findViewById(R.id.textView7);
        TextView address = findViewById(R.id.textView8);
        Button start = findViewById(R.id.button4);
        Button sales = findViewById(R.id.button2);

        storeName.setText("Toko ATK UPI CELL");
        address.setText("Jl. H. Amat No. 80, Depok");
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
