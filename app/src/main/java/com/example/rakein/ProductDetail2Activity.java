package com.example.rakein;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProductDetail2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail2);

        TextView name = findViewById(R.id.textView21);
        TextView stock = findViewById(R.id.textView22);
        TextView price = findViewById(R.id.textView23);
        TextView category = findViewById(R.id.textView24);
        TextView desc = findViewById(R.id.textView25);
        EditText qty = findViewById(R.id.editTextNumber);
        Button cart = findViewById(R.id.button9);

        name.setText("Pulpen Joyko");
        stock.setText("15");
        price.setText("Rp5.000");
        category.setText("ATK");
        desc.setText("Hitam 0.5mm");

        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductDetail2Activity.this, CatalogueActivity.class);
                String quantity = qty.getText().toString();
                intent.putExtra("message_key", quantity);
                startActivity(intent);
            }
        });
    }
}