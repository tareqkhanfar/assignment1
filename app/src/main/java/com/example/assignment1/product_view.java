package com.example.assignment1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class product_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Product View");
        setContentView(R.layout.activity_product_view);
    }


}