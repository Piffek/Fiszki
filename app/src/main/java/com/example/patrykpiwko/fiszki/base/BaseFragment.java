package com.example.patrykpiwko.fiszki.base;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.patrykpiwko.fiszki.activities.MainActivityInterface;
import butterknife.ButterKnife;


public abstract class BaseFragment extends Fragment{
    private NavigationInterface navigationInterface;
    private MainActivityInterface mainActivityInterface;
    public abstract String getTitle();
    public abstract int getContentFragment();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ButterKnife.bind(this, view);

        if(getMainActivityInterface() != null){
            getMainActivityInterface().setTitle(getTitle());
        }

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(getActivity() instanceof NavigationInterface){
            navigationInterface = (NavigationInterface) getActivity();
        }

        if(getActivity() instanceof MainActivityInterface){
            mainActivityInterface = (MainActivityInterface) getActivity();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getContentFragment(), container, false);
    }

    public MainActivityInterface getMainActivityInterface(){
        return mainActivityInterface;
    }

    public NavigationInterface getNavigationInterface(){
        return navigationInterface;
    }
}
