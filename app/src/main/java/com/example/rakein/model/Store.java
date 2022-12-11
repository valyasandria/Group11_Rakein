package com.example.rakein.model;

import com.google.gson.annotations.SerializedName;

/**
 * Class that represents a store
 *
 * @author Dhau' Embun Azzahra
 */
public class Store {
    /**
     * The recipe id.
     */
    @SerializedName("store_id")
    private int store_id;
    /**
     * The recipe name.
     */
    @SerializedName("store_name")
    private String store_name;
    /**
     * The recipe ingredients.
     */
    @SerializedName("store_number")
    private String store_number;
    /**
     * The recipe directions.
     */
    @SerializedName("store_desc")
    private String store_desc;
    /**
     * The recipe author id.
     */
    @SerializedName("store_type")
    private String store_type;
    /**
     * The username of recipe author.
     */
    @SerializedName("store_address")
    private String store_address;

    public Store(int store_id, String store_name, String store_number, String store_desc, String store_type, String store_address) {
        this.store_id = store_id;
        this.store_name = store_name;
        this.store_number = store_number;
        this.store_desc = store_desc;
        this.store_type = store_type;
        this.store_address = store_address;
    }

    public Store(String store_name, String store_number, String store_desc, String store_type, String store_address) {
        this.store_name = store_name;
        this.store_number = store_number;
        this.store_desc = store_desc;
        this.store_type = store_type;
        this.store_address = store_address;
    }


    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getStore_name() {
        return store_name;
    }
    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_number() {
        return store_number;
    }
    public void setStore_number(String store_number) {
        this.store_number = store_number;
    }

    public String getStore_desc() {
        return store_desc;
    }
    public void setStore_desc(String store_desc) {
        this.store_desc = store_desc;
    }

    public String getStore_type() {
        return store_type;
    }
    public void setStore_type(String store_type) {
        this.store_type = store_type;
    }

    public String getStore_address() {
        return store_address;
    }
    public void setStore_address(String store_address) {
        this.store_address = store_address;
    }
}

