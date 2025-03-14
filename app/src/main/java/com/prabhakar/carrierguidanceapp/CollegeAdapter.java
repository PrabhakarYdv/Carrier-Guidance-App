package com.prabhakar.carrierguidanceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CollegeAdapter extends RecyclerView.Adapter<CollegeViewHolder> {

    private ArrayList<ResponseModel> completeList;
    private ArrayList<ResponseModel> filterList;

    public CollegeAdapter(ArrayList<ResponseModel> filterList) {
        this.filterList = filterList;
        this.completeList=new ArrayList<>(filterList);
    }

    @NonNull
    @Override
    public CollegeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.colleges_layout, parent, false);
        return new CollegeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CollegeViewHolder holder, int position) {
        ResponseModel model = filterList.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return filterList.size();
    }


    public void filter(String text) {
        filterList.clear();
        if (text.isEmpty()) {
            filterList.addAll(completeList);
        } else {
            text = text.toLowerCase();
            for (ResponseModel data : completeList) {
                if (data.collegeName.toLowerCase().contains(text) ||
                        data.role.toLowerCase().contains(text) ||
                        containsSector(data.sectors, text)) {
                    filterList.add(data);
                }
            }
        }
        notifyDataSetChanged();
    }

    private boolean containsSector(List<String> sectors, String query) {
        for (String sector : sectors) {
            if (sector.toLowerCase().contains(query)) return true;
        }
        return false;
    }
}
