package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class empdetail extends AppCompatActivity {

    TextView detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empdetail);
        detail=findViewById(R.id.detail);

        Intent intent=getIntent();
        intent.getStringExtra("Emp Name");
        detail.setText(intent.getStringExtra("Emp Name"));



    }
}