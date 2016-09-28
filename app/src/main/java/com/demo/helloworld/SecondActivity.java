package com.demo.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String username = getIntent().getStringExtra("username");
        System.out.println("Second Activity - onCreate()");
        TextView uName = (TextView)findViewById(R.id.username);
        uName.setText("Logged In as:" + username);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Second Activity - onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Second Activity - onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Second Activity - onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Second Activity - onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Second Activity - onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Second Activity - onDestroy()");
    }
}
