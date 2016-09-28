package com.demo.helloworld;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        GridView lv = (GridView) findViewById(R.id.list_view);

        String[] countries = {"India", "USA", "UK", "Australia"};
//        List<String> students = new ArrayList<>();

        MyArrayAdapter adapter = new MyArrayAdapter(ListViewActivity.this,
                R.layout.list_item);

        lv.setAdapter(adapter);


    }

    class MyArrayAdapter extends BaseAdapter {
        List<String> students = new ArrayList<>();
        int resource;
        public MyArrayAdapter(Context context, int resource) {
            students.add("Gana");
            students.add("Madhu");
            students.add("Sumanth");
            students.add("Snigdha");
            students.add("Bharani");
            students.add("Vinaya");
            this.resource = resource;
        }

        @Override
        public int getCount() {
            return students.size();
        }

        @Override
        public Object getItem(int position) {
            return students.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(ListViewActivity.this).inflate(R.layout.list_item, null);
            LinearLayout llayout = (LinearLayout) view.findViewById(R.id.list_item_container);
            if(position%2 == 0){
                llayout.setBackgroundColor(Color.parseColor("#ff0000"));
            } else {
                llayout.setBackgroundColor(Color.parseColor("#00ff00"));
            }
            TextView textView  = (TextView) view.findViewById(R.id.textview);
            textView.setText(students.get(position));
            return view;
        }
    }


}
