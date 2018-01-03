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

public class RestaurantsFragment extends android.support.v4.app.Fragment {

    //constructor
    public RestaurantsFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();

        places.add(new Places(R.string.Name_Najd_Village, R.string.Des_Najd_Village, R.drawable.najd_village));
        places.add(new Places(R.string.Name_Shezan, R.string.Des_Shezan, R.drawable.shezan));
        places.add(new Places(R.string.Name_Texas_De_Brazil, R.string.Des_Texas_De_Brazil, R.drawable.texas_de_brazil));


        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places );

        ListView listView =  rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}


