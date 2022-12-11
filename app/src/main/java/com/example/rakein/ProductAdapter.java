package com.example.rakein;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<MyData> {

    // invoke the suitable constructor of the ArrayAdapter class
    public ProductAdapter(Context context, ArrayList<MyData> arrayList) {

        // pass the context and arrayList for the super
        // constructor of the ArrayAdapter class
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // convertView which is recyclable view
        View currentItemView = convertView;

        // of the recyclable view is null then inflate the custom layout for the same
        if (currentItemView == null) {
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_listview, parent, false);
        }

        // get the position of the view from the ArrayAdapter
        MyData currentNumberPosition = getItem(position);

        // product name
        TextView name = currentItemView.findViewById(R.id.textView3);
        name.setText(currentNumberPosition.getProductName());

        // product quantity
        TextView quantity = currentItemView.findViewById(R.id.textView2);
        quantity.setText(currentNumberPosition.getQuantity());

        // product price
        TextView price = currentItemView.findViewById(R.id.textView);
        price.setText(currentNumberPosition.getPrice());


        // then return the recyclable view
        return currentItemView;
    }
}
