package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    DatabaseHelper db;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8,ed9;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        db= new DatabaseHelper(this);
        ed1=(EditText)findViewById(R.id.editText3);
        ed2=(EditText)findViewById(R.id.editText4);
        ed3=(EditText)findViewById(R.id.editText5);
        ed4=(EditText)findViewById(R.id.editText10);
        ed5=(EditText)findViewById(R.id.editText11);
        ed6=(EditText)findViewById(R.id.editText6);
        ed7=(EditText)findViewById(R.id.editText7);
        ed8=(EditText)findViewById(R.id.editText8);
        ed9=(EditText)findViewById(R.id.editText9);
        b1=(Button)findViewById((R.id.button4));
        b2=(Button) findViewById(R.id.button6);
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(signup.this,MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1= ed1.getText().toString();
                String s2= ed2.getText().toString();
                String s3= ed3.getText().toString();
                String s4= ed4.getText().toString();
                String s5= ed5.getText().toString();
                String s6= ed6.getText().toString();
                String s7= ed7.getText().toString();
                String s8= ed8.getText().toString();
                String s9= ed9.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals("")||s7.equals("")||s8.equals("")||s9.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields are empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(s6.equals(s7)){
                        Boolean checkemail = db.checkemail(s1);
                        if(checkemail==true){
                            Boolean insert = db.insert(s1,s2,s3,s4,s5,s6,s8,s9);
                            if(insert==true){
                                Toast.makeText(getApplicationContext(),"Registered  Sucessfully", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Email Already Exists", Toast.LENGTH_SHORT).show();
                        }
                    }
                    Toast.makeText(getApplicationContext(),"password do not match", Toast.LENGTH_SHORT).show();
                }

            }


        });





    }
}
