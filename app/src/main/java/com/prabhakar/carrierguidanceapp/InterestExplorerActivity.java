package com.prabhakar.carrierguidanceapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class InterestExplorerActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_explorer);
        setContentView(R.layout.activity_generic_list);

        setTitle("Explore by Interest");

        String[] areas = {
                "I love problem-solving → Engineering, Data Science",
                "I'm artistic → Design, Animation, Fashion",
                "I enjoy talking to people → Marketing, HR, Journalism",
                "I like helping others → Medicine, Psychology, Social Work"
        };

        ListView listView = findViewById(R.id.genericList);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, areas));
    }
}