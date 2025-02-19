package com.prabhakar.carrierguidanceapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ramotion.foldingcell.FoldingCell;

public class CollegeViewHolder extends RecyclerView.ViewHolder {
    TextView roleBefore, clg, role, college, rating, cutoff, tier, address, sectors, admissionRequirement, collegeDetails;
    FoldingCell foldingCell;

    public CollegeViewHolder(@NonNull View itemView) {
        super(itemView);


        roleBefore = itemView.findViewById(R.id.role_before);
        clg = itemView.findViewById(R.id.clg);
        role = itemView.findViewById(R.id.role);
        college = itemView.findViewById(R.id.college);
        rating = itemView.findViewById(R.id.rating);
        cutoff = itemView.findViewById(R.id.cutoff);
        tier = itemView.findViewById(R.id.tier);
        address = itemView.findViewById(R.id.address);
        sectors = itemView.findViewById(R.id.sectors);
        admissionRequirement = itemView.findViewById(R.id.admission_requirement);
        collegeDetails = itemView.findViewById(R.id.college_details);

        foldingCell = itemView.findViewById(R.id.folding_cell);
    }

    public void setData(ResponseModel model) {
        roleBefore.setText(model.role);
        clg.setText(model.collegeName);
        role.setText(model.role);
        college.setText(model.collegeName);
        rating.setText(String.valueOf( model.rating));
        cutoff.setText(String.valueOf(model.cutoff));
        tier.setText(model.tier);
        address.setText(model.address);
//        sectors.setText(model.sector.toString());
        admissionRequirement.setText(model.admissionRequirement);
        collegeDetails.setText(model.collegeDetails);

//        foldingCell.toggle(false);
    }

}
