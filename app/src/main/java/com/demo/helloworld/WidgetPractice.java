package com.demo.helloworld;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Toast;

public class WidgetPractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widgets_android);
        Button button = (Button)findViewById(R.id.mybutton);
        //Listeners / Action
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "Button Long click has happened", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    System.out.println("Action down: X value:"+event.getX()+" Y value:"+event.getY());
                } else if(event.getAction() == MotionEvent.ACTION_MOVE){
                    System.out.println("Action move: X value:"+event.getX()+" Y value:"+event.getY());
                } else if(event.getAction() == MotionEvent.ACTION_UP){
                    System.out.println("Action up");
                }
                Toast.makeText(WidgetPractice.this, "OnTouch Listener touch method is called", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        ImageView image = (ImageView)findViewById(R.id.imageview);
//        image.setImageResource(R.mipmap.ic_launcher);
        image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        image.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
//Edit
        EditText editText = (EditText)findViewById(R.id.edittext);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Compound Views(Toggle Button, Radio Button, CheckBox & Switch)
        RadioButton radioButton = (RadioButton)findViewById(R.id.male);
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

        CheckBox checkBox = (CheckBox)findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

        Spinner spinner = (Spinner)findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = (String)parent.getItemAtPosition(position);
                Toast.makeText(WidgetPractice.this, "Selected Item is: "+item, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        RatingBar ratingBar = (RatingBar)findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }
        });

        WebView webView = (WebView)findViewById(R.id.webView);
        webView.loadUrl("http://www.google.com");
        webView.loadData("<html><body></body><h1>Hello</h1></html>","text/html", "utf-8");

    }


    public void myButtonClickAction(View v){
        Toast.makeText(getApplicationContext(), "Button click happened", Toast.LENGTH_SHORT).show();
    }
}
