package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    Button addbtn;
    TextView edittextadd;
    ListView listView;
    ArrayList<String> emplist;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittextadd=findViewById(R.id.editTextadd);
        addbtn=findViewById(R.id.addbtn);

        listView=findViewById(R.id.employelist);

        emplist=new ArrayList<String>();
        emplist.add("Ali");
        emplist.add("Mohsin");
        emplist.add("Ahsan");
        emplist.add("Khurram");
        emplist.add("Nadeem");
        emplist.add("Nisar");
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,emplist);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("You Clicked",emplist.get(position));

                Intent intent=new Intent(MainActivity.this,empdetail.class);
                intent.putExtra("Emp Name",emplist.get(position));
                startActivity(intent);



            }
        });



    }

    public void addemp(View view) {

        emplist.add(edittextadd.getText().toString());

        adapter.notifyDataSetChanged();
       // Collections.sort(emplist);


    }
}