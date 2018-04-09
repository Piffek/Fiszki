package com.example.patrykpiwko.fiszki.fragments.adapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.example.patrykpiwko.fiszki.R;
import com.example.patrykpiwko.fiszki.base.BaseFragment;

import butterknife.BindView;

public class ItemFragment extends BaseFragment {

    public static ItemFragment create(String title){
        ItemFragment itemFragment = new ItemFragment();
        itemFragment.setItem(title);
        return itemFragment;
    }

    @BindView(R.id.exampleTitle)
    TextView exampleTitle;

    private String item;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        exampleTitle.setText(getItem());
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public int getContentFragment() {
        return R.layout.fragment_item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
