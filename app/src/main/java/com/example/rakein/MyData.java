package com.example.rakein;

public class MyData {
    // TextView 2
    private String name;

    // TextView 3
    private String category;

    private String productName;
    private String quantity;
    private String price;
    // create constructor to set the values for all the parameters of the each single view
    public MyData(String store_name, String store_category) {
        name = store_name;
        category = store_category;
    }

    public MyData(String product, String qty, String harga) {
        productName = product;
        quantity = qty;
        price = harga;
    }

    // getter method for returning the ID of the TextView 1
    public String getName() {
        return name;
    }

    // getter method for returning the ID of the TextView 2
    public String getCategory() {
        return category;
    }

    public String getProductName() {
        return productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public Object getItem(int position) {
        return position;
    }
}
