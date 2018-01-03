package com.example.android.mytourguide;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by manar on 02/01/2018.
 */

public class ShopsFragment extends android.support.v4.app.Fragment {

    //constructor
    public   ShopsFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();

        places.add(new Places(R.string.Name_Nakheel, R.string.Des_Nakheel, R.drawable.nakheel));
        places.add(new Places(R.string.Name_Riyadh_Gallery, R.string.Des_Riyadh_Gallery, R.drawable.riyadh_gallery));
        places.add(new Places(R.string.Name_Granada, R.string.Des_Granada, R.drawable.granada_center));


        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places );

        ListView listView =  rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
