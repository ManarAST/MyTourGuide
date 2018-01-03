package com.example.android.mytourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by manar on 02/01/2018.
 */

public class SightsFragment extends android.support.v4.app.Fragment {

    //constructor
  public   SightsFragment(){
      // Required empty public constructor
  }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<>();


        places.add(new Places(R.string.Name_Masmak, R.string.Des_Masmak, R.drawable.masmak_image));
        places.add(new Places(R.string.Name_HeetCave, R.string.Des_HeetCave, R.drawable.heet_cave));
        places.add(new Places(R.string.Name_Dariyah, R.string.Des_Dariyah, R.drawable.diriyah));





        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places );

        ListView listView =  rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
