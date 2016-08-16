package com.project.notifuzz;


import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ListViewAdapter extends BaseAdapter {
    private Activity context;
    private ArrayList<Bitmap> bitmaps;
    private ArrayList<String> appName;
    private ArrayList<String> notiHead;
    private ArrayList<String> notiContent;
    private ArrayList<String> id;

    public ListViewAdapter(Activity context,ArrayList<Bitmap>bitmaps,ArrayList<String> appName,ArrayList<String> notiHead,ArrayList<String> notiContent,ArrayList<String>id) {
        super();
        this.context = context;
        this.bitmaps=bitmaps;
        this.appName = appName;
        this.notiHead = notiHead;
        this.notiContent = notiContent;
        this.id=id;
    }

    public int getCount() {
        return appName.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        try {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_card, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            imageView.setImageBitmap(bitmaps.get(position));

            TextView t = (TextView) convertView.findViewById(R.id.textView2);
            t.setText(appName.get(position) + "");
            t = (TextView) convertView.findViewById(R.id.textView3);
            t.setText(notiHead.get(position) + "");
            t = (TextView) convertView.findViewById(R.id.textView);
            t.setText(notiContent.get(position) + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return convertView;
    }
}