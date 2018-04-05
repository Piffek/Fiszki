package com.example.patrykpiwko.fiszki.fragments.pages;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.patrykpiwko.fiszki.R;
import com.example.patrykpiwko.fiszki.base.BaseFragment;
import com.example.patrykpiwko.fiszki.fragments.pages.adapter.ScreenPageAdapter;

import butterknife.BindView;

public class ScreenPageFragment extends BaseFragment {

    @BindView(R.id.pager)
    ViewPager viewPager;


    ScreenPageAdapter pageAdapter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pageAdapter = new ScreenPageAdapter(getActivity());
        viewPager.setAdapter(pageAdapter);
    }

    @Override
    public String getTitle() {
        return "English Lesson";
    }

    @Override
    public int getContentFragment() {
        return R.layout.fragment_screen_page;
    }
}
