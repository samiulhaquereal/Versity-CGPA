package com.example.cgpa_calculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter2 extends BaseAdapter {

    String[] sub;
    String[] result;
    String[] credit;
    String[] code;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter2(Context context, String[] sub, String[] result ,String[] credit,String[] code){

        this.context=context;
        this.sub = sub;
        this.result = result;
        this.credit = credit;
        this.code = code;

    }


    @Override
    public int getCount() {
        return sub.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sempledetails,viewGroup,false);

        }
        TextView tt = view.findViewById(R.id.id1);
        TextView textView = view.findViewById(R.id.id2);
        TextView textView2 = view.findViewById(R.id.id3);
        TextView textView3 = view.findViewById(R.id.id4);

        tt.setText(result[i]);
        textView.setText(sub[i]);
        textView2.setText(credit[i]);
        textView3.setText(code[i]);
        return view;
    }
}
