package com.example.cgpa_calculator;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class chart extends Fragment implements AdapterView.OnItemClickListener {
    private TextView textView;
    private String[] sub;
    private String[] result;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chart, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        sub = getResources().getStringArray(R.array.semester);
        result = getResources().getStringArray(R.array.result);
        textView = view.findViewById(R.id.textviewidchart);
        textView.setText("Semesters");


        ListView listView = (ListView) view.findViewById(R.id.customlistid);
        CustomAdapter adapter = new CustomAdapter(getActivity(),sub,result);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //String value = sub[i];
        //Toast.makeText(getActivity(), value, Toast.LENGTH_SHORT).show();

        startActivity(new Intent(getContext(),details.class));


    }
}