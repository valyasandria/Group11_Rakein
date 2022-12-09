package com.example.rakein.model;

import com.google.gson.annotations.SerializedName;

/**
 * Class that represents a user.
 *
 * @author Dhau' Embun Azzahra
 */
public class User {
    /**
     * The user id.
     */
    @SerializedName("user_id")
    private int user_id;

    /**
     * The user id.
     */
    @SerializedName("name")
    private String name;
    /**
     * The user's username.
     */
    @SerializedName("username")
    private String username;
    /**
     * The user's email.
     */
    @SerializedName("email")
    private String email;
    /**
     * The user's password.
     */
    @SerializedName("password")
    private String password;

    public User(int user_id, String name, String username, String email, String password){
        this.user_id = user_id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String name, String username, String email, String password) {
        this.name = name;
        this.name = username;
        this.name = email;
        this.name = password;

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
