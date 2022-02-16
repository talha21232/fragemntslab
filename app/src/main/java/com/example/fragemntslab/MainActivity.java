package com.example.fragemntslab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment1 fregment1 = new Fragment1();
        getSupportFragmentManager().beginTransaction().add(R.id.fregment1,fregment1).commit();
    }
}