package com.example.android.mytourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem (int position)
    {
        switch (position)
        {
            case 0 : return new SightsFragment();
            case 1 : return new ShopsFragment();
            case 2 : return new EventsFragment();

            default:
                return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 4;
    }
}

