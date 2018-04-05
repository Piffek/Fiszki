package com.example.patrykpiwko.fiszki.activities;

import android.content.Context;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.example.patrykpiwko.fiszki.R;
import com.example.patrykpiwko.fiszki.base.BaseActivity;
import com.example.patrykpiwko.fiszki.fragments.pages.adapter.ScreenPageAdapter;

import javax.xml.transform.sax.TemplatesHandler;

public class ScreenSlidePagerActivity extends BaseActivity {

    ViewPager viewPager;
    ScreenPageAdapter pageAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        viewPager = (ViewPager) findViewById(R.id.pager);
        pageAdapter = new ScreenPageAdapter(this);
        viewPager.setAdapter(pageAdapter);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_screen_slide_pager;
    }

    @Override
    protected int getFragmentContainer() {
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide_pager);
    }
}
