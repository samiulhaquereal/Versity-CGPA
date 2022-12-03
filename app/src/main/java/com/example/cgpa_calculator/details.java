package com.example.cgpa_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ListView;

public class details extends AppCompatActivity {
    private String[] sub;
    private String[] result;
    private String[] credit;
    private String[] code;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().hide();


        sub = getResources().getStringArray(R.array.subject);
        result = getResources().getStringArray(R.array.result);
        credit = getResources().getStringArray(R.array.credit);
        code = getResources().getStringArray(R.array.code);
        listView =findViewById(R.id.sublistid);

        CustomAdapter2 adapter = new CustomAdapter2(this,sub,result,credit,code);
        listView.setAdapter(adapter);

    }
}