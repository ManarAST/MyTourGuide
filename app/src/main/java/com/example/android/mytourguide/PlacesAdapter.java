package com.example.android.mytourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manar on 02/01/2018.
 */

public class PlacesAdapter extends ArrayAdapter<Places>{

    //constructor

    public PlacesAdapter (Activity context, ArrayList<Places> word){

        super(context,0, word);
    }

    // overwriting the getView method

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Places currentWord = getItem(position);




        TextView placeName =listItemView.findViewById(R.id.placeName);
        placeName.setText(currentWord.getPlaceName());

        TextView placeDescription =listItemView.findViewById(R.id.placeDescription);
        placeDescription.setText(currentWord.getPlaceDescription());

        ImageView image =  listItemView.findViewById(R.id.image);
        image.setImageResource(currentWord.getImageResourceId());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
