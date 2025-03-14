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
        roleBefore.setText(model.getRole());
        clg.setText(model.getCollegeName());
        role.setText(model.getRole());
        college.setText(model.getCollegeName());
        rating.setText(String.valueOf(model.getRating()));
        cutoff.setText(String.valueOf(model.getCutoff()));
        tier.setText(model.getTier());
        address.setText(model.getAddress());
        sectors.setText(model.getSectors().get(0).toString()+","+model.getSectors().get(1).toString()+","+model.getSectors().get(2));
        admissionRequirement.setText(model.getAdmissionRequirement());
        collegeDetails.setText(model.getCollegeDetails());

        foldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foldingCell.toggle(false);
            }
        });
    }
}