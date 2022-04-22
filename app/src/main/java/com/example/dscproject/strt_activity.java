package com.example.dscproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class strt_activity extends AppCompatActivity {


    public void fun(View view){
    Intent intent = new Intent(strt_activity.this,MainActivity.class);
    startActivity(intent);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strt);
        getSupportActionBar().hide();
    }
}