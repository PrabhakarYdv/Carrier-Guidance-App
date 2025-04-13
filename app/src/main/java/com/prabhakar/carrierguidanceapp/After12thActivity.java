package com.prabhakar.carrierguidanceapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;


public class After12thActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generic_list);

        setTitle("After 12th");

        List<String> courses = Arrays.asList(
                "Engineering (B.Tech, B.E.)",
                "Medical (MBBS, BDS, BHMS)",
                "Commerce (B.Com, CA, CS)",
                "Arts & Humanities (BA, BFA, BSW)",
                "Science (B.Sc, BCA, B.Sc IT)",
                "Design & Fashion (B.Des, B.FTech)"
        );

        ListView listView = findViewById(R.id.genericList);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, courses));

    }
}