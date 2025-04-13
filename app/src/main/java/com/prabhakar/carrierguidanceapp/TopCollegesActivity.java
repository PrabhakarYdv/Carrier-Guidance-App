package com.prabhakar.carrierguidanceapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class TopCollegesActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_colleges);
        setContentView(R.layout.activity_generic_list);

        setTitle("Top Colleges in India");

        String[] colleges = {
                "IIT Bombay",
                "IIT Delhi",
                "AIIMS Delhi",
                "St. Stephen's College",
                "IIM Ahmedabad",
                "NIFT Delhi",
                "Delhi University"
        };

        ListView listView = findViewById(R.id.genericList);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, colleges));
    }
}