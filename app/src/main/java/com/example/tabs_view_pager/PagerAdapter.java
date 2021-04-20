package com.example.tabs_view_pager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int no_of_tabs;

    public PagerAdapter(FragmentManager fm, int no_of_tabs) {
        super(fm);
        this.no_of_tabs = no_of_tabs;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        if (position == 0) {
            fragment = new BlankFragment();
        } else if (position == 1) {
            fragment = new BlankFragment2();
        } else if (position == 2) {
            fragment = new BlankFragment3();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return no_of_tabs;
    }
}
