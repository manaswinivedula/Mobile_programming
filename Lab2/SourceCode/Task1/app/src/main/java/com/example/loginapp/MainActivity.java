package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1,b2,b3;
    DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db= new DatabaseHelper(this);
        b1 = (Button) findViewById(R.id.button2);
        b2= (Button) findViewById(R.id.button);
        b3= (Button) findViewById(R.id.button3) ;
        ed1 = (EditText) findViewById(R.id.editText2);
        ed2 = (EditText) findViewById(R.id.editText);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.addCategory(i.CATEGORY_BROWSABLE);
    i.setData(Uri.parse("http://www.Facebook.com"));
startActivity(i);} });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = ed1.getText().toString();
                String Password = ed2.getText().toString();
                Boolean checkemailpassword = db.emailpassword(email, Password);


                if (checkemailpassword == true) {
                    Toast.makeText(getApplicationContext(), "Sucessfully Login", Toast.LENGTH_SHORT).show();
                    reDirectToHomePage( );



                } else
                    Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

            }

            }
        );
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect = new Intent(MainActivity.this, signup.class);
                startActivity(redirect);


            }


        });
    }
    public void reDirectToHomePage() {
        String email=ed1.getText().toString();
        Intent redirect = new Intent(MainActivity.this, view.class);
        redirect.putExtra("email",email);
        startActivity(redirect);
    }

}

