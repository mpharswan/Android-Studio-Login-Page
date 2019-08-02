package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.content.Intent;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button b1;
    EditText ed1, ed2; int c=3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        b1 = findViewById(R.id.button1);
        ed1 = findViewById(R.id.uid);
        ed2 = findViewById(R.id.pid);
    }

    public void valid(View v)
    {
        String name = ed1.getText().toString();
        String password = ed2.getText().toString();
        if(name.equalsIgnoreCase("dhruv") && password.equals("pass"))
        {
            Toast.makeText(getApplicationContext(), "Valid Credentials", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, act.class);
            intent.putExtra("message", name);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Invalid Username / Password", Toast.LENGTH_SHORT).show();

            if(c == 0)
            {
                Toast.makeText(getApplicationContext(), "Exceeded Maximum Attempt", Toast.LENGTH_SHORT).show();
                b1.setEnabled(false);
            }
            c--;
        }
    }

    public void reset(View v)
    {
        ed1.setText(""); ed2.setText("");
    }
}