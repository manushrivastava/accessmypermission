package com.example.manushrivastava.accessmypermission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void call1(android.view.View v)
    {
        Intent i = new Intent();
        i=i.setClassName("com.example.manushrivastava.mypermission", "com.example.manushrivastava.mypermission.Activity1");
        startActivity(i);
    }
    public void call2(android.view.View view)
    {
        Intent i = new Intent();
        i=i.setClassName("com.example.manushrivastava.mypermission", "com.example.manushrivastava.mypermission.Activity2");
        startActivity(i);
    }
}