package com.example.rakein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regstore);

        Button register = findViewById(R.id.button);
        EditText name = findViewById(R.id.editTextTextPersonName);
        EditText address = findViewById(R.id.editTextTextPersonName2);
        EditText phone = findViewById(R.id.editTextPhone);
        EditText category = findViewById(R.id.editTextTextPersonName3);
        EditText desc = findViewById(R.id.editTextTextPersonName4);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = name.getText().toString();
                String adr = address.getText().toString();
                String number = phone.getText().toString();
                String cat = category.getText().toString();
                String description = desc.getText().toString();

                if(value.equals("") || adr.equals("") || number.equals("") || cat.equals("") || description.equals("")){
                    Toast.makeText(getApplicationContext(), "Fields Required", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Account Registered!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegStoreActivity.this, StoreActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
