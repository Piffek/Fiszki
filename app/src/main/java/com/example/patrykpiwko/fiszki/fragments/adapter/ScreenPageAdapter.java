package com.example.patrykpiwko.fiszki.fragments.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

public class ScreenPageAdapter extends FragmentPagerAdapter {

    private List<String> items;

    public ScreenPageAdapter(FragmentManager fm, List<String> items) {
        super(fm);
        this.items = items;
    }

    @Override
    public Fragment getItem(int position) {
        return ItemFragment.create(items.get(position));
    }

    @Override
    public int getCount() {
        return items.size();
    }

}