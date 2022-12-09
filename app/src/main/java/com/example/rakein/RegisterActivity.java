package com.example.rakein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rakein.model.DefaultResponse;
import com.example.rakein.model.User;
import com.example.rakein.service.service;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
    private service retrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        Button register = findViewById(R.id.button);




    register.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            register();
            /*String name = etName.getText().toString();
            String email = etEmail.getText().toString();
            String username = etUname.getText().toString();
            String password = etPass.getText().toString();

            if(name.equals("") || username.equals("") || email.equals("") || password.equals("")){
                Toast.makeText(getApplicationContext(), "Fields Required", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "Account Registered!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }*/
        }
    });
    }

    private void register() {
        EditText etName = findViewById(R.id.editTextTextPersonName);
        EditText etUname = findViewById(R.id.editTextTextPersonName2);
        EditText etEmail = findViewById(R.id.editTextTextEmailAddress);
        EditText etPass = findViewById(R.id.editTextTextPassword);

        String name = etName.getText().toString();
        String username = etUname.getText().toString();
        String email = etEmail.getText().toString();
        String password = etPass.getText().toString();

        User user = new User(name, username, email, password);

        Call<DefaultResponse> call = retrofit.register(user);
        call.enqueue(new Callback<DefaultResponse>() {
            @Override
            public void onResponse(Call<DefaultResponse> call, Response<DefaultResponse> response) {
                DefaultResponse defaultResponse;
                if(response.code()==200){
                    defaultResponse = response.body();
                    String message = defaultResponse.getMessage();
                    Toast.makeText(RegisterActivity.this, message,Toast.LENGTH_SHORT).show();
                    if (message.equalsIgnoreCase("Register Success.")) {
                        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }else{
                    try {
                        JSONObject jsonObject = new JSONObject(response.errorBody().string());
                        Toast.makeText(RegisterActivity.this, jsonObject.getString("message"),Toast.LENGTH_SHORT).show();
                    } catch (JSONException | IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<DefaultResponse> call, Throwable t) {
                Toast.makeText(RegisterActivity.this, t.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

}
