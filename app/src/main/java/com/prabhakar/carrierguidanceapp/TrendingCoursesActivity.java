package com.prabhakar.carrierguidanceapp;

import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TrendingCoursesActivity extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending_courses);
        setContentView(R.layout.activity_generic_list);
        setTitle("Trending Courses");

        String[] courses = {
                "Data Science with Python",
                "UI/UX Design",
                "AI & Machine Learning",
                "Cybersecurity Fundamentals",
                "Blockchain & Web3",
                "Digital Marketing Mastery"
        };

        ListView listView = findViewById(R.id.genericList);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, courses));
    }
}