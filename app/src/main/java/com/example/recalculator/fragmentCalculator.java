package com.example.recalculator;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class fragmentCalculator extends Fragment {

    public fragmentCalculator() {
    }
    public static fragmentCalculator newInstance() {
        fragmentCalculator fragment = new fragmentCalculator();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String text = null;
        TextView textRes = view.findViewById(R.id.text_res);
        initButton(view,textRes,text);
    }

    private void initButton(View view,TextView textRes,String text) {
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
        Button button0 = view.findViewById(R.id.button_0);
    }


}