package com.example.puc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fragMaterial extends AppCompatActivity {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_material);

        b1= (Button) findViewById(R.id.button2);
        b2= (Button) findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentOne());
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FragmentTwo());
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();

        ft.replace(R.id.fragment_section, fragment);
        ft.commit();



    }
}