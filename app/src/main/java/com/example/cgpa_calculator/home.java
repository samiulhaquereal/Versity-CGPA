package com.example.cgpa_calculator;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;


public class home extends Fragment {

    private float cgpa;
    private TextView result ,text;
    private String a ;
    CircularProgressBar circularProgressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        result = view.findViewById(R.id.text_view_progress);
        text = view.findViewById(R.id.text_view_progress2);

        circularProgressBar = view.findViewById(R.id.circularProgressBar);




        updateProgressBar();


        }


    @RequiresApi(api = Build.VERSION_CODES.O)
    private void updateProgressBar() {

            circularProgressBar.setProgressMax(4.00f);

            cgpa = (float) 3.55;

            circularProgressBar.setProgressWithAnimation(cgpa, Long.valueOf(1000));

            text.setText("CGPA");
            result.setText(""+cgpa);



    }


}
