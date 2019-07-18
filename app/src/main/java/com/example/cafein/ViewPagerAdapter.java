package com.example.cafein;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new CaffeineGraphFragment();

        else if (position == 1)
            return new CaffeineDrinkFragment();

        else
            return new UserProfileFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
