package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class view extends AppCompatActivity {
    Button b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        b2 = (Button)findViewById(R.id.button5);
        t1=(TextView) findViewById(R.id.textView);
        DatabaseHelper db=new DatabaseHelper(this);
        String email= getIntent().getStringExtra("email");
        Cursor cursor=db.info(email);
        StringBuilder sb= new StringBuilder();

        while(cursor.moveToNext()){
            sb.append("\nWelcome "+cursor.getString(1)+"\n Your account details are follows\nEmail: "+ cursor.getString(0)+"\nuniversity: "+cursor.getString(2)+"\nnumber: "+cursor.getString(3)+"\nAddress: "+cursor.getString(4)+"\nGender: "+cursor.getString(6)+"\nBranch: "+cursor.getString(7));
        }

        t1.setText(sb);



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect = new Intent(view.this, MainActivity.class);
                startActivity(redirect);
            }
        });
    }
}
