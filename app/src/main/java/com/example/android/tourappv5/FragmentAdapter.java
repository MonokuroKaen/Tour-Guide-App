package com.example.android.tourappv5;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;


/**
 * A {@link FragmentAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 * This adapter will display each fragment on the screen to user
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    FragmentAdapter(FragmentManager fm, MainActivity mainActivity) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TransportationFragment();
            case 1:
                return new SightseeingFragment();
            case 2:
                return new FoodFragment();
            case 3:
                return new ShoppingFragment();
        }
        return null;
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {

            case 0:
                return "Travel";
            case 1:
                return "Sightseeing";
            case 2:
                return "Food";
            case 3:
                return "Shop";
        }
        return null;
    }
}