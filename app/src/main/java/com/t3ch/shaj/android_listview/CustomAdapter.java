package com.t3ch.shaj.android_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] leftImages;
    String[] divisionNames;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter(Context context, String[] divisionNames, int[] leftImages) {

        this.context = context;
        this.divisionNames = divisionNames;
        this.leftImages = leftImages;

    }


    @Override
    public int getCount() {
        return divisionNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.base_view, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.leftImageView_ID);
        TextView textView = convertView.findViewById(R.id.DivisionName_ID);

        imageView.setImageResource(leftImages[position]);
        textView.setText(divisionNames[position]);


        return convertView;
    }
}
