package com.edupointbd.amirul.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ListFragmernt extends ListFragment {


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] courseTitles = getResources().getStringArray(R.array.courseTitles);
//        String[] courseTitles = getResources().getStringArray(R.array.courseTitles);
        ArrayAdapter<String> courseTitlesAdapter =
                new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_activated_1, courseTitles);

        setListAdapter(courseTitlesAdapter);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mycustomlistlayout, container, false);
    }
}
