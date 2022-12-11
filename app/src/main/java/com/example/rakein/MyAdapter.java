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

public class MyAdapter extends ArrayAdapter<MyData> {

    // invoke the suitable constructor of the ArrayAdapter class
    public MyAdapter(Context context, ArrayList<MyData> arrayList) {

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
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_listview2, parent, false);
        }

        // get the position of the view from the ArrayAdapter
        MyData currentNumberPosition = getItem(position);

        // then according to the position of the view assign the desired TextView 1 for the same
        TextView textView2 = currentItemView.findViewById(R.id.textView20);
        textView2.setText(currentNumberPosition.getName());

        // then according to the position of the view assign the desired TextView 2 for the same
        TextView textView3 = currentItemView.findViewById(R.id.textView3);
        textView3.setText(currentNumberPosition.getCategory());


        // then return the recyclable view
        return currentItemView;
    }
}