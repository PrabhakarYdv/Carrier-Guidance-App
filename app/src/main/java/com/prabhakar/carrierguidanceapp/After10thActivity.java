package com.prabhakar.carrierguidanceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class After10thActivity extends AppCompatActivity {

    private final List<String> courses = Arrays.asList(
            "Diploma in Engineering (Polytechnic)",
            "ITI – Electrician, Fitter, Mechanic",
            "Paramedical – DMLT, ANM, GNM",
            "Fashion Designing",
            "Graphic & Web Design",
            "Data Entry & Computer Courses"
    );



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after10th);

        setTitle("After 10th Options");

        RecyclerView recyclerView = findViewById(R.id.recyclerAfter10th);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new TrendingCoursesAdapter(courses, course -> {
            Toast.makeText(this, "Selected: " + course, Toast.LENGTH_SHORT).show();
        }));
//        recyclerView.setAdapter(adapter);

    }
}