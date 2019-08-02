package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.TextView;

public class act extends AppCompatActivity
{
    TextView t1; String msg="";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_act);
        t1 = findViewById(R.id.welcome);
        Intent intent = getIntent();
        msg = intent.getStringExtra("message");
        t1.setText("Welcome " + msg);
    }
}
