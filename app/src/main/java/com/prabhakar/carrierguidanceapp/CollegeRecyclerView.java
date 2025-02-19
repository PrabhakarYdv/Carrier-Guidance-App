package com.prabhakar.carrierguidanceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CollegeRecyclerView extends RecyclerView.Adapter<CollegeViewHolder> {

    ArrayList<ResponseModel> list;

    @NonNull
    @Override
    public CollegeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.colleges_layout, parent, false);
        return new CollegeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CollegeViewHolder holder, int position) {
        ResponseModel model = list.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
