package com.example.sfusocials;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    Button HostButton;
    Button UserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HostButton = (Button) findViewById(R.id.Button1);
        UserButton = (Button) findViewById(R.id.Button2);

        HostButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openHost();
            }
        });

        UserButton.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View v){ openUser(); }
        });
    }

    public void openHost() {
        Intent intent = new Intent(this, HostLogin.class);
        startActivity(intent);
    }

    public void openUser(){
        Intent intent = new Intent(this, EventList.class);
        startActivity(intent);
    }
}

