package com.example.rakein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddProductActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addproduct);

        Button addProduct = findViewById(R.id.button);
        EditText name = findViewById(R.id.editTextTextPersonName);
        EditText price = findViewById(R.id.editTextTextPersonName2);
        EditText stock = findViewById(R.id.editTextTextPersonName5);
        EditText category = findViewById(R.id.editTextTextPersonName6);
        EditText desc = findViewById(R.id.editTextTextPersonName7);

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = name.getText().toString();
                String harga = price.getText().toString();
                String stok = stock.getText().toString();
                String cat = category.getText().toString();
                String description = desc.getText().toString();


                if(nama.equals("") || harga.equals("") || stok.equals("") ||cat.equals("") ||description.equals("")){
                    Toast.makeText(getApplicationContext(), "Fields Required", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "New product added!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AddProductActivity.this, CatalogueActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
