package com.example.patrykpiwko.fiszki.fragments.adapter;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.patrykpiwko.fiszki.R;
import com.example.patrykpiwko.fiszki.base.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class ItemFragment extends BaseFragment {

    public static ItemFragment create(String title){
        ItemFragment itemFragment = new ItemFragment();
        itemFragment.setItem(title);
        return itemFragment;
    }

    @BindView(R.id.exampleTitle)
    TextView exampleTitle;

    @BindView(R.id.parentLayout)
    View parentLayout;

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

    @OnClick(R.id.exampleTitle)
    public void clickToPager(){
        parentLayout.animate()
                .rotationBy(360)
                .setDuration(400)
                .setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        exampleTitle.setText("cos");
                    }
                })
                .start();
    }
}
