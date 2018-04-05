package com.example.patrykpiwko.fiszki.fragments.pages.adapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.patrykpiwko.fiszki.R;
import com.example.patrykpiwko.fiszki.base.BaseFragment;

public class ScreenPageFragment extends BaseFragment {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public String getTitle() {
        return "Word";
    }

    @Override
    public int getContentFragment() {
        return R.layout.fragment_screen_page;
    }
}
