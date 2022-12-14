package com.example.rakein;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextTextPassword);
        Button login = findViewById(R.id.button);
        TextView createAcc = findViewById(R.id.new_user_cr);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input_email = email.getText().toString();
                String input_password = password.getText().toString();

                if(input_email.equals("") || input_password.equals("")){
                    Toast.makeText(getApplicationContext(), "Fields Required", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Login Success!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, StoreActivity.class);
                    startActivity(intent);
                }
            }
        });

        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}