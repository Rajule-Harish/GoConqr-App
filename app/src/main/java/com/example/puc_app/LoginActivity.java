package com.example.puc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    EditText eme1,pse1;
    TextInputLayout eml1,psl1;
    private DatabaseHelper databaseHelper;
    private InputValidation inputValidation;
    Button login;
    TextView reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eme1 = (EditText) findViewById(R.id.editEmailId);
        pse1 = (EditText) findViewById(R.id.editPassWord);

        eml1 = (TextInputLayout) findViewById(R.id.emailId);
        psl1 = (TextInputLayout) findViewById(R.id.PassWord);

        login=(Button) findViewById(R.id.logIn);
        reg=(TextView) findViewById(R.id.textView4);

        databaseHelper= new DatabaseHelper(LoginActivity.this);
        inputValidation=new InputValidation(getApplicationContext());


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!inputValidation.isEditTextFilled(eme1,eml1,"This field is necessary"))
                {
                    return;
                }
                if(!inputValidation.isEmailValid(eme1,eml1,"Enter Valid Email"))
                {
                    return;
                }
                if(!inputValidation.isEditTextFilled(pse1,psl1,"This field is necessary"))
                {
                    return;
                }

                if(databaseHelper.checkUser(eme1.getText().toString().trim(), pse1.getText().toString().trim()))
                {

                    Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();
                    //emptyInputEditText();

                    Intent accIntent = new Intent(getApplicationContext(), HomeActivity.class);
                    accIntent.putExtra("Email",eme1.getText().toString().trim());
                    startActivity(accIntent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
                    Intent accIntent = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(accIntent);



                }




            }


        });
    }
}