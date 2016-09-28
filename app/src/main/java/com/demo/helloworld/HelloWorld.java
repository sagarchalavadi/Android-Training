package com.demo.helloworld;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by SagarCh on 9/13/2016.
 */
public class HelloWorld extends Activity {

    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        Button doSomeAction  = (Button)findViewById(R.id.do_some_action);//null
        doSomeAction.setOnClickListener(new MyButtonClickListener());
        System.out.println("HelloWorld- onCreate()");
    }

    class MyButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            String uname = username.getText().toString();
            String pwd = password.getText().toString();
            if(uname.length() <= 0){
                Toast.makeText(HelloWorld.this, "User Name should not be empty", Toast.LENGTH_SHORT)
                        .show();
                return;
            }
            if(pwd.length() <= 0){
                Toast.makeText(HelloWorld.this, "Password should not be empty", Toast.LENGTH_SHORT)
                        .show();
                return;
            }
            Intent intent = new Intent(HelloWorld.this, SecondActivity.class);
            intent.putExtra("username", uname);
            intent.putExtra("password", pwd);
            startActivity(intent);
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("HelloWorld- onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("HelloWorld- onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("HelloWorld- onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("HelloWorld- onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("HelloWorld- onDestroy()");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(HelloWorld.this, "Leaving the Application", Toast.LENGTH_SHORT).show();

    }
}

//Activity
//Service
//Receiver
//Provider
