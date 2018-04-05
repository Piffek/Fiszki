package com.example.patrykpiwko.fiszki.fragments.pages.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.patrykpiwko.fiszki.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ScreenPageAdapter extends PagerAdapter {

    private Context ctx;
    private LayoutInflater layoutInflater;
    ArrayList<String> listOfWord = new ArrayList<String>();


    public ScreenPageAdapter(Context ctx){
        this.ctx = ctx;
        listOfWord.add("Movie");
        listOfWord.add("Movie2");
        listOfWord.add("Dog");
        listOfWord.add("Mobile");
        listOfWord.add("Phone");
    }

    @Override
    public int getCount() {
        return listOfWord.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.fragment_screen_page, container, false);
        TextView textView = (TextView) item_view.findViewById(R.id.englishText);
        textView.setText("Word: "+listOfWord.get(position)+" is on position "+position);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
