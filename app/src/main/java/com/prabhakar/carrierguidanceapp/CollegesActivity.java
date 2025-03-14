package com.prabhakar.carrierguidanceapp;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CollegesActivity extends AppCompatActivity {
    private EditText searchText;
    private RecyclerView recyclerView;
    ArrayList<ResponseModel> dataList;
    CollegeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);
        searchText = findViewById(R.id.search_text);
        recyclerView = findViewById(R.id.recyclerView);
        dataList = new ArrayList<ResponseModel>();
        setData();
        setRecyclerView();

        if (searchText.getText() != null && !searchText.equals("")) {
            searchText.setOnTouchListener((view, motionEvent) -> {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    if (motionEvent.getRawX() >= (searchText.getRight() - searchText.getCompoundDrawables()[2].getBounds().width())) {
                        Toast.makeText(CollegesActivity.this, "Icon CLicked", Toast.LENGTH_SHORT);
//                        getData(searchText.getText().toString());
//                        setData();
//                        setRecyclerView();
                        searchText.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void onTextChanged(CharSequence text, int start, int before, int count) {
                                adapter.filter(text.toString());
                            }

                            @Override
                            public void afterTextChanged(Editable editable) {

                            }
                        });
                        return true;
                    }
                }
                return false;
            });
        }


    }


    private void getData(String text) {
        APIService apiService = RetrofitClient.getInstance();
        Call<List<ResponseModel>> result = apiService.getDetails(text);
        result.enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Log.d("data", response.body().toString());
                    dataList.addAll(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {
                Log.d("tag", t.getMessage());
            }
        });
    }


    private void setData() {
        dataList.add(new ResponseModel("001", "Engineering", "Indian Institute of Technology Bombay", 4.9, 99.5, "Tier 1", "Powai, Mumbai, Maharashtra", Arrays.asList("Technology", "Engineering", "Research"), "JEE Advanced", "IIT Bombay is one of India's premier engineering institutions known for research and innovation."));
        dataList.add(new ResponseModel("002", "Engineering", "Indian Institute of Technology Delhi", 4.8, 99.3, "Tier 1", "Hauz Khas, Delhi", Arrays.asList("Engineering", "AI", "Technology"), "JEE Advanced", "IIT Delhi is renowned for its cutting-edge research and strong industry collaborations."));
        dataList.add(new ResponseModel("003", "Management", "Indian Institute of Management Ahmedabad", 4.9, 99, "Tier 1", "Vastrapur, Ahmedabad, Gujarat", Arrays.asList("Business", "Finance", "Entrepreneurship"), "CAT", "IIM Ahmedabad is India's top B-school, known for its rigorous academic curriculum."));
        dataList.add(new ResponseModel("004", "Medical", "All India Institute of Medical Sciences (AIIMS), Delhi", 5, 99.8, "Tier 1", "Ansari Nagar, Delhi", Arrays.asList("Medicine", "Healthcare", "Research"), "NEET", "AIIMS Delhi is the top medical institution in India with world-class healthcare education."));
        dataList.add(new ResponseModel("005", "Law", "National Law School of India University (NLSIU), Bangalore", 4.8, 98.5, "Tier 1", "Nagarbhavi, Bangalore, Karnataka", Arrays.asList("Law", "Judiciary", "Public Policy"), "CLAT", "NLSIU is India's premier law school, producing top legal professionals."));
        dataList.add(new ResponseModel("006", "Engineering", "Indian Institute of Technology Madras", 4.8, 99.2, "Tier 1", "Chennai, Tamil Nadu", Arrays.asList("Engineering", "AI", "Research"), "JEE Advanced", "IIT Madras is one of the top institutes for engineering and technological research."));
        dataList.add(new ResponseModel("007", "Management", "Indian Institute of Management Bangalore", 4.8, 98.8, "Tier 1", "Bannerghatta Road, Bangalore, Karnataka", Arrays.asList("Finance", "Consulting", "Management"), "CAT", "IIM Bangalore is known for its leadership programs and business excellence."));
        dataList.add(new ResponseModel("008", "Medical", "Christian Medical College (CMC), Vellore", 4.7, 97.5, "Tier 1", "Vellore, Tamil Nadu", Arrays.asList("Healthcare", "Medical Research", "Public Health"), "NEET", "CMC Vellore is one of India's best medical institutions, known for patient care and research."));
        dataList.add(new ResponseModel("009", "Law", "National Academy of Legal Studies and Research (NALSAR), Hyderabad", 4.7, 98, "Tier 1", "Shamirpet, Hyderabad, Telangana", Arrays.asList("Law", "Judiciary", "Policy Making"), "CLAT", "NALSAR Hyderabad is among the top law schools in India, focusing on legal research."));
        dataList.add(new ResponseModel("010", "Engineering", "Birla Institute of Technology and Science (BITS), Pilani", 4.6, 95.5, "Tier 1", "Pilani, Rajasthan", Arrays.asList("Engineering", "Technology", "Startups"), "BITSAT", "BITS Pilani is a premier private engineering institution with strong industry ties."));
        dataList.add(new ResponseModel("011", "Management", "Faculty of Management Studies (FMS), Delhi", 4.6, 98.2, "Tier 1", "North Campus, Delhi University, Delhi", Arrays.asList("Business", "Finance", "Consulting"), "CAT", "FMS Delhi is one of the most affordable yet prestigious B-schools in India."));
        dataList.add(new ResponseModel("012", "Medical", "King George's Medical University (KGMU), Lucknow", 4.5, 97, "Tier 2", "Lucknow, Uttar Pradesh", Arrays.asList("Medicine", "Surgery", "Public Health"), "NEET", "KGMU Lucknow is a reputed medical institution known for quality education and healthcare services."));
        dataList.add(new ResponseModel("013", "Law", "The West Bengal National University of Juridical Sciences (WBNUJS), Kolkata", 4.6, 97.8, "Tier 1", "Salt Lake City, Kolkata, West Bengal", Arrays.asList("Legal Studies", "Advocacy", "Human Rights"), "CLAT", "WBNUJS is a top-tier law school producing competent legal professionals."));
        dataList.add(new ResponseModel("014", "Engineering", "Delhi Technological University (DTU), Delhi", 4.5, 94.5, "Tier 2", "Bawana Road, Delhi", Arrays.asList("Technology", "Engineering", "Software Development"), "JEE Main", "DTU is among India's best technological universities, excelling in research and innovation."));
        dataList.add(new ResponseModel("015", "Management", "Indian Institute of Management Calcutta", 4.8, 99.1, "Tier 1", "Joka, Kolkata, West Bengal", Arrays.asList("Finance", "Marketing", "Consulting"), "CAT", "IIM Calcutta is one of India's most prestigious business schools."));
        dataList.add(new ResponseModel("016", "Medical", "Maulana Azad Medical College (MAMC), Delhi", 4.7, 97.5, "Tier 1", "Bahadur Shah Zafar Marg, New Delhi", Arrays.asList("Medicine", "Surgery", "Research"), "NEET", "MAMC is one of India's top government medical colleges, known for excellent medical education and research."));
        dataList.add(new ResponseModel("017", "Engineering", "Vellore Institute of Technology (VIT), Vellore", 4.4, 93.5, "Tier 2", "Vellore, Tamil Nadu", Arrays.asList("Technology", "Software", "Research"), "VITEEE", "VIT is a top private engineering university known for its strong placement records."));
        dataList.add(new ResponseModel("018", "Law", "Gujarat National Law University (GNLU), Gandhinagar", 4.5, 96.8, "Tier 1", "Gandhinagar, Gujarat", Arrays.asList("Law", "Corporate Law", "International Law"), "CLAT", "GNLU is one of India's leading national law universities, offering excellent legal education."));
        dataList.add(new ResponseModel("019", "Management", "XLRI - Xavier School of Management, Jamshedpur", 4.7, 98, "Tier 1", "Jamshedpur, Jharkhand", Arrays.asList("HR", "Finance", "Entrepreneurship"), "XAT", "XLRI is one of India's top B-schools, known for its HR and business programs."));
        dataList.add(new ResponseModel("020", "Engineering", "National Institute of Technology (NIT), Trichy", 4.6, 95, "Tier 1", "Tiruchirappalli, Tamil Nadu", Arrays.asList("Engineering", "Software", "Robotics"), "JEE Main", "NIT Trichy is one of India's top NITs, providing quality engineering education and placements."));
        Collections.shuffle(dataList);
    }

    private void setRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CollegeAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }

}