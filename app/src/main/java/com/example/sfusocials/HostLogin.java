package com.example.sfusocials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HostLogin extends AppCompatActivity {

    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_login);

        LoginButton = (Button) findViewById((R.id.LoginButton));

        LoginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Login(); //TODO: Authentication for the host here.
            }
        });
    }

    public void Login() {
        Intent intent = new Intent(this, HostHome.class);
        startActivity(intent);
    }
}

