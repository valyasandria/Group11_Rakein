package com.example.rakein;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rakein.model.DefaultResponse;
import com.example.rakein.model.Store;
import com.example.rakein.service.service;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegStoreActivity extends AppCompatActivity {
    private service retrofitServices;

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

        retrofitServices = Instance.getInstance().create(service.class);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String store_name = name.getText().toString();
                String store_address = address.getText().toString();
                String store_number = phone.getText().toString();
                String store_type = category.getText().toString();
                String store_desc = desc.getText().toString();

                /*Store store = new Store( store_name,  store_number,  store_desc,  store_type,  store_address);

                Call<DefaultResponse> call = retrofitServices.register(store);
                call.enqueue(new Callback<DefaultResponse>() {
                    @Override
                    public void onResponse(Call<DefaultResponse> call, Response<DefaultResponse> response) {
                        DefaultResponse defaultResponse;
                        if(response.code()==200){
                            defaultResponse = response.body();
                            String message = defaultResponse.getMessage();
                            Toast.makeText(RegStoreActivity.this, message,Toast.LENGTH_SHORT).show();
                            if (message.equalsIgnoreCase("Register Success.")) {
                                Intent intent = new Intent(RegStoreActivity.this, StoreActivity.class);
                                startActivity(intent);
                            }
                        }else{
                            try {
                                JSONObject jsonObject = new JSONObject(response.errorBody().string());
                                Toast.makeText(RegStoreActivity.this, jsonObject.getString("message"),Toast.LENGTH_SHORT).show();
                            } catch (JSONException | IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<DefaultResponse> call, Throwable t) {
                        Toast.makeText(RegStoreActivity.this, t.toString(),Toast.LENGTH_SHORT).show();
                    }
                });

                */
                if(store_name.equals("") || store_address.equals("") || store_number.equals("") || store_type.equals("") || store_desc.equals("")){
                    Toast.makeText(getApplicationContext(), "Fields Required", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Store Registered!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegStoreActivity.this, StoreActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
