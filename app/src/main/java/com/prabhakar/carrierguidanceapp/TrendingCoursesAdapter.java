package com.prabhakar.carrierguidanceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.stream.Collectors;

public class TrendingCoursesAdapter extends RecyclerView.Adapter<TrendingCoursesAdapter.CourseViewHolder> implements Filterable {

    private List<String> originalList;
    private List<String> filteredList;
    private final OnClickListener onClick;

    public TrendingCoursesAdapter(List<String> originalList, OnClickListener onClick) {
        this.originalList = originalList;
        this.filteredList = originalList;
        this.onClick = onClick;
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView courseName;

        public CourseViewHolder(View itemView) {
            super(itemView);
            courseName = itemView.findViewById(R.id.textCourseName);
        }
    }

    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_course, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CourseViewHolder holder, int position) {
        String course = filteredList.get(position);
        holder.courseName.setText(course);
        holder.itemView.setOnClickListener(v -> {
            v.startAnimation(AnimationUtils.loadAnimation(v.getContext(), android.R.anim.fade_in));
            onClick.onClick(course);
        });
    }

    @Override
    public int getItemCount() {
        return filteredList.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                if (constraint == null || constraint.length() == 0) {
                    results.values = originalList;
                } else {
                    List<String> filtered = originalList.stream()
                            .filter(item -> item.toLowerCase().contains(constraint.toString().toLowerCase()))
                            .collect(Collectors.toList());
                    results.values = filtered;
                }
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                filteredList = (List<String>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public void updateData(List<String> newData) {
        filteredList = newData;
        notifyDataSetChanged();
    }

    public interface OnClickListener {
        void onClick(String course);
    }
}