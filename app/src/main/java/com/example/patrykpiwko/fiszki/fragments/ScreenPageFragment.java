package com.example.patrykpiwko.fiszki.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.example.patrykpiwko.fiszki.R;
import com.example.patrykpiwko.fiszki.base.BaseFragment;
import com.example.patrykpiwko.fiszki.fragments.adapter.ScreenPageAdapter;
import java.util.ArrayList;

import butterknife.BindView;

public class ScreenPageFragment extends BaseFragment {

    @BindView(R.id.pager)
    ViewPager viewPager;

    private Context ctx;
    ScreenPageAdapter mPageAdapter;
    ArrayList<String> listOfWord = new ArrayList<String>();

    public ScreenPageFragment(){
        super();
        listOfWord.add("Movie");
        listOfWord.add("Movie2");
        listOfWord.add("Dog");
        listOfWord.add("Mobile");
        listOfWord.add("Phone");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPageAdapter = new ScreenPageAdapter(getFragmentManager(), listOfWord);
        viewPager.setAdapter(mPageAdapter);
    }

    @Override
    public String getTitle() {
        return "Fragment";
    }

    public int getContentFragment() {
        return R.layout.fragment_screen_page;
    }


}
