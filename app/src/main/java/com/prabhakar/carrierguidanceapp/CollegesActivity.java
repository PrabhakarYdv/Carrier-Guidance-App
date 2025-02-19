package com.prabhakar.carrierguidanceapp;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CollegesActivity extends AppCompatActivity {
    private EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);
        searchText = findViewById(R.id.search_text);


        searchText.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                if (motionEvent.getRawX() >= (searchText.getRight() - searchText.getCompoundDrawables()[2].getBounds().width())) {
                    Toast.makeText(CollegesActivity.this, "Icon CLicked", Toast.LENGTH_SHORT);
                    getData(searchText.getText().toString());
                    return true;
                }
            }
            return false;
        });
    }

    private void getData(String text) {
        APIService apiService = RetrofitClient.getInstance();
        Call<List<ResponseModel>> result = apiService.getDetails(text);
        result.enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Log.d("data", response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {
                Log.d("tag", t.getMessage());
            }
        });
    }

}