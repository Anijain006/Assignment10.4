package com.animeshjain.assignment104;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jain on 11-12-2017.
 */

public class AudioTab extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=getLayoutInflater().inflate(R.layout.audio_tab,container,false);
        TextView textView=(TextView)view.findViewById(R.id.tab1tv);
        textView.setText("Welcome to Audio section");
        return view;
    }
}
