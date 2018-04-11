package com.example.patrykpiwko.fiszki.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.example.patrykpiwko.fiszki.R;
import com.example.patrykpiwko.fiszki.base.BaseFragment;
import com.example.patrykpiwko.fiszki.fragments.adapter.ScreenPageAdapter;
import com.example.patrykpiwko.fiszki.models.Word;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ScreenPageFragment extends BaseFragment {

    @BindView(R.id.pager)
    ViewPager viewPager;

    private Context ctx;
    ScreenPageAdapter mPageAdapter;
    List<Word> listOfWord = new ArrayList<>();


    public ScreenPageFragment(){
        super();
    }

    List<Word> getWordList(){
        Word word = new Word("Word");
        listOfWord.add(word);

        word = new Word("Dog");
        listOfWord.add(word);

        word = new Word("Movie");
        listOfWord.add(word);

        return listOfWord;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPageAdapter = new ScreenPageAdapter(getFragmentManager(), getWordList());
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