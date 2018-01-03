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

public class EventsFragment extends android.support.v4.app.Fragment {

    //constructor
    public   EventsFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();

        places.add(new Places(R.string.Name_Eid_Al_Fitr, R.string.Des_Eid_Al_Fitr, R.drawable.eid_al_fitr));
        places.add(new Places(R.string.Name_Janadriyah, R.string.Des_Janadriyah, R.drawable.janadriyah));


        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places );

        ListView listView =  rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
