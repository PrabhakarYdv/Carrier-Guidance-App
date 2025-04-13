package com.prabhakar.carrierguidanceapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuggestionsActivity extends AppCompatActivity {

    private Map<String, List<String>> suggestionMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions);

        Spinner spinner = findViewById(R.id.spinnerInterest);
        RecyclerView recycler = findViewById(R.id.recyclerSuggestions);

        List<String> interests = List.of("Technology", "Design", "Medical", "Business");
        TrendingCoursesAdapter adapter = new TrendingCoursesAdapter(List.of(), position -> {});

        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);

        spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, interests));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = interests.get(position);
                List<String> suggestions = suggestionMap.getOrDefault(selected, List.of());
                adapter.updateData(suggestions);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        suggestionMap.put("Technology", List.of("Software Developer", "Cybersecurity Analyst", "AI Researcher"));
        suggestionMap.put("Design", List.of("UI/UX Designer", "Graphic Artist", "Product Designer"));
        suggestionMap.put("Medical", List.of("Nurse", "Pharmacist", "Lab Technician"));
        suggestionMap.put("Business", List.of("Digital Marketer", "Sales Executive", "Entrepreneur"));
    }
}