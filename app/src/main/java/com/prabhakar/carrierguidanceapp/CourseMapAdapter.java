package com.prabhakar.carrierguidanceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CourseMapAdapter extends RecyclerView.Adapter<CourseMapAdapter.ViewHolder> {

    private final List<Map.Entry<String, String>> courseList;
    private int expandedPosition = -1; // Track the expanded item

    public CourseMapAdapter(Map<String, String> courseMap) {
        // Convert Map to List of Map.Entry
        this.courseList = new ArrayList<>(courseMap.entrySet());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_course, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Map.Entry<String, String> courseEntry = courseList.get(position);
        holder.textCourseName.setText(courseEntry.getKey());
        holder.textCourseDescription.setText(courseEntry.getValue());

        // Expand or collapse based on the position
        boolean isExpanded = position == expandedPosition;
        holder.textCourseDescription.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

        // Toggle expansion/collapse when card is clicked
        holder.cardView.setOnClickListener(v -> {
            // Update the expanded position and notify the adapter
            expandedPosition = (expandedPosition == position) ? -1 : position;
            notifyItemChanged(position); // Update only the clicked item
        });
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textCourseName;
        TextView textCourseDescription;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textCourseName = itemView.findViewById(R.id.textCourseName);
            textCourseDescription = itemView.findViewById(R.id.textExpandableDetails);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}