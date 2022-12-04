package com.example.rakein.model;

public class User extends Serializable{
    public String name;
    public String username;
    public String email;
    public String password;

    /** Creates an account with the specified information.
     * @param name The account's name.
     * @param email The account's email address.
     * @param password The account's password.
     * @param id The account id
     */
    public User(int id, String name, String username, String email, String password){
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

}

