package com.example.patrykpiwko.fiszki.activities;

import android.support.annotation.Nullable;
import android.os.Bundle;
import android.widget.TextView;
import com.example.patrykpiwko.fiszki.R;
import com.example.patrykpiwko.fiszki.base.BaseActivity;
import com.example.patrykpiwko.fiszki.fragments.ScreenPageFragment;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements MainActivityInterface{

    @BindView(R.id.topTitle)
    TextView topTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showFragment(new ScreenPageFragment());
    }

    @Override
    public void setTitle(String title){
        if(title != null){
            topTitle.setText(title);
        }
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected int getFragmentContainer() {
        return R.id.containerFragment;
    }
}
