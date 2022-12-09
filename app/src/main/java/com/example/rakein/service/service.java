package com.example.rakein.service;

import com.example.rakein.model.DefaultResponse;
import com.example.rakein.model.GetUserResponse;
import com.example.rakein.model.User;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Interface for API call methods
 * using retrofit.
 *
 * @author Dhau' Embun Azzahra
 */
public interface service {

    @POST("/login")
    Call<GetUserResponse> login(@Body User user);

    @POST("/register")
    Call<DefaultResponse> register(@Body User user);


}


