package com.prabhakar.carrierguidanceapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Map;

public class InterestExplorerActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_explorer);

        setTitle("Explore by Interest");

        Map<String, String> areas = Map.of(
                "I love problem-solving", "Engineering, Data Science",
                "I'm artistic", " Design, Animation, Fashion",
                "I enjoy talking to people", "Marketing, HR, Journalism",
                "I like helping others ", "Medicine, Psychology, Social Work"
        );

        RecyclerView listView = findViewById(R.id.recyclerViewInterest);
        listView.setLayoutManager(new LinearLayoutManager(this));
        listView.setAdapter(new CourseMapAdapter(areas));
    }
}