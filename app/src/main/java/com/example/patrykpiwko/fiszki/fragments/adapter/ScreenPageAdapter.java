package com.example.patrykpiwko.fiszki.fragments.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.patrykpiwko.fiszki.models.Word;

import java.util.ArrayList;
import java.util.List;

public class ScreenPageAdapter extends FragmentPagerAdapter {

    private List<Word> items;

    public ScreenPageAdapter(FragmentManager fm, List<Word> items) {
        super(fm);
        this.items = items;
    }

    @Override
    public Fragment getItem(int position) {
        return ItemFragment.create(items.get(position).getName());
    }

    @Override
    public int getCount() {
        return items.size();
    }

}