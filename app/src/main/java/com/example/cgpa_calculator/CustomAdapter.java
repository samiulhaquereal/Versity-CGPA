package com.example.cgpa_calculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    //int[] flags;
    //String[] countrynam;
    String[] sub;
    String[] result;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context,String[] sub,String[] result){
        this.context=context;
        //this.countrynam = countrynam;
        this.sub = sub;
        this.result = result;
        //this.flags = flags;
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
            view = inflater.inflate(R.layout.custom_listview_semple,viewGroup,false);

        }
        TextView tt = view.findViewById(R.id.imagevewid);
        TextView textView = view.findViewById(R.id.textviewlistid1);

        tt.setText(result[i]);
        textView.setText(sub[i]);
        return view;
    }
}
