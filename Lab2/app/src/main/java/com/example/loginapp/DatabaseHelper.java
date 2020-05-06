package com.example.loginapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(@Nullable Context context) {
        super(context,"Login.db", null , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table user(email text primary key, FullName text, University text, Phone text, address text, Password text, Gender text, Branch  )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");

    }
    public boolean insert(String email, String FullName, String University, String Phone, String address, String Password, String Gender, String Branch)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("email",email);
        contentValues.put("FullName",FullName);
        contentValues.put("University",University);
        contentValues.put("Phone",Phone);
        contentValues.put("Password",Password);
        contentValues.put("Gender",Gender);
        contentValues.put("Branch",Branch);
        long ins= db.insert("user",null,contentValues);
        if(ins==-1) return false;
        else return true;




    }
    public Boolean checkemail(String email){
        SQLiteDatabase db= this.getReadableDatabase();
        Cursor cursor= db.rawQuery("Select * from user where email=?",new String[]{email});
        if(cursor.getCount()>0) return false;
        else return true;
    }
    public Boolean emailpassword(String email, String Password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor= db. rawQuery("select * from user where email=? and password=?", new String[]{email, Password});
        if(cursor.getCount()>0 ) return true;
        else return false;
    }
    public Cursor info(String email){
        SQLiteDatabase db =this.getReadableDatabase();
        Cursor cursor=db.rawQuery("select * from user where email=?",new String[]{email});
        return cursor;
    }

}
