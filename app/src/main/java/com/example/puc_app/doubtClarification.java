package com.example.puc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.Button;
import android.widget.Toast;

public class doubtClarification extends AppCompatActivity {

    EditText text;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doubt_clarification);

        text= (EditText) findViewById(R.id.editEmailId);
        b1=(Button) findViewById(R.id.logIn);
        b2=(Button) findViewById(R.id.logIn2);
        b3=(Button) findViewById(R.id.logIn3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Message sent to Teacher",Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Message sent to Friend",Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Message sent to Senior",Toast.LENGTH_SHORT).show();
            }
        });

    }
}